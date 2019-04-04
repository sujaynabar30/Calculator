package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button dot;
    private Button clear;
    private Button add;
    private Button sub;
    private Button mult;
    private Button div;
    private Button cls;
    private TextView info;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setupUiViews(){

        one = (Button)findViewById(R.id.Btn1);
        two = (Button)findViewById(R.id.Btn2);
        three = (Button)findViewById(R.id.Btn3);
        four = (Button)findViewById(R.id.Btn4);
        five = (Button)findViewById(R.id.Btn5);
        six = (Button)findViewById(R.id.Btn6);
        seven = (Button)findViewById(R.id.Btn7);
        eight = (Button)findViewById(R.id.Btn8);
        nine = (Button)findViewById(R.id.Btn9);
        zero = (Button)findViewById(R.id.Btn0);
        dot = (Button)findViewById(R.id.Btn10);
        clear = (Button)findViewById(R.id.Btn16);
        add = (Button)findViewById(R.id.Btn15);
        sub = (Button)findViewById(R.id.Btn14);
        mult = (Button)findViewById(R.id.Btn13);
        div = (Button)findViewById(R.id.Btn12);
        cls = (Button)findViewById(R.id.Btn16);
        info = (TextView) findViewById(R.id.tv_control);
        result = (TextView)findViewById(R.id.tv_result);

    }
}
