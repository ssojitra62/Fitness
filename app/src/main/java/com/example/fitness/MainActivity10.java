package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity10 extends AppCompatActivity {

    TextView badges,stats,history;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);


        history = findViewById(R.id.history);
        stats = findViewById(R.id.stats);
        badges = findViewById(R.id.badges);

        badges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity10.this,MainActivity9.class));
            }
        });



        stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity10.this,MainActivity11.class));
            }
        });
    }
}