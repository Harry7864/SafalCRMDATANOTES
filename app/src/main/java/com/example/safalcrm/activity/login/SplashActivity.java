package com.example.safalcrm.activity.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

//import com.example.safalcrm.Activity.DashBoard.DashboardActivity;
import com.example.safalcrm.R;
import com.example.safalcrm.utillity.AppSignatureHelper;
import com.example.safalcrm.utillity.PreferenceManager;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {

    @BindView(R.id.animate_progress_bar)
    ProgressBar animate_progress_bar;


    PreferenceManager preferenceManager;

    private Animation myAnim;

    CountDownTimer countDownTimer;

    int progress=0;

    ArrayList<String> appSignatures;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS );
        ButterKnife.bind(this);

        AppSignatureHelper appSignatureHelper = new AppSignatureHelper(this);
        appSignatures = appSignatureHelper.getAppSignatures();

        Log.e("@@##", appSignatures.toString());
        Log.i("@@##", appSignatures.toString());
        Log.d("@@##", appSignatures.toString());
        Log.v("@@##", appSignatures.toString());

        preferenceManager=new PreferenceManager(this);
        animate_progress_bar.setMax(30);

        startTimer();


    }


    public void startTimer(){

        countDownTimer=new CountDownTimer(3000,1000){
            @Override
            public void onTick(long millisUntilFinished) {
                progress=progress+10;

                animate_progress_bar.setProgress(progress);
            }

            @Override
            public void onFinish() {

                preferenceManager.setLogEntry(false);

                if (preferenceManager.getLoginSession()){
//                    startActivity(new Intent(SplashScreen.this, DashboardActivity.class));
                    finish();
                }else {
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();
                }
            }
        };

        countDownTimer.start();
    }
}
