package com.example.alcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("myApp","Oncreate()");
    }
    @Override
    public void onStart()
    {
        super.onStart();
        Log.d("myApp","OnStart()");
    }
    @Override
    public void onStop()
    {
        super.onStop();
        Log.d("myApp","OnStop()");
    }
    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.d("myApp","OnDestroy()");
    }
    @Override
    public void onResume()
    {
        super.onResume();
        Log.d("myApp","OnResume()");
    }
    @Override
    public void onPause()
    {
        super.onPause();
        Log.d("myApp","OnPause()");
    }

}