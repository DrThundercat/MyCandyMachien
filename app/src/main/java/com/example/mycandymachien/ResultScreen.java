package com.example.mycandymachien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class ResultScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);
        TextView resultView = findViewById(R.id.resultView);
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        resultView.setText(message);
    }

}
