package com.example.reservationsmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bookings extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookings);

        // Setting up buttons
        Button profileButton = findViewById(R.id.homeButton);
        profileButton.setOnClickListener(this);

        Button favoritesButton = findViewById(R.id.profileButton);
        favoritesButton.setOnClickListener(this);

        Button bookingsButton = findViewById(R.id.favoritesButton);
        bookingsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent intent;
        switch ((v.getId()))
        {
            case R.id.homeButton:
                intent = new Intent(this, Home.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                break;
            case R.id.profileButton:
                intent = new Intent(this, MyProfile.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                break;
            case R.id.favoritesButton:
                intent = new Intent(this, Favorites.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                break;

        }
    }
}