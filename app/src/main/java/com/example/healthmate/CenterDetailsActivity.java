package com.example.healthmate;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CenterDetailsActivity extends AppCompatActivity {

    private TextView centerDetailsTitleTextView;
    private TextView centerDescriptionTextView;
    private TextView centerPhoneTextView;
    private TextView centerHoursTextView;
    private TextView centerLocationTextView;
    private TextView centerServicesTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_center_details);


        centerDetailsTitleTextView = findViewById(R.id.centerDetailsTitleTextView);
        centerDescriptionTextView = findViewById(R.id.centerDescriptionTextView);
        centerPhoneTextView = findViewById(R.id.centerPhoneTextView);
        centerHoursTextView = findViewById(R.id.centerHoursTextView);
        centerLocationTextView = findViewById(R.id.centerLocationTextView);
        centerServicesTextView = findViewById(R.id.centerServicesTextView);


        String centerName = getIntent().getStringExtra("centerName");
        Center selectedCenter = MockupData.getCenterDetails(centerName);


        if (selectedCenter != null) {
            centerDetailsTitleTextView.setText(selectedCenter.getName());
            centerDescriptionTextView.setText(selectedCenter.getDescription());
            centerPhoneTextView.setText("Phone: " + selectedCenter.getPhone());
            centerHoursTextView.setText("Hours: " + selectedCenter.getHours());
            centerLocationTextView.setText("Location: " + selectedCenter.getLocation());
            centerServicesTextView.setText("Services: \n" + selectedCenter.getServices());
        }
    }
}
