package com.example.user.first_aid;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class griefActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grief);
        setupHyperlink();
    }

    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.textViewIdd);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkTextVieww = findViewById(R.id.textViewIddd);
        linkTextVieww.setMovementMethod(LinkMovementMethod.getInstance());
    }
}