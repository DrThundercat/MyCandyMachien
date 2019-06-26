package com.example.mycandymachien;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void getCandy(View view)
    {
        ProcessChoice logic = new ProcessChoice();
        Intent intent = new Intent(this,ResultScreen.class);
        Spinner spin = findViewById(R.id.Spinner);
        String candy = spin.getSelectedItem().toString();
        String result = logic.gettingCandy(candy);

        intent.putExtra("message",result);
        startActivity(intent);
    }
}
