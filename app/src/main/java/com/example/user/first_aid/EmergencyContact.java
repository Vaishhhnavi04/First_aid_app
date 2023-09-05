package com.example.user.first_aid;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Bundle;

public class EmergencyContact extends AppCompatActivity {

    LinearLayout Police,Fire,NHN,Ambulance,DHL,CHL;
    TextView Police_tv,Fire_tv,NHN_tv,Ambulance_tv,DHL_tv,CHL_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contact);

        Police=(LinearLayout)findViewById(R.id.police);
        Police_tv=(TextView) findViewById(R.id.police_tv);
        Police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pno="100";
                Bundle bundle=new Bundle();
                bundle.putString("pno",pno);
                Intent intent = new Intent(getApplicationContext(),CallActivity.class);
                intent.putExtra("data",bundle);
                startActivity(intent);

            }
        });

        Fire=(LinearLayout)findViewById(R.id.fire);
        Fire_tv=(TextView) findViewById(R.id.fire_tv);
        Fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pno="101";
                Bundle bundle=new Bundle();
                bundle.putString("pno",pno);
                Intent intent = new Intent(getApplicationContext(),CallActivity.class);
                intent.putExtra("data",bundle);
                startActivity(intent);

            }
        });

        NHN=(LinearLayout)findViewById(R.id.national_helpline_number);
        NHN_tv=(TextView) findViewById(R.id.national_helpline_number_tv);
        NHN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pno="112";
                Bundle bundle=new Bundle();
                bundle.putString("pno",pno);
                Intent intent = new Intent(getApplicationContext(),CallActivity.class);
                intent.putExtra("data",bundle);
                startActivity(intent);

            }
        });

        Ambulance=(LinearLayout)findViewById(R.id.ambulance);
        Ambulance_tv=(TextView) findViewById(R.id.ambulance_tv);
        Ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pno="102";
                Bundle bundle=new Bundle();
                bundle.putString("pno",pno);
                Intent intent = new Intent(getApplicationContext(),CallActivity.class);
                intent.putExtra("data",bundle);
                startActivity(intent);

            }
        });

        DHL=(LinearLayout)findViewById(R.id.domestic_helpline);
        DHL_tv=(TextView) findViewById(R.id.domestic_helpline_tv);
        DHL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pno="181";
                Bundle bundle=new Bundle();
                bundle.putString("pno",pno);
                Intent intent = new Intent(getApplicationContext(),CallActivity.class);
                intent.putExtra("data",bundle);
                startActivity(intent);

            }
        });

        CHL=(LinearLayout)findViewById(R.id.child_helpline);
        CHL_tv=(TextView) findViewById(R.id.child_helpline_tv);
        CHL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pno="1098";
                Bundle bundle=new Bundle();
                bundle.putString("pno",pno);
                Intent intent = new Intent(getApplicationContext(),CallActivity.class);
                intent.putExtra("data",bundle);
                startActivity(intent);

            }
        });
    }
}