package com.bacain.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.bacain.app.AppIntro;
import com.bacain.app.MainActivity;
import com.pspdfkit.app.R;

public class SplashActivity extends AppCompatActivity {


    private int waktu_loading = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        //setelah loading maka akan langsung berpindah ke home activity
                        Intent home = new Intent(SplashActivity.this, AppIntro.class);
                        startActivity(home);
                        finish();
                    }
                },waktu_loading);


    }
}