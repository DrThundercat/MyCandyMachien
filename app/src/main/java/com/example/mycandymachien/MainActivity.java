package com.example.mycandymachien;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void getGummball(View view)
    {
        TextView textView = (TextView) findViewById(R.id.textView);
        View button = (Button) findViewById(R.id.button1);
        String gumball =  getString(R.string.button1text);
        textView.setText(gumball);
    }

    public void getGum(View view)
    {
        TextView textView = (TextView) findViewById(R.id.textView);
        View button = (Button) findViewById(R.id.button2);
        String gum =  getString(R.string.button2text);
        textView.setText(gum);
    }

    public void getGummies(View view)
    {
        TextView textView = findViewById(R.id.textView);
        Button button = findViewById(R.id.button3);
        String gummies =  button.getText().toString();
        textView.setText(gummies);
    }

    public void getNerdsCandy(View view)
    {
        TextView textView = findViewById(R.id.textView);
        Button button =findViewById(R.id.button4);
        String nerdsCandy =  button.getText().toString();
        textView.setText(nerdsCandy);
    }
}
