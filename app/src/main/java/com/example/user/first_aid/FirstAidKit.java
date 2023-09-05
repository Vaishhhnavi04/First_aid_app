package com.example.user.first_aid;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstAidKit extends AppCompatActivity implements View.OnClickListener {

    private Intent intent;

    private Button adults,kids,travel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid_kit);

        adults = findViewById(R.id.faa);
        kids = findViewById(R.id.fak);
        travel = findViewById(R.id.fap);

        adults.setOnClickListener(this);
        kids.setOnClickListener(this);
        travel.setOnClickListener(this);
    }

    //@Override
    public void onClick(View v) {

        if(v.getId()== R.id.faa){

            intent = new Intent(FirstAidKit.this,FirstAidProfileActivity.class);
            intent.putExtra("name","app_name");
            startActivity(intent);

        }
        if(v.getId()== R.id.fak){

            intent = new Intent(FirstAidKit.this,FirstAidProfileActivity.class);
            intent.putExtra("name","kids");
            startActivity(intent);

        }
        if(v.getId()== R.id.fap){

            intent = new Intent(FirstAidKit.this,FirstAidProfileActivity.class);
            intent.putExtra("name","travel");
            startActivity(intent);

        }
    }
}