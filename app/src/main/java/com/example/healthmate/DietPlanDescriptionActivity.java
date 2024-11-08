package com.example.healthmate;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class DietPlanDescriptionActivity extends AppCompatActivity {

    private ListView mealListView;
    private String selectedDietPlan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_plan_description);

        mealListView = findViewById(R.id.mealListView);

        selectedDietPlan = getIntent().getStringExtra("selectedDietPlan");

        List<String> meals = getMealsForDiet(selectedDietPlan);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, meals);
        mealListView.setAdapter(adapter);

        mealListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedMeal = (String) parent.getItemAtPosition(position);

                Intent intent = new Intent(DietPlanDescriptionActivity.this, FoodOptionsActivity.class);
                intent.putExtra("selectedMeal", selectedMeal);
                startActivity(intent);
            }
        });
    }

    private List<String> getMealsForDiet(String dietPlan) {
        List<String> meals = new ArrayList<>();
        switch (dietPlan) {
            case "Healthy Life Center":
                meals.add("Breakfast");
                meals.add("Lunch");
                meals.add("Dinner");
                meals.add("Snack");
                break;
            case "Fit Nutrition Hub":
                meals.add("Breakfast");
                meals.add("Lunch");
                meals.add("Dinner");
                meals.add("Snack");
                break;
            case "Wellness Nutrition Center":
                meals.add("Breakfast");
                meals.add("Lunch");
                meals.add("Dinner");
                meals.add("Snack");
                break;
            default:
                meals.add("Breakfast");
                meals.add("Lunch");
                meals.add("Dinner");
                meals.add("Snack");
                break;
        }
        return meals;
    }
}

