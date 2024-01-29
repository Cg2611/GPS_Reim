package com.example.gps_reim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class screen3 extends AppCompatActivity {

    TextView txt2;
    Button bt1, bt2, bt3;
    EditText ed1, ed2,  ed4, ed5, ed6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        txt2=findViewById(R.id.textView);
        bt1= findViewById(R.id.button21);
        bt2= findViewById(R.id.button22);
        bt3= findViewById(R.id.button23);


        ed1= findViewById(R.id.editTextTextPersonName);
        ed2= findViewById(R.id.editTextTextPersonName2);
        ed4= findViewById(R.id.editTextTextPersonName4);
        ed5= findViewById(R.id.editTextTextPersonName5);
        ed6= findViewById(R.id.editTextTextPersonName6);

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
    }






}