package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    EditText txt1;
    EditText txt2;
    TextView result;
    String num1,num2;
    Double number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAdd = findViewById(R.id.butAdd);
        txt1 = findViewById(R.id.input1);
        txt2 = findViewById(R.id.input2);
        result = findViewById(R.id.answer);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = txt1.getText().toString();
                num2 = txt2.getText().toString();
                try {
                    number1 = Double.parseDouble(num1);
                    number2 = Double.parseDouble(num2);
                    result.setText((number1+number2)+"");
                }catch (Exception e){
                    result.setText("Error");
                }
            }
        });
    }
}
