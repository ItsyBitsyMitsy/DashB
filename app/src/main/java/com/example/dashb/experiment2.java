package com.example.dashb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class experiment2 extends AppCompatActivity {
    private int passedNumber;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment2);
        Intent intent = getIntent();
        passedNumber = intent.getIntExtra("NUMBER_KEY", 0);

        // Display the passed number in a TextView
        TextView tvPassedNumber = findViewById(R.id.tvPassedNumber);
        tvPassedNumber.setText("Passed Number: " + passedNumber);
    }
    public void incrementNumberInSecondActivity(View view) {
        passedNumber++;
        TextView tvPassedNumber = findViewById(R.id.tvPassedNumber);
        tvPassedNumber.setText("Passed Number: " + passedNumber);

        // Pass the updated number back to MainActivity
        Intent resultIntent = new Intent();
        resultIntent.putExtra("UPDATED_NUMBER", passedNumber);
        setResult(RESULT_OK, resultIntent);
    }
}