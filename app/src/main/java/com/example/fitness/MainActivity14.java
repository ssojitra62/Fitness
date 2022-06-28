package com.example.fitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button next14;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);

        next14 = findViewById(R.id.next14);

        next14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity14.this,MainActivity15.class));
            }
        });
    }
}