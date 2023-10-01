package com.example.deepthought;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {

    //object declaration for home button.

    Button homebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        // Event procedure of  homebutton
        homebutton = (Button) findViewById(R.id.button77);
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
            }
        });
    }

    // Directing towards starting the "Home" page which is the MainActivity.

    public void openhome ()
    {
        Intent intent4 = new Intent(this, MainActivity.class);
        startActivity(intent4);

    }
}