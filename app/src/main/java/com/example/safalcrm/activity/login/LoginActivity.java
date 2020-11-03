package com.example.safalcrm.activity.login;

import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;
import com.rilixtech.widget.countrycodepicker.CountryCodePicker;
//import com.example.safalcrm.Activity.DashBoard.DashboardActivity;
import com.example.safalcrm.Dialog.OTPDialogFragment;
import com.example.safalcrm.R;
import com.example.safalcrm.network.RestCall;
import com.example.safalcrm.network.RestClient;
import com.example.safalcrm.networkResponse.CommonResponse;
import com.example.safalcrm.networkResponse.LoginResponse;
import com.example.safalcrm.service.OtpReceivedInterface;
import com.example.safalcrm.service.SmsBroadcastReceiver;
import com.example.safalcrm.utillity.PreferenceManager;
import com.example.safalcrm.utillity.Tools;
import com.example.safalcrm.utillity.VariableBag;

import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.schedulers.Schedulers;

public class LoginActivity extends AppCompatActivity implements Validator.ValidationListener, OtpReceivedInterface {

    @NotEmpty
    @Length(max = 13, min = 8, message = "Enter valid mobile")
    @BindView(R.id.etLoginMobile_Email)
    AppCompatEditText etLoginMobileEmail;

    @BindView(R.id.BtnLogin)
    Button BtnLogin;

    @BindView(R.id.txt_register)
    TextView txtRegister;


    @BindView(R.id.tvTerms1)
    TextView tvTerms;

    @BindView(R.id.ccp)
    CountryCodePicker ccp;

    Validator validator;

    OTPDialogFragment payBillDialogFragment;

    String otp;
    String tokenStr;

    RestCall restCall;
    SmsBroadcastReceiver mSmsBroadcastReceiver;
    PreferenceManager preferenceManager;

    Tools tools;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        tools = new Tools(this);
        restCall = RestClient.createService(RestCall.class);
        preferenceManager = new PreferenceManager(this);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        tvTerms.setPaintFlags(tvTerms.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        tvTerms.setText(getString(R.string.terms_and_conditions));

        txtRegister.setPaintFlags(tvTerms.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        txtRegister.setText("REGISTER");

        validator = new Validator(this);
        validator.setValidationListener(this);


        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validator.validate();
            }
        });

        txtRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
