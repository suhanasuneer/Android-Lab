package com.example.sharedpreferences;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        TextView tvusername = findViewById(R.id.intname);
        TextView tvmobile = findViewById(R.id.intmobile);
        TextView tvemail = findViewById(R.id.intemail);
        TextView tvpass = findViewById(R.id.intpass);

        String username = getIntent().getStringExtra("username");
        String mobile = getIntent().getStringExtra("mobile");
        String email = getIntent().getStringExtra("email");
        String password = getIntent().getStringExtra("password");

        tvusername.setText("Username : " + username);
        tvmobile.setText("Mobile : " + mobile);
        tvemail.setText("Email : " + email);
        tvpass.setText("Password : " + password);



    }
}