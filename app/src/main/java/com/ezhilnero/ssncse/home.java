package com.ezhilnero.ssncse;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    LinearLayout faculty;
    LinearLayout student;
    LinearLayout bus;
    LinearLayout news;
    ImageView fount_img;
    int flag=0;



    private View.OnClickListener faculty_pressed = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent_fac = new Intent(home.this,faculty.class)   ;
            startActivity(intent_fac);
            change_image();
        }
    };
    private View.OnClickListener stu_pressed = new View.OnClickListener() {
        public void onClick(View v) {
            Intent intent_stu = new Intent(home.this,student.class)   ;
            startActivity(intent_stu);
            change_image();

        }
    };
    private View.OnClickListener bus_pressed = new View.OnClickListener() {
        public void onClick(View v) {

        }
    };
    private View.OnClickListener news_pressed = new View.OnClickListener() {
        public void onClick(View v) {
        }


    };

    public void change_image(){
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                if(flag==0){
                    fount_img.setImageResource(R.drawable.fountain3);
                    flag=2;
                }
                else if(flag==2){
                    fount_img.setImageResource(R.drawable.fountain4);
                    flag=3;
                }
                else if(flag==3){
                    fount_img.setImageResource(R.drawable.fountain5);
                    flag=4;
                }
                else if(flag==4){
                    fount_img.setImageResource(R.drawable.fountain);
                    flag=0;
                }
            }
        }, 500);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        faculty = (LinearLayout) findViewById(R.id.faculty_linlay);
        student = (LinearLayout) findViewById(R.id.student_linlay);
        bus = (LinearLayout) findViewById(R.id.bus_linlay);
        news = (LinearLayout) findViewById(R.id.news_linlay);
        fount_img = (ImageView)findViewById(R.id.fountain_img);

        faculty.setOnClickListener(faculty_pressed);
        student.setOnClickListener(stu_pressed);
        bus.setOnClickListener(bus_pressed);
        news.setOnClickListener(news_pressed);



        }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.menu_info) {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage(R.string.info);
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Ok",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();
        }


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent_fac = new Intent(home.this,faculty.class)   ;
            startActivity(intent_fac);
            change_image();

        } else if (id == R.id.nav_gallery) {
            Intent intent_stu = new Intent(home.this,student.class)   ;
            startActivity(intent_stu);
            change_image();

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
