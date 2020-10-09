package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void dollar(View view)
    {
        EditText dollar = (EditText)  findViewById(R.id.editText);
        Double dollardouble= Double.parseDouble(dollar.getText().toString());
        Double inr = dollardouble * 70;
        Toast.makeText(MainActivity.this,"Indian rupees = " + inr.toString(),Toast.LENGTH_LONG).show();

    }

    public void rupee(View view)
    {
        EditText rupee = (EditText)  findViewById(R.id.editText);
        Double rupeedouble = Double.parseDouble(rupee.getText().toString());
        Double dollars = rupeedouble / 70;
        Toast.makeText(MainActivity.this,"Dollars = " + dollars.toString(),Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
