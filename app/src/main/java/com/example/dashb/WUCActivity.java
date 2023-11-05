package com.example.dashb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WUCActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wucactivity);

        ImageButton back = findViewById(R.id.back_ic);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WUCActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        CardView tapCard1 = findViewById(R.id.card1);
        tapCard1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WUCActivity.this, CheckoutActivity.class);
                startActivity(intent);
            }
        });

        CardView tapCard2 = findViewById(R.id.card2);
        tapCard2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WUCActivity.this, CheckoutActivity.class);
                startActivity(intent);
            }
        });

        CardView tapCard3 = findViewById(R.id.card3);
        tapCard3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WUCActivity.this, CheckoutActivity.class);
                startActivity(intent);
            }
        });

        CardView tapCard4 = findViewById(R.id.card4);
        tapCard4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WUCActivity.this, CheckoutActivity.class);
                startActivity(intent);
            }
        });
    }
}