package com.example.healthmate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class NutritionCentersActivity extends AppCompatActivity {

    private ListView nutritionCentersListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_centers);

        nutritionCentersListView = findViewById(R.id.nutritionCentersListView);

        List<String> nutritionCenters = MockupData.loadCenters(NutritionCentersActivity.this);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nutritionCenters);
        nutritionCentersListView.setAdapter(adapter);

        nutritionCentersListView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedCenter = (String) parent.getItemAtPosition(position);

            Center selectedCenterDetails = MockupData.getCenterDetails(selectedCenter);

            Intent intent = new Intent(NutritionCentersActivity.this, CenterDetailsActivity.class);
            intent.putExtra("centerName", selectedCenterDetails.getName());
            intent.putExtra("centerDescription", selectedCenterDetails.getDescription());
            intent.putExtra("centerPhone", selectedCenterDetails.getPhone());
            intent.putExtra("centerHours", selectedCenterDetails.getHours());
            startActivity(intent);
        });
    }
}

