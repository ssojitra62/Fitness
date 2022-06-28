package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button start13 ;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        start13 = findViewById(R.id.start13);


        start13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity13.this,MainActivity14.class));
            }
        });
    }
}