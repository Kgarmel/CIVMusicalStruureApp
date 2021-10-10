package com.example.android.civmusicalstructureapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create an array of playlists
        ArrayList<String> playlists = new ArrayList<>();

        playlists.add("one");
        playlists.add("two");
        playlists.add("three");
        playlists.add("four");
        playlists.add("five");
        playlists.add("six");
        playlists.add("seven");
        playlists.add("eight");
        playlists.add("nine");
        playlists.add("ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, playlists);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


    }
}
}