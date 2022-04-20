package com.example.handson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button1 = findViewById(R.id.image_button1);
        ImageButton button2 = findViewById(R.id.image_button2);

        EditText text1 = findViewById(R.id.input_text);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n;
                String number = text1.getText().toString();
                if (number.equals("")) n = 0;
                else
                    n = Integer.parseInt(number);
                if (n == 999999) {
                    Toast.makeText(MainActivity.this, "You exceed the limit", Toast.LENGTH_SHORT).show();
                } else {
                    n = n + 1;
                    text1.setText(String.valueOf(n));
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n;
                String number = text1.getText().toString();
                if (number.equals("")) n = 0;
                else
                    n = Integer.parseInt(number);
                if (n > 0) {
                    n = n - 1;
                    text1.setText(String.valueOf(n));
                } else {
                    Toast.makeText(MainActivity.this, "No Negative nos allowed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageButton resetButton = findViewById(R.id.reset);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(String.valueOf(0));
            }
        });


    }
}