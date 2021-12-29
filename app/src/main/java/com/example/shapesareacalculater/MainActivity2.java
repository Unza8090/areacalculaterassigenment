package com.example.shapesareacalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button button,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);

        button.setOnClickListener(v -> {
            Intent y = new Intent(MainActivity2.this,square.class);
            startActivity(y);
        });
        button2.setOnClickListener(v -> {
            Intent z = new Intent(MainActivity2.this,triangle.class);
            startActivity(z);
        });

        button3.setOnClickListener(v -> {
            Intent x = new Intent(MainActivity2.this,rectangle.class);
            startActivity(x);
        });
    }
}