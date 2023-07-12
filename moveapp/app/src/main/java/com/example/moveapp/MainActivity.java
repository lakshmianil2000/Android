package com.example.moveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onMove(View v){
        EditText e1,e2;
        e1=(EditText)findViewById(R.id.et1);
        e2=(EditText)findViewById(R.id.et2);
        String str=e1.getText().toString();
        if(str == ""|| str.length()==0)
        {
            Toast.makeText(this,"Enter value",Toast.LENGTH_SHORT).show();
        }
        else {
            e2.setText(str);
        }
        e1.setText("");
        e1.requestFocus();

    }
}