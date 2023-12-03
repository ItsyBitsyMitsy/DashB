package com.example.dashb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

public class experiment1 extends AppCompatActivity {
    private int currentNumber = 0;
    private TextView tvNumber;
    private static final int REQUEST_CODE_SECOND_ACTIVITY = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiment1);
        // Initialize the TextView
        tvNumber = findViewById(R.id.tvNumber);
    }
    public void incrementNumber(View view) {
        currentNumber++;
        tvNumber.setText(String.valueOf(currentNumber));
    }
    public void decrementNumber(View view) {
        if(currentNumber > 0){
            currentNumber--;
            tvNumber.setText(String.valueOf(currentNumber));
        }
    }
    public void startSecondActivity(View view) {
        Intent intent = new Intent(this, experiment2.class);
        intent.putExtra("NUMBER_KEY", currentNumber);
        startActivityForResult(intent, REQUEST_CODE_SECOND_ACTIVITY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_SECOND_ACTIVITY && resultCode == RESULT_OK && data != null) {
            // Get the updated number from SecondActivity and update the TextView
            int updatedNumber = data.getIntExtra("UPDATED_NUMBER", 0);
            currentNumber = updatedNumber;
            tvNumber.setText(String.valueOf(currentNumber));
        }
    }
}