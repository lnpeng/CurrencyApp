package com.example.currencyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View view) {
        EditText dollarAmountEditText = (EditText) findViewById(R.id.dollarAmountEditText);

        double dollarAmountDouble = Double.parseDouble(dollarAmountEditText.getText().toString());

        double poundAmount = dollarAmountDouble * 0.75;

        Toast.makeText(MainActivity.this, "L" + poundAmount, Toast.LENGTH_SHORT).show();

        Log.i("amount", dollarAmountEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}