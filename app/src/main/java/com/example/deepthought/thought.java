package com.example.deepthought;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class thought extends AppCompatActivity {

    Button myAnalysisButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thought);

        // For myAnalysisButton2
        myAnalysisButton2 = (Button) findViewById(R.id.button6);
        myAnalysisButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmyAnalysisButton2();
            }
        });
    }
    public void openmyAnalysisButton2() {
        Intent intent6 = new Intent(this, analysis.class);
        startActivity(intent6);
    }
    }
