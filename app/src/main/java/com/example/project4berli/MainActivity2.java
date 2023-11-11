package com.example.project4berli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        double result = intent.getDoubleExtra("result", 0.0);

        TextView resultTextView = findViewById(R.id.textHasil);
        resultTextView.setText(String.valueOf(result));
    }
}