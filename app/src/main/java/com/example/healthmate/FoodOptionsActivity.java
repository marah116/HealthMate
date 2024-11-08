package com.example.healthmate;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class FoodOptionsActivity extends AppCompatActivity {

    private ListView foodOptionsListView;
    private String selectedMeal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_options);

        foodOptionsListView = findViewById(R.id.foodOptionsListView);

        selectedMeal = getIntent().getStringExtra("selectedMeal");

        List<String> foodOptions = getFoodOptionsForMeal(selectedMeal);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, foodOptions);
        foodOptionsListView.setAdapter(adapter);
    }

    private List<String> getFoodOptionsForMeal(String meal) {
        List<String> foodOptions = new ArrayList<>();
        switch (meal) {
            case "Breakfast":
                foodOptions.add("Oatmeal with fruits and nuts");
                foodOptions.add("Greek yogurt with honey");
                foodOptions.add("Scrambled eggs with spinach");
                break;
            case "Lunch":
                foodOptions.add("Grilled chicken with quinoa and salad");
                foodOptions.add("Salmon with steamed vegetables");
                foodOptions.add("Tuna salad with olive oil dressing");
                break;
            case "Dinner":
                foodOptions.add("Baked salmon with steamed vegetables");
                foodOptions.add("Grilled turkey with sweet potato");
                foodOptions.add("Vegetable stir-fry with tofu");
                break;
            case "Snack":
                foodOptions.add("Almonds and dried fruit");
                foodOptions.add("Greek yogurt with granola");
                foodOptions.add("Carrot sticks with hummus");
                break;
            default:
                foodOptions.add("Option 1");
                foodOptions.add("Option 2");
                break;
        }
        return foodOptions;
    }
}
