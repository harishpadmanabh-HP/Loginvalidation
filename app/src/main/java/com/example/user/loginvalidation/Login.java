package com.example.user.loginvalidation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
   EditText emaillogin;
   EditText pswdlogin;
   Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emaillogin=(EditText)findViewById(R.id.emailtextlogin);
        pswdlogin=(EditText)findViewById(R.id.passwordtextlogin);

        login=(Button)findViewById(R.id.login);
         Bundle bun=getIntent().getExtras();
        final String emailcheck=bun.getString("keyemail");
        Log.e("message",emailcheck);
        final String pswdcheck=bun.getString("keypswd");
        Log.e("message",pswdcheck);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String emaillog=emaillogin.getText().toString();
                String pswdlog=pswdlogin.getText().toString();
                if(emailcheck.equalsIgnoreCase(emaillogin.getText().toString())&&pswdcheck.equalsIgnoreCase(pswdlogin.getText().toString()))
              //  if((emaillog==emailcheck)&&(pswdlog==pswdcheck))
                {
                    Toast.makeText(Login.this, "Login Successfull", Toast.LENGTH_SHORT).show();

                }
                else
                {
                    Toast.makeText(Login.this, "Login not Successfull", Toast.LENGTH_SHORT).show();

                }
           }
        });

    }
}
