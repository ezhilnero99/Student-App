package com.ezhilnero.ssncse;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class student extends AppCompatActivity {
    TextView degree;
    TextView year;
    TextView section;
    Button submit;

    private View.OnClickListener degree_pressed = new View.OnClickListener() {
        public void onClick(View v) {

            final String[] degree_list = {"BE", "ME"};
            AlertDialog.Builder options = new AlertDialog.Builder(student.this);
            options.setTitle("Degree");
            options.setItems(degree_list, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    degree.setText(degree_list[which]);
                }
            });
            options.show();
            new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                    degree.setTextColor(Color.parseColor("#3419A1"));
                }
            }, 500);
           
        }
    };
    private View.OnClickListener year_pressed = new View.OnClickListener() {
        public void onClick(View v) {

            final String[] year_list = {"I", "II","III","IV"};
            AlertDialog.Builder options = new AlertDialog.Builder(student.this);
            options.setTitle("Degree");
            options.setItems(year_list, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    year.setText(year_list[which]);
                }
            });
            options.show();
            new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                    year.setTextColor(Color.parseColor("#3419A1"));
                }
            }, 500);

        }
    };
    private View.OnClickListener section_pressed = new View.OnClickListener() {
        public void onClick(View v) {

            final String[] section_list = {"A", "B","C"};
            AlertDialog.Builder options = new AlertDialog.Builder(student.this);
            options.setTitle("Section");
            options.setItems(section_list, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    section.setText(section_list[which]);
                }
            });
            options.show();
            new Handler().postDelayed(new Runnable(){
                @Override
                public void run() {
                    section.setTextColor(Color.parseColor("#3419A1"));
                }
            }, 500);


        }
    };
    private View.OnClickListener submit_pressed = new View.OnClickListener() {
        public void onClick(View v) {
//            Toast.makeText(student.this, degree.getText() + " "+year.getText()+ " "+section.getText(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(student.this,stud_time_sche.class);
            startActivity(intent);
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student);
        
        degree = (TextView)findViewById(R.id.degree_text);
        year=(TextView)findViewById(R.id.year_text);
        section=(TextView)findViewById(R.id.section_text);
        submit = (Button)findViewById(R.id.submit_stud) ;

        degree.setOnClickListener(degree_pressed);
        year.setOnClickListener(year_pressed);
        section.setOnClickListener(section_pressed);
        submit.setOnClickListener(submit_pressed);
        
    }
}
