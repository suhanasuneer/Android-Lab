package com.example.gridview;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] images = {
            R.drawable.cooper,
            R.drawable.bugatti,
            R.drawable.ferrari,
            R.drawable.bmw,
            R.drawable.rolls,
            R.drawable.bentley
    };

    String[] names = {
            "cooper",
            "bugatti",
            "ferrari",
            "bmw",
            "rolls",
            "bentley"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        ImageAdapter adapter = new ImageAdapter(this, images);

        gridView.setAdapter((ListAdapter) adapter);

        gridView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(
                            AdapterView<?> adapterView,
                            View view,
                            int i,
                            long l) {

                        showAlertDialog(i);
                    }
                }
        );
    }

    private void showAlertDialog(int position) {

        ImageView imageView = new ImageView(this);

        imageView.setImageResource(images[position]);

        AlertDialog.Builder builder =
                new AlertDialog.Builder(this);

        builder.setTitle(names[position]);

        builder.setMessage(
                "You selected " + names[position]
        );

        builder.setIcon(images[position]);

        builder.setPositiveButton("OK", null);

        builder.show();
    }
}