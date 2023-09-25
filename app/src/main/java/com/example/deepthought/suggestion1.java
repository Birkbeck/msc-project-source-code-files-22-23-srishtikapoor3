package com.example.deepthought;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class suggestion1 extends AppCompatActivity {
private int low, high;
TextView textLow, textHigh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion1);
        Intent intent =  getIntent();
        String temp;
        temp  = intent.getStringExtra ("high");
        low= Integer.parseInt(temp.substring(0,1));
        high= Integer.parseInt(temp.substring(1,2));
        String category []={"autonomy", "environment", "personal", "relations", "purpose", "acceptance" };
        String lowCat = category[low];
        String highCat = category[high];
        textLow = findViewById (R.id.textView2);
        textLow.setText("Low Category is "+ lowCat +  "\n High category is " + highCat );
    }


}