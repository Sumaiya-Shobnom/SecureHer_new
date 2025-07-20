package com.example.secureher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }


    public void onViewInfoClick(View view) {
        Intent intent = new Intent(this, ViewInfoActivity.class);
        startActivity(intent);
    }

    public void onSafetyTipsClick(View view) {
        Intent intent = new Intent(this, SafetyTipsActivity.class);
        startActivity(intent);
    }

    public void onUsageGuideClick(View view) {
        Intent intent = new Intent(this, UsageGuideActivity.class);
        startActivity(intent);
    }

    public void onNewsAlertsClick(View view) {
        Intent intent = new Intent(this, NewsAlertsActivity.class);
        startActivity(intent);
    }

    public void onUpdateProfileClick(View view) {
        Intent intent = new Intent(this, UpdateProfileActivity.class);
        startActivity(intent);
    }

    public void onCommunityClick(View view) {
        Intent intent = new Intent(this, CommunityActivity.class);
        startActivity(intent);
    }

    public void onUploadContactsClick(View view) {
        Intent intent = new Intent(this, UploadContactsActivity.class);
        startActivity(intent);
    }

    public void onAddPoliceNumbersClick(View view) {
        Intent intent = new Intent(this, PoliceNumbersActivity.class);
        startActivity(intent);
    }
}
