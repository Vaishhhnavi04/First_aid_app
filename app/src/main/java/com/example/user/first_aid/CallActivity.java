package com.example.user.first_aid;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.net.Uri;
import android.provider.ContactsContract;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class CallActivity extends AppCompatActivity {

    EditText phoneNumber;
    String phone;
    Button btnCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        phoneNumber=(EditText)findViewById(R.id.txt_phonenumber);
        Bundle bundle=getIntent().getBundleExtra("data");
        phone=bundle.getString("pno");
        phoneNumber.setText(phone);

        btnCall=(Button)findViewById(R.id.btn_call);
        btnCall.setOnClickListener(new View.OnClickListener()
                                   {
                                       @Override
                                       public void onClick(View v) {
                                           String data =
                                                   phoneNumber.getText().toString();
                                           Intent intent=new Intent(Intent.ACTION_DIAL);
                                           intent.setData(Uri.parse("tel:"+ data));
                                           startActivity(intent);
                                       }
                                   }
        );



    }

}