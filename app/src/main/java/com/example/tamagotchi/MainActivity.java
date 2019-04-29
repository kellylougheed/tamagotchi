package com.example.tamagotchi;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int hunger = 0;
    Button button;
    TextView text;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        text = findViewById(R.id.hungerLevel);

        handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                // This code will run every x milliseconds
                handler.postDelayed(this, 1000);
                hunger++;
                text.setText("Hunger Level: " + hunger);
            }
        };
        handler.post(run);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hunger = 0;
            }
        });
    }
}
