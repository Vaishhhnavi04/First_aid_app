package com.example.user.first_aid;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstAidProfileActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_aid_profile);

        imageView = findViewById(R.id.imageViewId2);
        textView = findViewById(R.id.textViewId2);

        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){

            String topicName = bundle.getString("name");
            showDetails(topicName);

        }
    }
    void showDetails(String topicName){

        if(topicName.equals("app_name")){

            imageView.setImageResource(R.drawable.kits_first);
            textView.setText(R.string.adkit);

        }
        if(topicName.equals("kids")){

            imageView.setImageResource(R.drawable.kid);
            textView.setText(R.string.kidkit);

        }
        if(topicName.equals("travel")){

            imageView.setImageResource(R.drawable.travel);
            textView.setText(R.string.travkit);

        }
        /*if(topicName.equals("First")){

            imageView.setImageResource(R.drawable.kits_first);
            textView.setText(R.string.What_should_be_in_my_first_aid_kit);

        } */

    }
}