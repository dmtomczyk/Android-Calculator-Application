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
    private String str1;
    private String str2;
    private String result;
    private String str;
    private String sign = "";
    public double a;
    public double b;

    public double[] thing;

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

        if (sign.equals("")) {
            a = Double.parseDouble(str);
        } else {
            b = Double.parseDouble(str);
        }

    }

    public void onClickSigns(View view) {
        Button operand = (Button)view;
        screen.setText(sign);
        sign = operand.getText().toString();

        if (sign.contains("AC")) {
            screen.setText("0");
            a = 0.0;
            b = 0.0;
            sign = "";
            result = "";
        } else if (sign.contains("+/-")) {
            a = (-1 * a);
            screen.setText(a + "");
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
        } else {
            result = "wrong";
        }
        screen.setText(result);
        a = Double.parseDouble(result);
        sign = "";
    }
}
