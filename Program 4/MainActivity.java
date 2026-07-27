package com.example.sharedpreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    SharedPreferences SharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.name);
        EditText phNo = findViewById(R.id.phNo);
        EditText email = findViewById(R.id.email);
        EditText pass = findViewById(R.id.pass);
        EditText ConPass = findViewById(R.id.ConPass);
        Button btn1 = findViewById(R.id.btn1);

        SharedPreferences = getSharedPreferences("UserDetails",MODE_PRIVATE);
        editor = SharedPreferences.edit();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String names = name.getText().toString().trim();
                String phNos = phNo.getText().toString().trim();
                String emails = email.getText().toString().trim();
                String passs = pass.getText().toString().trim();
                String ConPasss = ConPass.getText().toString().trim();

                if (names.isEmpty()) {
                    name.setError("Username is Empty");
                    name.requestFocus();
                    return;
                }
                if (phNos.isEmpty()) {
                    phNo.setError("Mobile number is Empty");
                    phNo.requestFocus();
                    return;
                }
                if (emails.isEmpty()) {
                    email.setError("Input Email");
                    email.requestFocus();
                    return;
                }
                if (passs.length() < 6) {
                    pass.setError("Length must be minimum 6 characters");
                    pass.requestFocus();
                    return;
                }
                if (!passs.equals(ConPasss)) {
                    ConPass.setError("password not matched");
                    ConPass.requestFocus();
                    return;

                }
                Toast.makeText(MainActivity.this, "Registration Successful",Toast.LENGTH_SHORT).show();

                editor.putString("keyusername", names);
                editor.putString("keymobile", phNos);
                editor.putString("keyemail", emails);
                editor.putString("keypassword2", ConPasss);
                editor.apply();

            }

        });
    }
}
