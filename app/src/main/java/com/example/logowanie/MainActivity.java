package com.example.logowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText loginInput;

    EditText passwordInput;

    TextView errormessageView;

    Button loginbutton;

    String login;

    String password;

    String passwordpattern = "123";

    String errormessage = "Nie poprawne hasło lub login";


    String[] logins = {"Jan", "Adam", "Franek"};



    protected boolean checklogins(String login) {

        for (String loginpattern : logins) {
            if (loginpattern.equals (login)) {
                return true;
            }
        }
        return false;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginInput  = findViewById(R.id.editTextText);
        passwordInput = findViewById(R.id.editTextpassword);
        errormessageView = findViewById(R.id.textView4);
        loginbutton = findViewById(R.id.button);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login =  loginInput.getText().toString();
                password = passwordInput.getText().toString();

                if (password.equals(passwordpattern) && checklogins(login)) {
                    Intent intent = new Intent(MainActivity.this, MainActivityHello2.class);
                    intent.putExtra("login", login);
                    startActivity(intent);

                }

                else {
                    errormessageView.setText(errormessage);
                }
            }
        });


    }
}