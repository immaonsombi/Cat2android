package com.onsombi.user.fitnessgym;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;

public class LoginActivity extends AppCompatActivity {
     Button btn_login;
    Intent myIntent,getMysignup;
    Intent mysignup;
    TextView signup;

    public static final String URL="https://peaceful-basin-38460.herokuapp.com/api/login";
    RequestQueue requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_login);
        btn_login=(Button)findViewById(R.id.btn_login);
        signup=(TextView)findViewById(R.id.link_signup);



        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myIntent=new Intent(LoginActivity.this, HomepageActivity.class);
                startActivity(myIntent);
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getMysignup=new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(getMysignup);
            }
        });
    }
}
