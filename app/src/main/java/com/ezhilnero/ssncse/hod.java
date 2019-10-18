package com.ezhilnero.ssncse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class hod extends AppCompatActivity {
    TextView chitra_mail;

    private View.OnClickListener chitra_mail_pressed = new View.OnClickListener() {
        public void onClick(View v) {
            ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("chitra_mail","chitra@ssn.edu.in");
            clipboard.setPrimaryClip(clip);
            Toast.makeText(hod.this, "mail id copied to clipboard", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hod);
        chitra_mail = (TextView)findViewById(R.id.chitra_mail);
        chitra_mail.setOnClickListener(chitra_mail_pressed);
    }
}
