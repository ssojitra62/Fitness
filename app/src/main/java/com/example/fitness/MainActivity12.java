package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageButton qd;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        qd = findViewById(R.id.qd);


        qd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity12.this,MainActivity13.class));
            }
        });
    }
}