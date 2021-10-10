package com.example.android.civmusicalstructureapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);


        // Create an ArrayList of Albums objects
        ArrayList<Album> albums = new ArrayList<>();

        albums.add(new Album( "Heritage","Zouglou", R.drawable.album_one ));
        albums.add(new Album( "KONG","DJ", R.drawable.album_two ));
        albums.add(new Album( "ADORATION","Gospel", R.drawable.artist_one ));
        albums.add(new Album( "NO WOMAN NO CRY","RAGGA", R.drawable.artist_two ));

        // Create an {@link AlbumsActivityAdapter}, whose data source is a list of
        // {@link Album}s. The adapter knows how to create list item views for each item
        // in the list.
        AlbumAdapter albumAdapter = new AlbumAdapter(this, albums);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // album_list.xml layout file.
        ListView listView = findViewById(R.id.list);

    // Make the {@link ListView} use the {@link AlbumAdapter} we created above, so that the
    // {@link ListView} will display list items for each {@link Album} in the list.
    listView.setAdapter (albumAdapter);
}}