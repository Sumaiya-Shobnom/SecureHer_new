package com.example.secureher;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class profile extends AppCompatActivity {

    TextView tvName, tvEmail, tvAddress, tvBloodGroup;
    ImageView ivProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
        tvAddress = findViewById(R.id.tvAddress);
        tvBloodGroup = findViewById(R.id.tvBloodGroup);
        ivProfile = findViewById(R.id.ivProfile);


        tvName.setText("Kohinur Akter Mim");
        tvEmail.setText("kohinur@example.com");
        tvAddress.setText("Dhaka, Bangladesh");
        tvBloodGroup.setText("O+");


    }
}
