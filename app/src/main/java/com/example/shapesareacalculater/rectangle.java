package com.example.shapesareacalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class rectangle extends AppCompatActivity {
    private EditText txt1;
    private EditText txt2;
    private TextView ans;
    private Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);
        txt1=findViewById(R.id.editTextTextPersonName4);
        txt2=findViewById(R.id.editTextTextPersonName5);
        ans=findViewById(R.id.textView8);
        button6=findViewById(R.id.button6);
        button6.setOnClickListener(v -> {
            int n1=Integer.parseInt(txt1.getText().toString());
            int n2=Integer.parseInt(txt2.getText().toString());
            int area=n1*n2;
            ans.setText(String.valueOf(area));
        });
    }
}