package com.example.gps_reim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt1, txt2;
    Button btn;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1= findViewById(R.id.textView);
        txt2= findViewById(R.id.textView2);
        btn= findViewById(R.id.button);
        img1= findViewById(R.id.imgbtn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondintent();


            }
        });
    }
    public void secondintent(){
        Intent intent = new Intent(this, screen2.class);
        startActivity(intent);

    }
}