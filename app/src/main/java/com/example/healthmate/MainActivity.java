package com.example.healthmate;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button bmiButton;
    Button gymsButton;
    Button nutritionCentersButton;
    Button calorieCalculatorButton;
    Button dietPlansButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bmiButton = findViewById(R.id.bmiButton);
        gymsButton = findViewById(R.id.gymsButton);
        nutritionCentersButton = findViewById(R.id.nutritionCentersButton);
        calorieCalculatorButton = findViewById(R.id.calorieCalculatorButton);
        dietPlansButton = findViewById(R.id.dietPlansButton);


    }
    public void BMIOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, BMICalculatorActivity.class);
        startActivity(intent);
    }

    public void FindGymOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, GymsActivity.class);
        startActivity(intent);
    }

    public void NutritionOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, NutritionCentersActivity.class);
        startActivity(intent);
    }
    public void CaloriOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, CalorieCalculatorActivity.class);
        startActivity(intent);
    }
    public void DietOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, DietPlansActivity.class);
        startActivity(intent);
    }

}