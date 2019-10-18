package com.ezhilnero.ssncse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class faculty extends AppCompatActivity {

    ListView faculty_heir;
    ArrayList<String> fac_heir_nam;
    ArrayAdapter arr_adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculty);

        faculty_heir = (ListView)findViewById(R.id.fac_heir_list);
        fac_heir_nam = new ArrayList<String>();
        fac_heir_nam.add("Head Of Department");
        fac_heir_nam.add("Professor");
        fac_heir_nam.add("Associate Professor");
        fac_heir_nam.add("Assistant Professor");

        arr_adp = new ArrayAdapter(faculty.this,android.R.layout.simple_list_item_1,fac_heir_nam);
        faculty_heir.setAdapter(arr_adp);

        faculty_heir.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i ==0){
                    Intent hod_int = new Intent(faculty.this,hod.class);
                    startActivity(hod_int);
                }
                if(i ==1){
                    Intent prof_int = new Intent(faculty.this,prof.class);
                    startActivity(prof_int);
                }
                if(i ==2){
//                    Toast.makeText(faculty.this, "22222", Toast.LENGTH_SHORT).show();
                }
                if(i ==3){
//                    Toast.makeText(faculty.this, "33333", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
