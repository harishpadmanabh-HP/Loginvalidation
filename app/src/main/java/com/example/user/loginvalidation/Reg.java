package com.example.user.loginvalidation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Reg extends AppCompatActivity {
    EditText nametext;
    EditText emailtext;
    EditText pswdtext;
    Button submit;
    String specialCharacters = "[" + "-/@#!*$%^&.'_+={}()"+ "]+" ;
    String emailstring ="@.";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        nametext=(EditText)findViewById(R.id.nametext);
        emailtext=(EditText)findViewById(R.id.emailtext);
        pswdtext=(EditText)findViewById(R.id.pswdtext);

        submit=(Button)findViewById(R.id.submitbutton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namereg=nametext.getText().toString();
                String emailreg=emailtext.getText().toString();
                String pswdreg=pswdtext.getText().toString();

                Intent intent=new Intent(Reg.this,Login.class);

                intent.putExtra("keyemail",emailreg);
                intent.putExtra("keypswd",pswdreg);
//                if(namereg.matches(specialCharacters))
//                {
//                    Toast.makeText(Reg.this, "Special characters not available in name ", Toast.LENGTH_SHORT).show();
//
//                }
//                while (namereg.length()>0)
//                {
//                    for(int i=0;i<=namereg.length();i++)
//                    {
//                        if(specialCharacters.contains(Character.toString(namereg.charAt(i))))
//                        {
//                            Toast.makeText(Reg.this, "Special characters in name is not allowed ", Toast.LENGTH_SHORT).show();
//
//                        }
//                    }
//                }
//                while (emailreg.length()>0)
//                {
//                    for(int i=0;i<=emailreg.length();i++)
//                    {
//                        if(emailstring.contains(Character.toString(emailreg.charAt(i))))
//                        {
//                            Toast.makeText(Reg.this, "Valid email ", Toast.LENGTH_SHORT).show();
//
//                        }
//                        else
//                            Toast.makeText(Reg.this, "Invalid email ", Toast.LENGTH_SHORT).show();
//
//                    }
//                }

           if(emailreg.length()==0||pswdreg.length()==0||namereg.length()==0)
                {
                    emailtext.setError("Enter details");
                    Toast.makeText(Reg.this, "Enter the details ", Toast.LENGTH_SHORT).show();

                }
            else
                {
                    Toast.makeText(Reg.this, "Rgistration successfull", Toast.LENGTH_SHORT).show();


                    startActivity(intent);
                }


            }
        });
    }
}
