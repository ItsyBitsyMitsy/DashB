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

        Intent intent = getIntent();
        int number = intent.getIntExtra("NUMBER_KEY", 0);
        int number1 = intent.getIntExtra("NUMBER_KEY_1", 0);
        int number2 = intent.getIntExtra("NUMBER_KEY_2", 0);
        int number3 = intent.getIntExtra("NUMBER_KEY_3", 0);
        int number4 = intent.getIntExtra("NUMBER_KEY_4", 0);

        // Display the number in a TextView
        TextView itlog = findViewById(R.id.itlog);
        TextView itlog1 = findViewById(R.id.itlog1);
        TextView itlog2 = findViewById(R.id.itlog2);
        TextView itlog3 = findViewById(R.id.itlog3);
        TextView itlog4 = findViewById(R.id.itlog4);
        itlog.setText(" " + number);
        itlog1.setText(" " + number1);
        itlog2.setText(" " + number2);
        itlog3.setText(" " + number3);
        itlog4.setText(" " + number4);

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