package com.example.valuepass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onNext(View v)
    {
        Intent obj;
        obj = new Intent("act.secv");
        EditText e = (EditText)findViewById(R.id.et1);
        obj.putExtra("name",e.getText().toString());
        startActivity(obj);
    }



}