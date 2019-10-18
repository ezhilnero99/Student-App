package com.ezhilnero.ssncse;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout intro_lay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intro_lay = (LinearLayout)findViewById(R.id.intro_layout);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent intent = new Intent(MainActivity.this,login.class);
                startActivity(intent);

            }
        }, 1000);



    }
}
