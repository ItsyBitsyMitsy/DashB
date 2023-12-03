package com.example.dashb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        CardView drinkCard = findViewById(R.id.contributeCard);
        drinkCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DrinkingWaterActivity.class);
                startActivity(intent);

            }
        });

        CardView tapCard = findViewById(R.id.practiceCard);
        tapCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WUCActivity.class);
                startActivity(intent);
            }
        });

        TextView accSet = findViewById(R.id.textView24);
        accSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AccountSettings.class);
                startActivity(intent);
            }
        });



    }
}