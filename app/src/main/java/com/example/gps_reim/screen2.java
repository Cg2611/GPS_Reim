package com.example.gps_reim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class screen2 extends AppCompatActivity {

    TextView txt2;
    Button bt1, bt2;
    EditText ed1, ed2, ed3, ed4, ed5, ed6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        txt2=findViewById(R.id.textView);
        bt1= findViewById(R.id.button21);
        bt2= findViewById(R.id.button22);

        ed1= findViewById(R.id.editTextTextPersonName);
        ed2= findViewById(R.id.editTextTextPersonName2);
        ed3= findViewById(R.id.editTextTextPersonName3);
        ed4= findViewById(R.id.editTextTextPersonName4);
        ed5= findViewById(R.id.editTextTextPersonName5);
        ed6= findViewById(R.id.editTextTextPersonName6);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thirdintent();
            }
        });
    }
    public void thirdintent(){
        Intent intent = new Intent(this, screen3.class);
        startActivity(intent);

    }
}