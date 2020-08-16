package com.example.cafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Sign_in_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().setTitle("Sign In");
    }
}