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
    //object declare for button and edit text
    private Button startquizbutton;
    private Button thoughtbutton;
    private Button loginButton;
    private Button signUpbutton;

    private Button aboutButton;

    private EditText emailEditText;  // for taking the email input
    private EditText passwordEditText; // for taking the password input

    // Create an instance of SignupData
    SignupData signupData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Removed as not needed
       /* BottomNavigationView navView = findViewById(R.id.nav_view);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
*/
        // creating object of SignupData class
        signupData = new SignupData(this);

        // establishing the link between existing edit text object and local object
        emailEditText = findViewById(R.id.editTextEmail);
        passwordEditText = findViewById(R.id.editTextPassword);

        // defining action/event of startquizbutton.
        startquizbutton = (Button) findViewById(R.id.button);
        startquizbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openquestion1();
                // Call the function for opening the actvity page defined below.
            }
        });

        // defining action/event of thoughtbutton.
        thoughtbutton = (Button) findViewById(R.id.button3);
        thoughtbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openthought();
            }
        });

        // defining action/event of aboutButton
        aboutButton = (Button) findViewById(R.id.button33);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAbout();
            }
        });

        // defining action/event of loginButton
        loginButton = findViewById(R.id.button5);
        loginButton.setOnClickListener(new View.OnClickListener() {
           // defining the event click action procedure
            @Override
            public void onClick(View v) {
               // extract the content of user input for email id and password to cross check credentials.
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

        // defining action/event of signUp button
        signUpbutton = (Button) findViewById(R.id.button4);
        signUpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignUp();
            }
        });
    }

    // defining the functions for directing into new activity pages.

    //Directiong towards Sign Up page.
    public void opensignUp() {
        Intent intent7 = new Intent(this, signup.class);
        startActivity(intent7);
    }
        // Directing towards starting the quiz.
    public void openquestion1() {
        Intent intent = new Intent(this, question1.class);
        String temp = Email +"-"+Password;
        intent.putExtra("user2", temp);
        startActivity(intent);
    }
    // Directing towards Inspiring Though page.
    public void openthought() {
        Intent intent5 = new Intent(this, thought.class);
        startActivity(intent5);
    }

    // Directing towards starting the "About" page. .

    public void openAbout() {
        Intent intent7 = new Intent(this, About.class);
        startActivity(intent7);
    }



}
