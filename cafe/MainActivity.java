package com.example.cafe;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        login=findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, Sign_in_activity.class);
                startActivity(intent);
            }
        });
        signup=findViewById(R.id.btnSignup);
        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Sign Up has been clicked", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, SignUp_activity.class);
                startActivity(intent);
            }
        });
    }
}