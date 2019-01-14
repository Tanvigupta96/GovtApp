package com.example.tanvigupta.govtapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    Thread splashThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashThread = new Thread() {
            @Override
            public void run() {
                try {
                    int waited = 0;
                    // Splash screen pause time
                    while (waited < 3500) {
                        sleep(100);
                        waited += 100;
                    }


                    loadMainActivity();
                } catch (InterruptedException e) {
                    // do nothing
                } finally {
//                    SplashActivity.this.finish();

                }

            }
        };
        splashThread.start();
    }

    public void loadMainActivity()
    {
        Intent pintent = new Intent(SplashActivity.this,MainActivity.class);
        pintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        pintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        pintent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(pintent);
    }
}
