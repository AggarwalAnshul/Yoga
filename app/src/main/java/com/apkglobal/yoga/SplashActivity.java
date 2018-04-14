package com.apkglobal.yoga;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    Typeface typeface;
    TextView splashtext;
    ImageView iv_image;
    Animation animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

      /*  TextView splashtext=(TextView)findViewById(R.id.splashtext);*/

     /*   final String font="font/clearfont.ttf";
        typeface=Typeface.createFromAsset(getAssets(),font);
        splashtext.setTypeface(typeface);
*/

        //typecast here
        iv_image = (ImageView) findViewById(R.id.iv_image);
        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation_modes);
        iv_image.startAnimation(animation);

        //to hide the stauts bar
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        int time = 1500;
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, Navigation_Drawer.class);
                startActivity(intent);
                finish();
            }
        }, time);
    }
}
