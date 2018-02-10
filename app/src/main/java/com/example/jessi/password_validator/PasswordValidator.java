package com.example.jessi.password_validator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.*;

import java.lang.*;

public class PasswordValidator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_validator);
    }

    public void submitPassword(View v){
        EditText passwordEntered = (EditText)findViewById(R.id.passwordField);
        TextView passwordStrength = (TextView)findViewById(R.id.passwordStrength);

        String password = passwordEntered.getText().toString();
        int strength = validate(password);

        if(strength == 5)
            passwordStrength.setText("Very Strong");
        if(strength == 4)
            passwordStrength.setText("Strong");
        if(strength == 3)
            passwordStrength.setText("Ok");
        if(strength == 2)
            passwordStrength.setText("Weak");
        if(strength == 1)
            passwordStrength.setText("Very Weak");
    }

    public static int validate(String pw){
        int flag = 0;

        if(!pw.equalsIgnoreCase("password"))
            flag++;

        if(pw.length()>=8)
            flag++;

        if(!pw.equals(pw.toLowerCase())&&!pw.equals(pw.toUpperCase()))
            flag++;

        if(pw.matches(".*[0-9]+.*"))
            flag++;

        if(!pw.toLowerCase().matches(".*.{3,}+.*"))
            flag++;

        return flag;
    }


}
