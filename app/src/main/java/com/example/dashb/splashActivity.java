package com.example.dashb;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import java.util.Timer;
import android.content.Intent;

public class splashActivity extends AppCompatActivity {

    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Thread thread = new Thread() {
            public void run() {
                try {
                    Thread.sleep(3000);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }

                finally {
                    Intent intent = new Intent(splashActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        thread.start();
    }
}