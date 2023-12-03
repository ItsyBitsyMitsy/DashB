package com.example.dashb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity {
    private int passedNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        ImageButton back = findViewById(R.id.back_ic);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Button btn = findViewById(R.id.checkOut);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CheckoutActivity.this, experiment1.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        int number = intent.getIntExtra("NUMBER_KEY", 0);

        // Display the number in a TextView
        TextView tvResult = findViewById(R.id.itlog);
        tvResult.setText(" " + number);
    }
    public void checkBtn(View view){
        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.cod:
                if (checked);
                break;
            case R.id.gcash:
                if (checked);
                break;
            case R.id.bpi:
                if (checked);
                break;
            case R.id.bdo:
                if (checked);
                break;
        }
    }

}