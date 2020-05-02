package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button zarb,mnha,tghsim,jamgh;
    EditText text1,text2;
    TextView nateja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout wrapper = new RelativeLayout(this);
        EditText TextBox1 = new EditText(this);
        EditText TextBox2 = new EditText(this);
        Button btn1 = new Button(this);
        Button btn2 = new Button(this);
        Button btn3 = new Button(this);
        Button btn4 = new Button(this);
        TextView TextView = new TextView(this);

        wrapper.setBackgroundColor(Color.LTGRAY);
        TextBox1.setWidth(680); TextBox1.setId(11);
        TextBox2.setWidth(680); TextBox2.setId(12);
        btn1.setWidth(400); btn1.setId(13);
        btn2.setWidth(400); btn2.setId(14);
        btn3.setWidth(400); btn3.setId(15);
        btn4.setWidth(400); btn4.setId(16);
        TextView.setWidth(250); TextView.setId(17);


        // TextBox one
        RelativeLayout.LayoutParams TextBox1_details = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        TextBox1_details.addRule(RelativeLayout.CENTER_HORIZONTAL);
        TextBox1_details.addRule(RelativeLayout.CENTER_VERTICAL,0);
        TextBox1_details.setMargins(0 , 220,0,0);

        wrapper.addView(TextBox1, TextBox1_details);

        // TextBox tow
        RelativeLayout.LayoutParams TextBox2_details = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        TextBox2_details.addRule(RelativeLayout.BELOW,TextBox1.getId());
        TextBox2_details.addRule(RelativeLayout.CENTER_HORIZONTAL);

        wrapper.addView(TextBox2, TextBox2_details);

        // Button one
        RelativeLayout.LayoutParams btn1_details = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        btn1_details.addRule(RelativeLayout.BELOW,TextBox2.getId());
        btn1_details.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btn1.setText("ضرب");

        wrapper.addView(btn1, btn1_details);

        // Button tow
        RelativeLayout.LayoutParams btn2_details = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        btn2_details.addRule(RelativeLayout.BELOW,btn1.getId());
        btn2_details.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btn2.setText("تقسیم");

        wrapper.addView(btn2, btn2_details);

        // Button there
        RelativeLayout.LayoutParams btn3_details = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        btn3_details.addRule(RelativeLayout.BELOW,btn2.getId());
        btn3_details.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btn3.setText("جمع");

        wrapper.addView(btn3, btn3_details);

        // Button fore
        RelativeLayout.LayoutParams btn4_details = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        btn4_details.addRule(RelativeLayout.BELOW,btn3.getId());
        btn4_details.addRule(RelativeLayout.CENTER_HORIZONTAL);
        btn4.setText("تفریق");

        wrapper.addView(btn4, btn4_details);

        // TextView one
        RelativeLayout.LayoutParams TextView_details = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        TextView_details.addRule(RelativeLayout.BELOW,btn4.getId());
        TextView_details.addRule(RelativeLayout.CENTER_HORIZONTAL);
        TextView_details.setMargins(0,120,0,0);
        TextView.setText("0");

        wrapper.addView(TextView, TextView_details);

        setContentView(wrapper);

        //Processing Calculator

        zarb =(Button)findViewById(btn1.getId());
        mnha =(Button)findViewById(btn4.getId());
        tghsim =(Button)findViewById(btn2.getId());
        jamgh =(Button)findViewById(btn3.getId());
        text1 =(EditText)findViewById(TextBox1.getId());
        text2 =(EditText)findViewById(TextBox2.getId());
        nateja =(TextView)findViewById(TextView.getId());

        zarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number = 0;
                number = Float.parseFloat(text1.getText().toString());
                float number2 = 0;
                number2 = Float.parseFloat(text2.getText().toString());
                nateja.setText(String.valueOf(number*number2));
            }
        });
        mnha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number = 0;
                number = Float.parseFloat(text1.getText().toString());
                float number2 = 0;
                number2 = Float.parseFloat(text2.getText().toString());
                nateja.setText(String.valueOf(number-number2));
            }
        });
        tghsim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number = 0;
                number = Float.parseFloat(text1.getText().toString());
                float number2 = 0;
                number2 = Float.parseFloat(text2.getText().toString());
                nateja.setText(String.valueOf(number/number2));
            }
        });
        jamgh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float number = 0;
                number = Float.parseFloat(text1.getText().toString());
                float number2 = 0;
                number2 = Float.parseFloat(text2.getText().toString());
                nateja.setText(String.valueOf(number+number2));
            }
        });
    }
}
