package com.ezhilnero.ssncse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class prof extends AppCompatActivity {
    ImageView carvind_mail;
    ImageView milton_mail;
    ImageView venkvara_mail;
    ImageView chamu_mail;
    ImageView ttmir_mail;

    private View.OnClickListener carvi_mail_pressed = new View.OnClickListener() {
        public void onClick(View v) {
            copy_mail("aravindanc@ssn.cse.in");
        }
    };
    private View.OnClickListener milton_mail_pressed = new View.OnClickListener() {
        public void onClick(View v) {
            copy_mail("miltonrs@ssn.cse.in");
        }
    };
    private View.OnClickListener venkvara_mail_pressed = new View.OnClickListener() {
        public void onClick(View v) {
            copy_mail("dvvprasad@ssn.cse.in");
        }
    };
    private View.OnClickListener chamu_mail_pressed = new View.OnClickListener() {
        public void onClick(View v) {
            copy_mail("chamundeswaria@ssn.cse.in");
        }
    };
    private View.OnClickListener ttmir_mail_pressed = new View.OnClickListener() {
        public void onClick(View v) {
            copy_mail("mirnalineett@ssn.cse.in");
        }
    };

    public void copy_mail(String mail){
        ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("carvind_mail",mail);
        clipboard.setPrimaryClip(clip);
        Toast.makeText(prof.this, "mail id copied to clipboard", Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.prof);
        carvind_mail=(ImageView)findViewById(R.id.caravind_mail);
        milton_mail=(ImageView)findViewById(R.id.milton_mail);
        venkvara_mail=(ImageView)findViewById(R.id.venkvara_mail);
        chamu_mail=(ImageView)findViewById(R.id.chamu_mail);
        ttmir_mail=(ImageView)findViewById(R.id.ttmir_mail);

        carvind_mail.setOnClickListener(carvi_mail_pressed);
        milton_mail.setOnClickListener(milton_mail_pressed);
        venkvara_mail.setOnClickListener(venkvara_mail_pressed);
        chamu_mail.setOnClickListener(chamu_mail_pressed);
        ttmir_mail.setOnClickListener(ttmir_mail_pressed);
    }
}
