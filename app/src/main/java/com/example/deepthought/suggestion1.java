package com.example.deepthought;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.SharedPreferences;

public class suggestion1 extends AppCompatActivity {
    private String score;

    private String strength, weakness;

    private int lowscore, highscore;


    private Button myAnalysisButton;

    String result = "";
    TextView finalscore;
    TextView low, high;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion1);
        Intent intent = getIntent();
        String temp;
        temp = intent.getStringExtra("score");
        String category[] = {"autonomy", "environment", "personal", "relations", "purpose", "acceptance"};
        String[] catscore = temp.split("-", 6);
            strength= category[0];
            weakness= category[0];
            lowscore= Integer.parseInt(catscore [0]);
            highscore= Integer.parseInt(catscore[0]);

        for (int i = 0; i < 6; i++) {
            result += category[i] + " = " + catscore[i] + "\n\n";
            int s = Integer.parseInt(catscore[i]);
            if ( s > highscore)
            {
                highscore= s;
                strength=category[i];
            }
            if ( s < lowscore)
            {
                lowscore =s;
                weakness=category[i];
            }


        }
        finalscore = findViewById (R.id.textView2);
        finalscore.setText(result);

        String highvalue = "Your strength is " + strength + " as your score is " + highscore + "\n\n";
        String lowvalue = "Your weakness is " + weakness + " as your score is " + lowscore + "\n\n";

        high = findViewById (R.id.textView8);
        high.setText(highvalue);

        low = findViewById (R.id.textView10);
        low.setText(lowvalue);


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


