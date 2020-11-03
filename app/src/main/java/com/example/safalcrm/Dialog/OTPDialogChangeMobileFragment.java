package com.example.safalcrm.Dialog;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import com.google.android.material.textfield.TextInputEditText;
import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Length;
import com.mukesh.OtpView;
import com.example.safalcrm.R;
import com.example.safalcrm.network.RestCall;
import com.example.safalcrm.network.RestClient;
import com.example.safalcrm.networkResponse.CommonResponse;
import com.example.safalcrm.networkResponse.LoginResponse;
import com.example.safalcrm.utillity.PreferenceManager;
import com.example.safalcrm.utillity.Tools;
import com.example.safalcrm.utillity.VariableBag;

import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Subscriber;
import rx.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 */
public class OTPDialogChangeMobileFragment extends DialogFragment implements Validator.ValidationListener {

    @BindView(R.id.tv_coundown_otp)
    public TextView tv_coundown;
    @BindView(R.id.btn_resend_register)
    AppCompatTextView btn_resend_register;
    @Length(min = 8, max = 10, message = "Enter valid mobile number")
    @BindView(R.id.et_mobile_register)
    TextInputEditText mobile;
    @BindView(R.id.ib_truemobile_register)
    ImageButton truebtn;
    @BindView(R.id.done_btn)
    Button done_btn;
    @BindView(R.id.cancel_bt)
    Button cancel_bt;
    @BindView(R.id.otp_view)
    OtpView otp_view;
    RestCall restCall;
    Tools tools;
    LoginResponse loginResponse;
    private String mobileStr;
    private Validator validator;
    private PreferenceManager preferenceManager;
    private onUpdateClick onUpdateClick;

    public OTPDialogChangeMobileFragment() {
        // Required empty public constructor
    }

    public OTPDialogChangeMobileFragment(String toString) {
        this.mobileStr = toString;
    }

    public void setOnUpdateListeners(onUpdateClick onUpdateClick) {
        this.onUpdateClick = onUpdateClick;
    }

    @Override
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            //Objects.requireNonNull(getActivity()).getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        }
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.getWindow().requestFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

    @SuppressLint("UseRequireInsteadOfGet")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_o_t_p_dialog, container, false);
        preferenceManager = new PreferenceManager(Objects.requireNonNull(getActivity()));
        ButterKnife.bind(this, v);
        return v;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mobile.setText(mobileStr);

        mobile.setEnabled(false);
        mobile.setFocusable(false);
        preferenceManager = new PreferenceManager(getContext());
        tools = new Tools(getActivity());
        restCall = RestClient.createService(RestCall.class);
        loginResponse = preferenceManager.getObject(LoginResponse.class.getName(), LoginResponse.class);
        validator = new Validator(this);
        validator.setValidationListener(this);

        done_btn.setOnClickListener(view -> validator.validate());

        done_btn.setText("Verify");

        cancel_bt.setOnClickListener(v -> dismiss());

        countDownTimer();

    }

    @SuppressLint("UseRequireInsteadOfGet")
    @Override
    public void onValidationSucceeded() {
        String otpStr = Objects.requireNonNull(otp_view.getText()).toString();

        if (otpStr.trim().length() > 3) {
            verifyOTP(otpStr);
        } else {
            Tools.toast(getActivity(), "Enter valid OTP", 1);
        }
    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {
        for (ValidationError error : errors) {
            View view = error.getView();
            String message = error.getCollatedErrorMessage(getActivity());

            // Display error messages ;)
            if (view instanceof TextInputEditText) {
                ((TextInputEditText) view).setError(message);
            } else {
                Toast.makeText(getActivity(), message, Toast.LENGTH_LONG).show();
            }
        }
    }

    @SuppressLint({"SetTextI18n", "UseRequireInsteadOfGet"})
    public void setOtp(char[] gfg) {

        try {
            String Otp = String.valueOf(gfg[0]) + gfg[1] + gfg[2] + gfg[3];
            otp_view.setText(Otp);

            String otpStr = Objects.requireNonNull(otp_view.getText()).toString();
            verifyOTP(otpStr);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressLint("DefaultLocale")
    @OnClick(R.id.btn_resend_register)
    void Btn_resend_register() {
        btn_resend_register.setVisibility(View.GONE);
        Toast.makeText(getActivity(), "Resend ", Toast.LENGTH_SHORT).show();
        countDownTimer();
        tools.showLoading();
        restCall.changeMobileNumber("changeMobileNumber", mobileStr,
                preferenceManager.getRegisteredUserId())
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(new Subscriber<CommonResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Log.e("*** Error - ", e.getMessage());
                                tools.stopLoading();
                                Tools.toast(getActivity(), getString(R.string.no_connection), VariableBag.Error);
                            }
                        });
                    }

                    @Override
                    public void onNext(CommonResponse response) {
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                tools.stopLoading();
                                if (response.getStatus().equalsIgnoreCase(VariableBag.SUCSESS_CODE)) {
                                    Tools.toast(getActivity(), response.getMessage(), VariableBag.success);
                                } else {
                                    Tools.toast(getActivity(), response.getMessage(), VariableBag.Error);
                                }
                            }
                        });
                    }
                });
    }

    public void verifyOTP(String otp) {
        tools.showLoading();
        restCall.changeMobileNumberVerify("changeMobileNumberVerify", mobileStr, otp,
                preferenceManager.getRegisteredUserId())
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(new Subscriber<CommonResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Log.e("*** Error - ", e.getMessage());
                                tools.stopLoading();
                                Tools.toast(getActivity(), getString(R.string.no_connection), VariableBag.Error);
                            }
                        });
                    }

                    @Override
                    public void onNext(CommonResponse response) {
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                tools.stopLoading();
                                if (response.getStatus().equalsIgnoreCase(VariableBag.SUCSESS_CODE)) {
                                    loginResponse.setUserMobile(mobileStr);
                                    preferenceManager.setObject(LoginResponse.class.getName(),loginResponse);
                                    Tools.toast(getActivity(), response.getMessage(), VariableBag.success);
                                    onUpdateClick.onUpdate(true);
                                } else {
                                    onUpdateClick.onUpdate(false);
                                    Tools.toast(getActivity(), response.getMessage(), VariableBag.Error);
                                }
                            }
                        });
                    }
                });
    }

    private void countDownTimer() {
        CountDownTimer countDownTimer = new CountDownTimer(60000, 1000) {
            @Override
            public void onTick(long l) {
                String text = String.format(Locale.getDefault(), "%02d:%02d",
                        TimeUnit.MILLISECONDS.toMinutes(l) % 60,
                        TimeUnit.MILLISECONDS.toSeconds(l) % 60);
                tv_coundown.setText(text);
            }

            @SuppressLint("SetTextI18n")
            @Override
            public void onFinish() {

                truebtn.setVisibility(View.GONE);
                btn_resend_register.setVisibility(View.VISIBLE);
                tv_coundown.setText("00:00");

            }
        };
        countDownTimer.start();
    }


    public interface onUpdateClick {
        void onUpdate(boolean isUpdate);
    }
}
