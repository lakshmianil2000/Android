package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weightEditText;
    private EditText heightEditText;
    private Button calculateButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightEditText = findViewById(R.id.weightEditText);
        heightEditText = findViewById(R.id.heightEditText);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {
        String weightString = weightEditText.getText().toString();
        String heightString = heightEditText.getText().toString();

        if (!weightString.isEmpty() && !heightString.isEmpty()) {
            float weight = Float.parseFloat(weightString);
            float height = Float.parseFloat(heightString) / 100; // Convert height to meters

            float bmi = weight / (height * height);

            String result;
            if (bmi < 18.5) {
                result = "Underweight";
            } else if (bmi < 24.9) {
                result = "Normal weight";
            } else if (bmi < 29.9) {
                result = "Overweight";
            } else {
                result = "Obese";
            }

            resultTextView.setText("BMI: " + String.format("%.1f", bmi) + "\n" + result);
        }
    }
}