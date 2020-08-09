package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button exit;
    private Button clear;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button equal;
    private TextView info;
    private TextView res;
    private final char addition='+';
    private final char substraction='-';
    private final char division='/';
    private final char multiplication='*';
    private final char equ=0;
    private double val1=Double.NaN;
    private double val2;
    private char action;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exit=findViewById(R.id.idexit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }

        });

        setupuiviews();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString()+"9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=addition;
                res.setText(String.valueOf(val1)+"+");
                info.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=substraction;
                res.setText(String.valueOf(val1)+"-");
                info.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=multiplication;
                res.setText(String.valueOf(val1)+"*");
                info.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=division;
                res.setText(String.valueOf(val1)+"/");
                info.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                action=equ;
                res.setText(res.getText().toString()+String.valueOf(val2)+"="+String.valueOf(val1));
                info.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(info.getText().length()>0)
                {
                    CharSequence name=info.getText().toString();
                    info.setText(name.subSequence(0,name.length()-1));
                }
                else
                {
                    val1=Double.NaN;
                    val2=Double.NaN;
                    info.setText(null);
                    res.setText(null);

                }
            }
        });
    }
    private void compute()
    {
        if(!Double.isNaN(val1))
        {
            val2=Double.parseDouble(info.getText().toString());
            switch (action)
            {
                case addition:
                    val1=val1+val2;
                    break;

                case  substraction:
                    val1=val1-val2;
                    break;

                case multiplication:
                    val1=val1*val2;
                    break;

                case division:
                    val1=val1/val2;
                    break;

                case equ:
                    break;
            }
        }
        else
        {
            val1=Double.parseDouble(info.getText().toString());
        }
    }

    private void setupuiviews()
    {
        zero=findViewById(R.id.id0);
        one=findViewById(R.id.id1);
        two=findViewById(R.id.id2);
        three=findViewById(R.id.id3);
        four=findViewById(R.id.id4);
        five=findViewById(R.id.id5);
        six=findViewById(R.id.id6);
        seven=findViewById(R.id.id7);
        eight=findViewById(R.id.id8);
        nine=findViewById(R.id.id9);
        add=findViewById(R.id.idplus);
        sub=findViewById(R.id.idsub);
        mul=findViewById(R.id.idmul);
        div=findViewById(R.id.iddiv);
        equal=findViewById(R.id.idequ);
        clear=findViewById(R.id.idclr);
        info=findViewById(R.id.idinfo);
        res=findViewById(R.id.idres);

    }
}
