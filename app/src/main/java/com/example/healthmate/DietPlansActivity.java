package com.example.healthmate;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class DietPlansActivity extends AppCompatActivity {

    private ListView dietPlansListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_plans);

        dietPlansListView = findViewById(R.id.dietPlansListView);

        List<String> dietPlans = MockupData.getDietPlans();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dietPlans);
        dietPlansListView.setAdapter(adapter);

        dietPlansListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedDietPlan = dietPlans.get(position);

                Intent intent = new Intent(DietPlansActivity.this, DietPlanDescriptionActivity.class);
                intent.putExtra("selectedDietPlan", selectedDietPlan);
                startActivity(intent);
            }
        });
    }
}
