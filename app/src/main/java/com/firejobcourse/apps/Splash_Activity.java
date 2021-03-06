package com.firejobcourse.apps;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_Activity extends AppCompatActivity {

    Animation app_splash, btt;
    ImageView app_logo;

    String USERNAME_KEY = "usernamekey";
    String username_key = "";
    String username_key_new = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // load animation
        app_splash = AnimationUtils.loadAnimation(this, R.anim.app_splash);
        btt = AnimationUtils.loadAnimation(this, R.anim.btt);

        // load element
        app_logo = findViewById(R.id.app_logo);


        // run animation
        app_logo.startAnimation(app_splash);

        getUsernameLocal();

    }

    public void getUsernameLocal(){
        SharedPreferences sharedPreferences = getSharedPreferences(USERNAME_KEY, MODE_PRIVATE);
        username_key_new = sharedPreferences.getString(username_key, "");
        if(username_key_new.isEmpty()){
            // setting timer untuk 2 detik

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // merubah activity ke activity lain
                    Intent gogetstarted = new Intent(Splash_Activity.this, GetStarted_Activity.class);
                    startActivity(gogetstarted);
                    finish();
                }
            }, 2000); // 2000 ms = 2s
        }
        else {
            // setting timer untuk 2 detik
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    // merubah activity ke activity lain
                    Intent gogethome = new Intent(Splash_Activity.this,HomeAct.class);
                    startActivity(gogethome);
                    finish();
                }
            }, 2000); // 2000 ms = 2s
        }
    }

}