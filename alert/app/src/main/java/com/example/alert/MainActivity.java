package com.example.alert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick( View v) {
        AlertDialog.Builder obj = new AlertDialog.Builder(this);
        obj.setMessage("Are u Sure");
        obj.setCancelable(true);

        obj.setPositiveButton(android.R.string.ok,this);
        obj.setNegativeButton(android.R.string.cancel,this);

        AlertDialog d = obj.create();
        d.show();
        obj.show();
    }
    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            finish();
        } else {
            dialogInterface.cancel();
        }
    }
    public void OnClick(View v)
    {
        AlertDialog.Builder obj = new AlertDialog.Builder(this);
        obj.setMessage("Are u Sure");
        obj.setCancelable(true);

        obj.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        obj.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        obj.show();
        AlertDialog d = obj.create();
        d.show();

    }

    }
}