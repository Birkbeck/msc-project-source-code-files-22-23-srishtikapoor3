package com.example.deepthought;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class suggestion1 extends AppCompatActivity {
    private String score;

    private Button myAnalysisButton;

    String result = "";
    TextView textLow, textHigh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion1);
        Intent intent = getIntent();
        String temp;
        temp = intent.getStringExtra("score");
        String category[] = {"autonomy", "environment", "personal", "relations", "purpose", "acceptance"};
        String[] catscore = temp.split("-", 6);
        for (int i = 0; i < 6; i++) {
            result += category[i] + " = " + catscore[i] + "\n\n\n";
        }
        textLow = findViewById (R.id.textView2);
        textLow.setText(result);


        myAnalysisButton = (Button) findViewById(R.id.button7);
        myAnalysisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnalysis();
            }
        });
    }
        public void openAnalysis ()
        {
            Intent intent4 = new Intent(this, analysis.class);
            startActivity(intent4);
        }


    }


