package com.example.maxofthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.e1);
        et2=(EditText)findViewById(R.id.e2);
        et3=(EditText)findViewById(R.id.e3);
        et4=(EditText)findViewById(R.id.e4);
    }
    public void onMax(View v)
    {

        int a,b,c,d;
        a = Integer.parseInt(et1.getText().toString());
        b = Integer.parseInt(et2.getText().toString());
        c = Integer.parseInt(et3.getText().toString());
        d = a>b?a:b;
        d=d>c?d:c;
        et4.setText("max"+d);




    }
    public void onMin(View v)
    {
        int a,b,c,d;
        a = Integer.parseInt(et1.getText().toString());
        b = Integer.parseInt(et2.getText().toString());
        c = Integer.parseInt(et3.getText().toString());
        d = a<b?a:b;
        d=d<c?d:c;
        et4.setText("min"+d);
    }

}