package com.example.healthmate;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class GymDetailsActivity extends AppCompatActivity {

    private TextView gymNameTextView, gymDescriptionTextView;
    private ImageView gymImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gym_details_activity);

        gymNameTextView = findViewById(R.id.gymNameTextView);
        gymDescriptionTextView = findViewById(R.id.gymDescriptionTextView);
        gymImageView = findViewById(R.id.gymImageView);

        String gymName = getIntent().getStringExtra("gymName");
        String gymDescription = getIntent().getStringExtra("gymDescription");
        int gymImageResId = getIntent().getIntExtra("gymImageResId", 0);

        gymNameTextView.setText(gymName);
        gymDescriptionTextView.setText(gymDescription);
        gymImageView.setImageResource(gymImageResId);
    }
}
