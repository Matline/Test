package com.example.mercy.phoodworld;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by mercy on 11/28/2017.
 */

public class SignUp  implements View.OnClickListener{
    private EditText Name,Password, Email;
    private Button btnSignUp;





        @Override
    public void onClick(View v) {
        //if (v.getId() == R.id.btn_register){
            boolean isEmptyField = false;

            String name  = Name.getText().toString().trim();
            String email  = Email.getText().toString().trim();
            String password  = Password.getText().toString().trim();

            if (TextUtils.isEmpty(name)) {
                isEmptyField = true;
                Name.setError("required");
            }

            if (TextUtils.isEmpty(email)){
                isEmptyField = true;
                Email.setError("required");
            }

            if (TextUtils.isEmpty(password)){
                isEmptyField = true;
                Password.setError("required");
            }
    }
}
