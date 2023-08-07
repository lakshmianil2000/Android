package com.example.res;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class secondActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bb = getIntent().getExtras();
        String s1,s2;
        s1 = bb.getString("no1");
        s2 = bb.getString("no2");
        int a,b;
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        int c = a  +b;
        Intent res = new Intent();
        res.setData(Uri.parse("" + c));
        setResult(RESULT_OK,res);
        finish();
    }
    }

