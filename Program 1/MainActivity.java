package com.example.loginpagee;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText Username = findViewById(R.id.edit1);
        EditText Password = findViewById(R.id.edit2);
        Button Submit = findViewById(R.id.btn);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Username.getText().toString().equals("admin") && Password.getText().toString().equals("admin123"))
                {
                    Toast.makeText(MainActivity.this,"LOGIN SUCCESSFUL!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Invalid username or password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}