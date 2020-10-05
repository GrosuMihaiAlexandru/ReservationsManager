package com.example.reservationsmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Setting up buttons
        Button profileButton = findViewById(R.id.profileButton);
        profileButton.setOnClickListener(this);

        Button favoritesButton = findViewById(R.id.favoritesButton);
        favoritesButton.setOnClickListener(this);

        Button bookingsButton = findViewById(R.id.bookingsButton);
        bookingsButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v)
    {
        Intent intent;

        switch ((v.getId()))
        {
            case R.id.profileButton:
                intent = new Intent(this, MyProfile.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.favoritesButton:
                intent = new Intent(this, Favorites.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;
            case R.id.bookingsButton:
                intent = new Intent(this, Bookings.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                break;

        }
    }
}