//                    Intent intent = new Intent(LoginActivity.this, PaymentRegistration.class);
//                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        tvTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://zoobiz.in/termsConditions.php"));
                    String title = "Complete Action Using";
                    Intent chooser = Intent.createChooser(intent, title);
                    startActivity(chooser);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        mSmsBroadcastReceiver = new SmsBroadcastReceiver();

        mSmsBroadcastReceiver.setOnOtpListeners(this);

        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SmsRetriever.EXTRA_SMS_MESSAGE);
        intentFilter.addAction(SmsRetriever.EXTRA_STATUS);
        intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
        registerReceiver(mSmsBroadcastReceiver, intentFilter);

    }

    @Override
    protected void onStop() {
        try {
            if (mSmsBroadcastReceiver != null) {
                unregisterReceiver(mSmsBroadcastReceiver);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onStop();
    }


    @Override
    public void onValidationSucceeded() {
        callForOtp(false);
    }

    public void callForOtp(boolean isResend) {

        tools.showLoading();
        restCall.Login("user_login", ccp.getSelectedCountryCode(), etLoginMobileEmail.getText().toString().trim())
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(new Subscriber<CommonResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                tools.stopLoading();
                                Tools.toast(LoginActivity.this, getString(R.string.no_connection), VariableBag.Error);

                            }
                        });
                    }

                    @Override
                    public void onNext(CommonResponse commonResponse) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                tools.stopLoading();
                                if (commonResponse.getStatus().equalsIgnoreCase(VariableBag.SUCSESS_CODE)) {
                                    Tools.toast(LoginActivity.this, commonResponse.getMessage(), VariableBag.success);
                                    startSMSListener();
                                    if (!isResend) {
                                        OTPDialog();
                                    }

                                } else {
                                    Tools.toast(LoginActivity.this, commonResponse.getMessage(), VariableBag.Error);

                                }
                            }
                        });


                    }
                });


    }


    public void startSMSListener() {
        SmsRetrieverClient mClient = SmsRetriever.getClient(this);
        Task<Void> mTask = mClient.startSmsRetriever();
        mTask.addOnSuccessListener(aVoid -> {

        });
        mTask.addOnFailureListener(e -> Toast.makeText(LoginActivity.this, "Error", Toast.LENGTH_LONG).show());
    }

    private void OTPDialog() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        payBillDialogFragment = new OTPDialogFragment(Objects.requireNonNull(etLoginMobileEmail.getText()).toString());
        payBillDialogFragment.setCancelable(false);
        payBillDialogFragment.show(fragmentTransaction, "PayBillDialogFragment");

    }


    public void callNetwork(String otpStr, String tokenStr) {

        tools.showLoading();

        restCall.OTPVerify("user_verify", etLoginMobileEmail.getText().toString().trim(), otpStr, tokenStr, "android", Build.MODEL, Build.BRAND)
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(new Subscriber<LoginResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                tools.stopLoading();
                                Tools.toast(LoginActivity.this, getString(R.string.no_connection), VariableBag.Error);
                            }
                        });
                    }

                    @Override
                    public void onNext(LoginResponse loginResponse) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                tools.stopLoading();
                                if (loginResponse.getStatus().equalsIgnoreCase(VariableBag.SUCSESS_CODE)) {
                                    preferenceManager.setLoginSession();
                                    preferenceManager.setUserFullName(loginResponse.getUserFullName());
                                    preferenceManager.setUserEmail(loginResponse.getUserEmail());
                                    preferenceManager.setRegisteredUserId(loginResponse.getUserId());
                                    preferenceManager.setCountryId(loginResponse.getCountryId());
                                    preferenceManager.setStateId(loginResponse.getStateId());
                                    preferenceManager.setCityId(loginResponse.getCityId());
                                    preferenceManager.setAreaId(loginResponse.getAreaId());
                                    preferenceManager.setKeyValueString("mobile",loginResponse.getUserMobile());
                                    preferenceManager.setKeyValueString("companyLogo",loginResponse.getCompanyLogo());
                                    preferenceManager.setMobilePrivacy(loginResponse.getPublicMobile());
                                    preferenceManager.setKeyValueString("address",loginResponse.getAreaName() + " " + loginResponse.getCityName() + " " + loginResponse.getStateName() + " " + loginResponse.getCountryName() );
                                    preferenceManager.setWhatsAppPrivacy(loginResponse.getWhatsAppPrivacy());
                                    preferenceManager.setEmailPrivacy(loginResponse.getEmailPrivacy());
                                    preferenceManager.setClassifiedSound(loginResponse.getCllassifiedMute());
                                    preferenceManager.setObject(LoginResponse.class.getName(), loginResponse);
                                    preferenceManager.setKeyValueString("userProfile", loginResponse.getUserProfilePic());
                                    Tools.toast(LoginActivity.this, loginResponse.getMessage(), VariableBag.success);
//                                    startActivity(new Intent(LoginActivity.this, DashboardActivity.class));
                                    finish();
                                } else if (loginResponse.getStatus().equalsIgnoreCase("203")) {

                                    preferenceManager.setUserFullName(loginResponse.getUserFullName());
                                    preferenceManager.setRegisteredUserId(loginResponse.getUserId());
                                    preferenceManager.setCountryId(loginResponse.getCountryId());
                                    preferenceManager.setStateId(loginResponse.getStateId());
                                    preferenceManager.setCityId(loginResponse.getCityId());
                                    preferenceManager.setAreaId(loginResponse.getAreaId());
                                    preferenceManager.setKeyValueString("userProfile", loginResponse.getUserProfilePic());
                                    preferenceManager.setKeyValueString("companyLogo",loginResponse.getCompanyLogo());
                                    preferenceManager.setMobilePrivacy(loginResponse.getPublicMobile());
                                    preferenceManager.setWhatsAppPrivacy(loginResponse.getWhatsAppPrivacy());
                                    preferenceManager.setEmailPrivacy(loginResponse.getEmailPrivacy());
                                    preferenceManager.setClassifiedSound(loginResponse.getCllassifiedMute());
                                    preferenceManager.setObject(LoginResponse.class.getName(), loginResponse);
                                    Tools.toast(LoginActivity.this, loginResponse.getMessage(), VariableBag.success);
//                                    startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
//                                    finish();
                                } else {
                                    Tools.toast(LoginActivity.this, loginResponse.getMessage(), VariableBag.Error);
                                }
                            }
                        });
                    }
                });
    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {
        for (ValidationError error : errors) {
            View view = error.getView();
            String message = error.getCollatedErrorMessage(this);
            if (view instanceof EditText) {
                ((EditText) view).setError(message);
            } else {
                Toast.makeText(LoginActivity.this, message, Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    public void onOtpReceived(String otp2) {
        otp = otp2;
        char[] gfg = otp.toCharArray();
        payBillDialogFragment.setOtp(gfg);

    }

    @Override
    public void onOtpTimeout() {

    }
}
