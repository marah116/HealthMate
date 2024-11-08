package com.example.healthmate;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class BMICalculatorActivity extends AppCompatActivity {

    private EditText weightEditText, heightEditText, ageEditText;
    private Button calculateButton;
    private TextView bmiResultTextView, idealWeightTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_calculator);


        weightEditText = findViewById(R.id.weightEditText);
        heightEditText = findViewById(R.id.heightEditText);
        ageEditText = findViewById(R.id.ageEditText);
        calculateButton = findViewById(R.id.calculateButton);
        bmiResultTextView = findViewById(R.id.bmiResultTextView);
        idealWeightTextView = findViewById(R.id.idealWeightTextView);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateBMI();
            }
        });
    }

    private void calculateBMI() {

        String weightStr = weightEditText.getText().toString();
        String heightStr = heightEditText.getText().toString();
        String ageStr = ageEditText.getText().toString();

        if (weightStr.isEmpty() || heightStr.isEmpty() || ageStr.isEmpty()) {
            Toast.makeText(this, "Please enter weight, height, and age", Toast.LENGTH_SHORT).show();
            return;
        }


        double weight = Double.parseDouble(weightStr);
        double height = Double.parseDouble(heightStr) / 100;
        int age = Integer.parseInt(ageStr);


        double bmi = weight / (height * height);
        bmiResultTextView.setText(String.format("Your BMI: %.2f", bmi));


        double idealWeight = calculateIdealWeight(age, height);
        idealWeightTextView.setText(String.format("Your Ideal Weight: %.2f kg", idealWeight));


        String advice = getBMIAdvice(bmi);
        bmiResultTextView.append("\n" + advice);
    }

    private double calculateIdealWeight(int age, double height) {

        if (age > 18) {
            return 50 + 0.9 * (height * 100 - 152);
        } else {
            return 45.5 + 0.9 * (height * 100 - 152);
        }
    }

    private String getBMIAdvice(double bmi) {
        if (bmi < 18.5) {
            return "You are underweight. It's recommended to gain some weight.";
        } else if (bmi < 24.9) {
            return "You have a normal weight. Keep maintaining a healthy lifestyle.";
        } else if (bmi < 29.9) {
            return "You are overweight. Consider losing some weight.";
        } else {
            return "You are obese. It's advisable to consult with a healthcare provider.";
        }
    }
}

