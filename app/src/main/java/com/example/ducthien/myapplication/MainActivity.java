package com.example.ducthien.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    float value;
    RelativeLayout manhinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manhinh = findViewById(R.id.activity_main);
        manhinh.setBackgroundResource(R.drawable.images);

    }




    void convertUsdToVnd()
    {  EditText usd=  findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);

        EditText  vnd = findViewById(R.id.vnd);
        vnd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double value = Integer.parseInt(usd.getText().toString());
        double result = value*23.2;
        vnd.setText(String.valueOf(result));

    }

    void convertVndToUsd()
    {  EditText usd=  findViewById(R.id.usd);
        usd.setInputType(InputType.TYPE_CLASS_NUMBER);
        EditText  vnd = findViewById(R.id.vnd);
        vnd.setInputType(InputType.TYPE_CLASS_NUMBER);

        double value  = Integer.parseInt(vnd.getText().toString());
        double result = value/23.2;
        usd.setText(String.valueOf(result));
    }

    public void click(View view)
    {
        convertUsdToVnd();
        Button b2= findViewById(R.id.submit2);
        b2.setEnabled(false);
    }

    public void reset(View view)
    {
        Toast.makeText(MainActivity.this,"All values have been reset",Toast.LENGTH_LONG).show();
        Button b1= findViewById(R.id.submit);
        b1.setEnabled(true);
        Button b2= findViewById(R.id.submit2);
        b2.setEnabled(true);
        EditText usd =  findViewById(R.id.usd);
        EditText  vnd = findViewById(R.id.vnd);

        usd.setText("");
        vnd.setText("");


    }

    public void click2(View view)
    {
        Button b1=  findViewById(R.id.submit);
        b1.setEnabled(false);
        convertVndToUsd();
    }



}
