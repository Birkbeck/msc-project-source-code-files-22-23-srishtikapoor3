package com.example.deepthought;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.example.deepthought.databinding.ActivityMainBinding;
import android.content.SharedPreferences;


import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    String Email, Password;

    private ActivityMainBinding binding;

    private Button startquizbutton;
    private Button thoughtbutton;
    private Button loginButton;
    private Button signUpbutton;

    private Button aboutButton;

    private EditText emailEditText;  // for the email input
    private EditText passwordEditText; // for the password input

    // Create an instance of SignupData
    SignupData signupData;
    analysisData analysisdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        // creating object of SignupData class
        signupData = new SignupData(this);
        analysisdata = new analysisData(this);

        // establishing the link between existing edit text object and local object
        emailEditText = findViewById(R.id.editTextEmail);
        passwordEditText = findViewById(R.id.editTextPassword);

        // For startquizbutton
        startquizbutton = (Button) findViewById(R.id.button);
        startquizbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openquestion1();
            }
        });

        // For thoughtbutton
        thoughtbutton = (Button) findViewById(R.id.button3);
        thoughtbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openthought();
            }
        });

        // For aboutButton
        aboutButton = (Button) findViewById(R.id.button33);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbout();
            }
        });

        // For loginButton
        loginButton = findViewById(R.id.button5);
        loginButton.setOnClickListener(new View.OnClickListener() {
           // defining the event click action procedure
            @Override
            public void onClick(View v) {
                String emailid = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                Email = emailid;
                Password =password;
                // checking user credentials
                if (signupData.checkUserCredentials(emailid, password))
                {
                    // login successful and unsuccessful if the credentials match the database
                    // if login successful then enable the start quiz and though of the day button
                    // otherwise keep the button disables until true
                    startquizbutton.setEnabled(true);
                    thoughtbutton.setEnabled(true);
                    Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
                    // Navigate to the next activity or do other actions
                } else {
                    startquizbutton.setEnabled(false);
                    thoughtbutton.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Invalid email or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // For signUp button
        signUpbutton = (Button) findViewById(R.id.button4);
        signUpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignUp();
            }
        });
    }

    // defining the functions for directing into new activity pages.
    public void opensignUp() {
        Intent intent7 = new Intent(this, signup.class);
        startActivity(intent7);
    }

    public void openquestion1() {
        Intent intent = new Intent(this, question1.class);
        String temp = Email +"-"+Password;
        intent.putExtra("user2", temp);
        startActivity(intent);
    }

    public void openthought() {
        Intent intent5 = new Intent(this, thought.class);
        startActivity(intent5);
    }
    public void openAbout() {
        Intent intent7 = new Intent(this, About.class);
        startActivity(intent7);
    }



}
