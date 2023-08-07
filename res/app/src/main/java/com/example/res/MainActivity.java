package com.example.res;

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

    public void onClick(View v) {
        EditText e1,e2;
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        Intent obj = new Intent("act.rp");
        obj.putExtra("no1", e1.getText().toString());
        obj.putExtra("no2", e2.getText().toString());
        startActivityForResult(obj,1);
    }

    @Override
    protected void onActivityResult(int rq, int rc, Intent data){
        super.onActivityResult(rq,rc, data);
        EditText e3;
        e3 = (EditText)findViewById(R.id.e1);
        e3.setText(data.getData().toString());
    }

}