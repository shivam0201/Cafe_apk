package com.example.cafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUp_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("Sign Up");

        Button reg_login=findViewById(R.id.reg_login);
        reg_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(SignUp_activity.this, "You have been registered", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(SignUp_activity.this, Sign_in_activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
