package com.example.healthmate;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class CalorieCalculatorActivity extends AppCompatActivity {

    private EditText  gramsEditText;
    private ListView foodListView;
    private TextView calorieResultTextView;
    private FoodItem selectedFoodItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_calculator);


        gramsEditText = findViewById(R.id.gramsEditText);
        foodListView = findViewById(R.id.foodListView);
        calorieResultTextView = findViewById(R.id.calorieResultTextView);


        List<FoodItem> foodItems = MockupData.getFoodItems();
        ArrayAdapter<FoodItem> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, foodItems);
        foodListView.setAdapter(adapter);


        foodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                selectedFoodItem = (FoodItem) parent.getItemAtPosition(position);
                Toast.makeText(CalorieCalculatorActivity.this, "Selected: " + selectedFoodItem.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void calculateCalories(View view) {

        if (selectedFoodItem == null) {
            Toast.makeText(this, "Please select a food item from the list", Toast.LENGTH_SHORT).show();
            return;
        }

        String gramsStr = gramsEditText.getText().toString();
        if (gramsStr.isEmpty()) {
            Toast.makeText(this, "Please enter the number of grams", Toast.LENGTH_SHORT).show();
            return;
        }

        int grams = Integer.parseInt(gramsStr);
        // حساب السعرات بناءً على السعرات لكل جرام
        double calories = selectedFoodItem.getCaloriesPerGram() * grams;

        calorieResultTextView.setText("Total Calories: " + calories);
    }


}
