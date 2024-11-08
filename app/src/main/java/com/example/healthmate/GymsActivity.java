package com.example.healthmate;


import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class GymsActivity extends AppCompatActivity {

    private ListView gymsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyms);

        gymsListView = findViewById(R.id.gymsListView);

        List<Gym> gyms = MockupData.getGyms();


        ArrayAdapter<Gym> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, gyms);
        gymsListView.setAdapter(adapter);

        gymsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                Gym selectedGym = gyms.get(position);

                Intent intent = new Intent(GymsActivity.this, GymDetailsActivity.class);
                intent.putExtra("gymName", selectedGym.getName());
                intent.putExtra("gymDescription", selectedGym.getDescription());
                intent.putExtra("gymImageResId", selectedGym.getImageResId());
                startActivity(intent);
            }
        });
    }
}

