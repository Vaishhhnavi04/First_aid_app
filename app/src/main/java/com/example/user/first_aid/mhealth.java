package com.example.user.first_aid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mhealth extends AppCompatActivity implements View.OnClickListener {
    private Button a,p,g;
    private Intent intent,grief_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhealth);
        a=findViewById(R.id.anx);
        p=findViewById(R.id.panic);
        g=findViewById(R.id.grief);

        a.setOnClickListener(this);
        p.setOnClickListener(this);
        g.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()== R.id.panic){

            intent = new Intent(mhealth.this,profileActivity.class);
            intent.putExtra("name","Panic");
            startActivity(intent);

        }
        if(v.getId()== R.id.anx){

            intent = new Intent(mhealth.this,profileActivity.class);
            intent.putExtra("name","Anxiety");
            startActivity(intent);

        }
        if(v.getId()== R.id.grief){

            intent = new Intent(mhealth.this,griefActivity.class);
            //intent.putExtra("name","Grief");
            startActivity(intent);

        }
    }
}