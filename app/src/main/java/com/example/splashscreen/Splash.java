package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        Thread thread = new Thread()
        {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(4000); // By using sleep value you can control the timing of splash screen.
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        };
        thread.start();

    }
}
