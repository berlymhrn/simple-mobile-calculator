package com.example.project4berli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
    }

    public void onClickPlus(View view) {
        double num1 = Double.parseDouble(editText1.getText().toString());
        double num2 = Double.parseDouble(editText2.getText().toString());
        double result = num1 + num2;

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void onClickMinus(View view) {
        double num1 = Double.parseDouble(editText1.getText().toString());
        double num2 = Double.parseDouble(editText2.getText().toString());
        double result = num1 - num2;

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void onClickKali(View view) {
        double num1 = Double.parseDouble(editText1.getText().toString());
        double num2 = Double.parseDouble(editText2.getText().toString());
        double result = num1 * num2;

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void onClickBagi(View view) {
        double num1 = Double.parseDouble(editText1.getText().toString());
        double num2 = Double.parseDouble(editText2.getText().toString());
        double result = num1 / num2;

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}