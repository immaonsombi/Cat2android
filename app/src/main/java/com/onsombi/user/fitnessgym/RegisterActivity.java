package com.onsombi.user.fitnessgym;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import static java.security.AccessController.getContext;


public class RegisterActivity extends AppCompatActivity {

         String FirstName, LastName, UserName, Email, Password;
         private EditText etFirstName;

    private EditText etLastName;
    private EditText etEmail;
    private EditText etPassword;
    private TextView login;
    Intent mylogin;

        public static final String URL="https://peaceful-basin-38460.herokuapp.com/api/register";
        RequestQueue requestQueue;
        Button btnSignUp;


        public RegisterActivity () {
            // Required empty public constructor
        }


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_homepage);
//
//            etFirstName=(EditText)findViewById(R.id.editfirstName);
//            etLastName=(EditText)findViewById(R.id.editlastname);
//
//            etEmail=(EditText(findViewById(R.id.editTextEmail);
//            etPassword=(EditText)findViewById(R.id.editTextPassword);
//
//            requestQueue= Volley.newRequestQueue(getContext());
//            btnSignUp=(Button)findViewById(R.id.buttonSubmit);
//
//            login=(TextView)findViewById(R.id.link_login);
//
//
//
//            login.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    mylogin=new Intent(RegisterActivity.this, LoginActivity.class);
//                    startActivity(mylogin);
//                }
//            });
//            btnSignUp.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if(validateName(etFirstName)&&validateName(etLastName) &&
//                            validateName(etUserName,layout_UserName)&&validateEmail(etEmail)&&validatePassword(etPassword)){
//                        FirstName=etFirstName.getText().toString();
//                        LastName=etLastName.getText().toString();
//                        Email=etEmail.getText().toString();
//                        Password=etPassword.getText().toString();
//                        Register();
//                    }
//
//                }
//            });
//
//
//
//        }
//        public boolean validateName(TextInputEditText textInputEditText, TextInputLayout textInputLayout){
//            if(TextUtils.isEmpty(textInputEditText.getText().toString())){
//                textInputLayout.setError("Field required");
//            }else{
//                textInputLayout.setErrorEnabled(false);
//            }
//            return true;
//        }
//        private boolean validatePassword(TextInputEditText textInputEditText, TextInputLayout passwordLayout){
//            if(TextUtils.isEmpty(textInputEditText.getText().toString()) || textInputEditText.getText().toString().length()<6){
//                passwordLayout.setError("Invalid password");
//            }
//            return true;
//        }
//        public boolean validateEmail(TextInputEditText textInputEditText,TextInputLayout textInputLayout){
//            if(!TextUtils.isEmpty(textInputEditText.getText())&& Patterns.EMAIL_ADDRESS.matcher(textInputEditText.getText().toString()).matches()){
//                textInputLayout.setErrorEnabled(false);
//                return true;
//            }else{
//                textInputLayout.setError("Invalid Email");
//            }
//            return false;
//        }
//        public void Register(){
//            HashMap<String,String> params=new HashMap<>();
//            params.put("FirstName",FirstName);
//            params.put("LastName",LastName);
//            params.put("email",Email);
//            params.put("password",Password);
//            JsonObjectRequest jsonObjectRequest=new JsonObjectRequest(Request.Method.POST, URL, new JSONObject(params), new Response.Listener<JSONObject>() {
//                @Override
//                public void onResponse(JSONObject response) {
//                    Toast.success(getContext(),"New User Created", Toast.LENGTH_LONG,true).show();
//
//                }
//            }, new Response.ErrorListener() {
//                @Override
//                public void onErrorResponse(VolleyError error) {
//                    Toast.error(getContext(),"Invalid Registration", Toast.LENGTH_LONG,true).show();
//
//                }
//            }){
//                @Override
//                protected Map<String, String> getParams() throws AuthFailureError {
//                    HashMap<String,String> params=new HashMap<>();
//                    params.put("FirstName",FirstName);
//                    params.put("LastName",LastName);
//                    params.put("email",Email);
//                    params.put("password",Password);
//                    return params;
//                }
//
//                @Override
//                public Map<String, String> getHeaders() throws AuthFailureError {
//                    HashMap<String,String> headers=new HashMap<>();
//                    headers.put("Content-Type","application/json");
//                    headers.put("Accept","application/json");
//                    return headers;
//                }
//            };
//            requestQueue.add(jsonObjectRequest);
//
//        }

    }
}