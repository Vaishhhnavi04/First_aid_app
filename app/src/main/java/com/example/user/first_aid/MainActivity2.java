package com.example.user.first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    LinearLayout medical,first;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        LinearLayout medical = (LinearLayout)findViewById(R.id.medical);
        medical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });

        LinearLayout first = (LinearLayout)findViewById(R.id.first_aid_kit);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FirstAidKit.class);
                startActivity(intent);

            }
        });

        LinearLayout mental = (LinearLayout)findViewById(R.id.mental_health);
        mental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mhealth.class);
                startActivity(intent);

            }
        });

        LinearLayout call = (LinearLayout)findViewById(R.id.contact);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),EmergencyContact.class);
                startActivity(intent);

            }
        });

        LinearLayout fire = (LinearLayout)findViewById(R.id.firex);
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),fire.class);
                startActivity(intent);

            }
        });

    }
}