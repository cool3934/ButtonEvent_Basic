package com.example.buttonevent_basic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonCE, buttonC, buttonBS, buttonDivide, buttonMultiply, buttonSub, buttonAdd,
            buttonADS, buttonComma, buttonEqual;
    int value1, value2;
    boolean add, sub, mul, div;
    boolean check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView1);
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonCE = (Button) findViewById(R.id.buttonCE);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonBS = (Button) findViewById(R.id.buttonBS);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonSub = (Button) findViewById(R.id.buttonSubtract);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonADS = (Button) findViewById(R.id.buttonAdd_Divide_Sub);
        buttonComma = (Button) findViewById(R.id.buttonComma);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check == true) {
                    textView.setText("");
                    check = false;
                }
                textView.setText(textView.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check == true) {
                    textView.setText("");
                    check = false;
                }
                textView.setText(textView.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check == true) {
                    textView.setText("");
                    check = false;
                }
                textView.setText(textView.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check == true) {
                    textView.setText("");
                    check = false;
                }
                textView.setText(textView.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check == true) {
                    textView.setText("");
                    check = false;
                }
                textView.setText(textView.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check == true) {
                    textView.setText("");
                    check = false;
                }
                textView.setText(textView.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check == true) {
                    textView.setText("");
                    check = false;
                }
                textView.setText(textView.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check == true) {
                    textView.setText("");
                    check = false;
                }
                textView.setText(textView.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check == true) {
                    textView.setText("");
                    check = false;
                }
                textView.setText(textView.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check == true) {
                    textView.setText("");
                    check = false;
                }
                textView.setText(textView.getText() + "9");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().equals(""))
                    textView.setText("");
                else {
                    value1 = Integer.parseInt(textView.getText() + "");
                    add = true;
                    textView.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().equals(""))
                    textView.setText("");
                else {
                    value1 = Integer.parseInt(textView.getText() + "");
                    sub = true;
                    textView.setText(null);
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().equals(""))
                    textView.setText("");
                else {
                    value1 = Integer.parseInt(textView.getText() + "");
                    mul = true;
                    textView.setText(null);
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textView.getText().equals(""))
                    textView.setText("");
                else {
                    value1 = Integer.parseInt(textView.getText() + "");
                    div = true;
                    textView.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView.getText().equals(""))
                    textView.setText("");
                else {
                    check = true;
                    value2 = Integer.parseInt(textView.getText() + "");

                    if(add == true) {
                        textView.setText(value1 + value2 + "");
                        add = false;
                    }
                    if(sub == true) {
                        textView.setText(value1 - value2 + "");
                        sub = false;
                    }
                    if(mul == true) {
                        textView.setText(value1 * value2 + "");
                        mul = false;
                    }
                    if(div == true) {
                        textView.setText(value1 / value2 + "");
                        div = false;
                    }
                }
            }
        });
    }
}
