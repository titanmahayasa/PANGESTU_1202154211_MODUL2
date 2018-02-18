package com.example.pangestutitan.pangestu_1202154211_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;


public class SplashScreen extends AppCompatActivity {
    TextView tvSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);

        tvSplash = (TextView) findViewById(R.id.tvSplash);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainMenu.class));
                finish();

            }

        }, 1000L); //1000 L =  1 detik
        Toast.makeText(this, "PANGESTU_1202154211", Toast.LENGTH_LONG).show();
    }
}
