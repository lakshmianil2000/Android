package com.example.hybridbased;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bPress;
        bPress = (Button)findViewById(R.id.b1);
        bPress.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_SHORT).show();
    }
}