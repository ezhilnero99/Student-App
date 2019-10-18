package com.ezhilnero.ssncse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class login extends AppCompatActivity {
    EditText user_id;
    EditText password;
    Button submit_but;
    Button info;
    Intent intent;

    private View.OnClickListener submit_pressed = new View.OnClickListener() {
        public void onClick(View v) {
            if(String.valueOf(user_id.getText()).equals("mic") && String.valueOf(password.getText()).equals("kannama")){

                startActivity(intent);
            }
            else {
                Toast.makeText(login.this, "wrong id or password", Toast.LENGTH_LONG).show();
            }
        }
    };
    private View.OnClickListener info_pressed = new View.OnClickListener() {
        public void onClick(View v) {
            Toast.makeText(login.this, "Use your SSN mail id", Toast.LENGTH_LONG).show();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        user_id=(EditText)findViewById(R.id.user_id_login);
        password=(EditText)findViewById(R.id.password_login);
        submit_but=(Button)findViewById(R.id.submit_login);
        info=(Button) findViewById(R.id.info_login);

        submit_but.setOnClickListener(submit_pressed);
        intent = new Intent(login.this,home.class);
        user_id.setPaintFlags(0);
        password.setPaintFlags(0);
        info.setOnClickListener(info_pressed);
    }
}
