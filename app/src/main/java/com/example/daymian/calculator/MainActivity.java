// Standard
package com.example.daymian.calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

// For the calculator
import android.widget.TextView;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    // Declaring sum things
    private TextView screen;
    private String str1, str2, result, str, sign;
    private double a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Standard
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // For my calculations
        screen = (TextView)findViewById(R.id.textView);
        str = "";
    }

    public void onClick(View view) {
        Button number = (Button)view;
        str = number.getText().toString();
        screen.setText(str);
        a = Double.parseDouble(str);
    }

    public void onClickSigns(View view) {
        Button operand = (Button)view;
        sign = operand.getText().toString();

        if (sign.contains("AC")) {
            screen.setText("0");
            a = 0.0;
            b = 0.0;
        } else {
            screen.setText(sign);
            str = "";
        }
    }

    public void Calculate(View view) {
        //Button second = (Button)view;
        str2 = screen.getText().toString();
        b = Double.parseDouble(str2);

        if(sign.equals("+")) {
            result = (a + b) + "";
        }
        else if(sign.equals("-")) {
            result = (a - b) + "";
        }
        else if(sign.equals("X")) {
            result = (a * b) + "";
        }
        else if(sign.equals("/")) {
            result = (a / b) + "";
        }
        else if(sign.equals("%")) {
            result = (a % b) + "";
        }
        else if(sign.equals("+/-")) {
            result = (-1 * a) + "";
        }
        else {
            result = "wrong";
        }
        screen.setText(result);
    }
}
