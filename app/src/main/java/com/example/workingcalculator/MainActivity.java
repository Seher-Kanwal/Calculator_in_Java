package com.example.workingcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void divideNumber(View v)
    {
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        EditText result = (EditText) findViewById(R.id.result);

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int result1 = n1 /n2;
        result.setText("Answer is : "+ result1);
    }
    public void add_Number(View v){

        // here we just mapping the our ui with the variables
        EditText num1 = (EditText)findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        EditText res = (EditText) findViewById(R.id.result);

       // here we are getting the data or value from the text fields
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2= Integer.parseInt(num2.getText().toString());
        int result = n1 + n2;
        res.setText("The Sum is :" + result);
    }
    public void Subtract_Number(View v){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        EditText res = (EditText) findViewById(R.id.result);

        // here we are getting the data or value from the text fields
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2= Integer.parseInt(num2.getText().toString());
        int result = n1 - n2;
        res.setText("The Subtract is :" + result);
    }
    public void multiple_Number(View v){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        EditText res = (EditText) findViewById(R.id.result);

        // here we are getting the data or value from the text fields
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2= Integer.parseInt(num2.getText().toString());
        int result = n1 * n2;
        res.setText("The Answer is :" + result);
    }
}