package com.example.deepthought;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;


public class thought extends AppCompatActivity {
    Button v1;
    String s1;

    public thought ()
    {
        s1=" good morning";
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thought);
    }
}