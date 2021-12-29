package com.example.shapesareacalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class square extends AppCompatActivity {
    private EditText txt1;
    private TextView ans;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
        txt1=findViewById(R.id.editTextTextPersonName);
        ans=findViewById(R.id.textView6);
        button4=findViewById(R.id.button4);
        button4.setOnClickListener(v -> {
            int n1=Integer.parseInt(txt1.getText().toString());
            int area=n1*n1;
            ans.setText(String.valueOf(area));
        });
    }
}