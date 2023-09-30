package com.example.deepthought;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class analysis extends AppCompatActivity {
    TextView textGuidance;
    Button homeButton;
    Button displayAnalysisButton;
    String Email, Password;

    analysisData analysisdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analysis);
        Intent intent = getIntent();
       // if (intent.hasExtra("details")) {
            String temp = intent.getStringExtra("details");
            String[] details = temp.split("-", 2);
            Email = details[0];
            Password = details[1];
        //}

        Toast.makeText(analysis.this, "Email"+ Email, Toast.LENGTH_SHORT).show();

        analysisData obj3 = new analysisData(this);
        /*String category3 = obj3.getCategory(Email);
        String msg = obj3.getSuggestion(category3);/*/
        String msg= "hello";
        textGuidance = findViewById(R.id.textview7);
        textGuidance.setText(msg);
        homeButton = (Button) findViewById(R.id.button14);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
            }
        });

//analysis buttton
        displayAnalysisButton = (Button) findViewById(R.id.button12);
        displayAnalysisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayScroll();
            }
        });


    }
    //home button
    public void openhome() {
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }

    public void displayScroll() {
        //Intent intent2 = new Intent(this, analysis.class);
        //startActivity(intent2);
    }




}



