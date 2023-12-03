package com.example.dashb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Payment extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    private int passedNumber;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.textView15);
        Button button = findViewById(R.id.button7);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);

                textView.setText("Your choice: " + radioButton.getText());
            }
        });
        Intent intent = getIntent();
        passedNumber = intent.getIntExtra("NUMBER_KEY", 0);

        // Display the passed number in a TextView
        TextView tvPassedNumber = findViewById(R.id.tvPassedNumber);
        tvPassedNumber.setText("Passed Number: " + passedNumber);

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
                Intent intent = new Intent(Payment.this, experiment1.class);
                startActivity(intent);
            }
        });



    }
    public void checkBtn(View view){
        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.cod:
                if (checked);

            case R.id.gcash:
                if (checked);

            case R.id.bpi:
                if (checked);

            case R.id.bdo:
                if (checked);

        }
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