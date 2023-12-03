package com.example.dashb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.DisplayCutout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

public class BottledWater extends AppCompatActivity {
    TextView textView;
    private static final int REQUEST_CODE_SECOND_ACTIVITY = 1;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    private int currentNumber = 0;
    int currentNumber1 = 0;
    int currentNumber2 = 0;
    int currentNumber3 = 0;
    int currentNumber4 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottled_water);
        textView = findViewById(R.id.zero1);
        textView1 = findViewById(R.id.zero2);
        textView2 = findViewById(R.id.zero3);
        textView3 = findViewById(R.id.zero4);
        textView4 = findViewById(R.id.zero5);

        ImageButton back = findViewById(R.id.back_ic);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
    public void dagdag(View view){
        currentNumber++;
        textView.setText(String.valueOf(currentNumber));
    }
    public void bawas(View view){
        if (currentNumber > 0){
            currentNumber--;
            textView.setText(String.valueOf(currentNumber));
        }
    }
    public void dagdag1(View view){
        currentNumber1++;
        textView1.setText(String.valueOf(currentNumber1));
    }
    public void bawas1(View view){
        if (currentNumber1 > 0){
            currentNumber1--;
            textView1.setText(String.valueOf(currentNumber1));
        }
    }
    public void dagdag2(View view){
        currentNumber2++;
        textView2.setText(String.valueOf(currentNumber2));
    }
    public void bawas2(View view){
        if (currentNumber2 > 0){
            currentNumber2--;
            textView2.setText(String.valueOf(currentNumber2));
        }
    }
    public void dagdag3(View view){
        currentNumber3++;
        textView3.setText(String.valueOf(currentNumber3));
    }
    public void bawas3(View view){
        if (currentNumber3 > 0){
            currentNumber3--;
            textView3.setText(String.valueOf(currentNumber3));
        }
    }
    public void dagdag4(View view){
        currentNumber4++;
        textView4.setText(String.valueOf(currentNumber4));
    }
    public void bawas4(View view){
        if (currentNumber4 > 0){
            currentNumber4--;
            textView4.setText(String.valueOf(currentNumber4));
        }
    }
    public void checkouty(View view) {
        // Create an Intent to start the second activity
        Intent intent = new Intent(BottledWater.this, CheckoutActivity.class);
        // Pass the current number to the second activity
        intent.putExtra("NUMBER_KEY", currentNumber);
        intent.putExtra("NUMBER_KEY_1", currentNumber1);
        intent.putExtra("NUMBER_KEY_2", currentNumber2);
        intent.putExtra("NUMBER_KEY_3", currentNumber3);
        intent.putExtra("NUMBER_KEY_4", currentNumber4);
        // Start the second activity
        startActivity(intent);
    }
}