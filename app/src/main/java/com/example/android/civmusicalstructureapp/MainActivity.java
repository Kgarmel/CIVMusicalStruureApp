package com.example.android.civmusicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView nAlbums = findViewById(R.id.albums);

        // Set a click listener on that View
        // The code in this method will be executed when the albums category is clicked on.
        nAlbums.setOnClickListener(view -> {
            // Create a new intent to open the {@link PlaylistsActivity}
            Intent nAlbumsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

            // Start the new activity
            startActivity(nAlbumsIntent);
        });

        // Find the View that shows the family category
        TextView titles = findViewById(R.id.titles);

        // Set a click listener on that View
        // The code in this method will be executed when the family category is clicked on.
        titles.setOnClickListener(view -> {
            // Create a new intent to open the {@link FamilyActivity}
            Intent titlesIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

            // Start the new activity
            startActivity(titlesIntent);
        });

        // Find the View that shows the colors category
        TextView artists = findViewById(R.id.artists);

        // Set a click listener on that View
        // The code in this method will be executed when the colors category is clicked on.
        artists.setOnClickListener(view -> {
            // Create a new intent to open the {@link ColorsActivity}
            Intent artistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);

            // Start the new activity
            startActivity(artistsIntent);
        });


    }
    }
