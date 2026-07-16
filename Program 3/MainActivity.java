package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    float mvalue1,mvalue2;
    boolean add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText result = findViewById(R.id.text1);
        TextView casio = findViewById(R.id.casio);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnk = findViewById(R.id.btnk);
        Button btnp = findViewById(R.id.btnp);
        Button btnm = findViewById(R.id.btnm);
        Button btnd = findViewById(R.id.btnd);
        Button btnM = findViewById(R.id.btnM);
        Button btnz = findViewById(R.id.btnz);
        Button btnc = findViewById(R.id.btnc);
        Button btne = findViewById(R.id.btne);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"9");
            }
        });
        btnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+".");
            }
        });

        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"=");
            }
        });
        btnz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"0");
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText()+"");
            }
        });
        btnp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText("");
                }
                else {
                    mvalue1=Float.parseFloat((result.getText() + " "));
                    add = true;
                    result.setText(null);
                }
            }
        });
        btnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText("");
                }
                else {
                    mvalue1 = Float.parseFloat((result.getText() + " "));
                    sub = true;
                    result.setText(null);
                }
            }
        });
        btnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText(" ");
                }
                else {
                    mvalue1 = Float.parseFloat((result.getText() +" "));
                    div = true;
                    result.setText(null);
                }
            }
        });
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText("");
                }
                else {
                    mvalue1 = Float.parseFloat((result.getText() +" "));
                    mul = true;
                    result.setText(null);
                }
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result==null){
                    result.setText(" ");
                }
                else {
                    mvalue1 = Float.parseFloat((result.getText() +" "));
                    result.setText(null);
                }
            }
        });
        btne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    mvalue2 = Float.parseFloat((result.getText() +" "));
                    if (add=true)
                    {
                        result.setText(mvalue1+mvalue2 + " ");
                        add=false;
                    }
                    if(sub==true)
                    {
                        result.setText(mvalue1-mvalue2 + " ");
                        sub=false;
                    }
                    if(mul==true)
                    {
                        result.setText(mvalue1*mvalue2 + " ");
                        mul=false;
                    }
                    if(div==true)
                    {
                        result.setText(mvalue1/mvalue2 + " ");
                        div=false;
                    }
            }
        });

    }
}