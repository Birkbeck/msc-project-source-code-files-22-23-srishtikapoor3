package com.example.deepthought;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



    public class signup extends AppCompatActivity {

        // Object declaration for button and edit text.
        private Button createAccountbutton;

    private Button goSigninbutton;

    private EditText insertName, insertEmail, insertPassword, insertConfirmPassword;

    //Defining the object of  signupData class
    SignupData signupData = new SignupData(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        // Defining action for goSigninbutton
        goSigninbutton = (Button) findViewById(R.id.button9);
        goSigninbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengotologin();
            }
        });




        // creating the object for create account button
        createAccountbutton = (Button) findViewById(R.id.button8);
        createAccountbutton.setOnClickListener(new View.OnClickListener()
        {
            // sending data to SQLite database for storing the information
            @Override
            public void onClick(View view) {
                insertName = findViewById(R.id.editName);
                insertEmail = findViewById(R.id.editEmail);
                insertPassword = findViewById(R.id.editPassword);
                insertConfirmPassword = findViewById(R.id.editConfirmPassword);
                String name = insertName.getText().toString();
                String email = insertEmail.getText().toString();
                String password = insertPassword.getText().toString();
                String confirm = insertConfirmPassword.getText().toString();
                // Credentials are accepted if the types password match and minimum character is set to at least  2.
                if (password.equals(confirm) && name.length()>=2   && email.length()>=2  && password.length()>=2)
                {
                    String strength = "empty";
                    String weakness = "empty";

                    // inserting and checking if the input by user is successful  or failed.
                    if (signupData.insertUser(email, name, password, strength, weakness))
                    // Display successful attempt in pop up message.
                    {
                        Toast.makeText(signup.this, "Sign up successful", Toast.LENGTH_SHORT).show();
                        // Navigate back to main activity or login activity
                        finish();
                    }
                    // Display fail attempt in pop up message.

                    else
                    {
                        Toast.makeText(signup.this, "Signup failed", Toast.LENGTH_SHORT).show();
                    }
                }
                // if the passwords and confirm passwords do not match then show error and clear the edit text
                else
                {
                    Toast.makeText(signup.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                    insertPassword.setText("");
                    insertConfirmPassword.setText("");
                }
            }
        });

    }

// navigate back to home(sign in) page
    public void opengotologin ()
    {
        Intent intent9 = new Intent(this, MainActivity.class);
        startActivity(intent9);
    }


}

