package com.example.shapesareacalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class triangle extends AppCompatActivity {
    private EditText txt1;
    private EditText txt2;
    private TextView ans;
    private Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle);
        txt1=findViewById(R.id.editTextTextPersonName2);
        txt2=findViewById(R.id.editTextTextPersonName3);
        ans=findViewById(R.id.textView7);
        button5=findViewById(R.id.button5);
        button5.setOnClickListener(v -> {
            int n1=Integer.parseInt(txt1.getText().toString());
            int n2=Integer.parseInt(txt2.getText().toString());
            int area=n1*n2/2;
            ans.setText(String.valueOf(area));
        });
    }
}