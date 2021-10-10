package com.example.android.civmusicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * {@link AlbumAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Album} objects.
 */
public class AlbumAdapter extends ArrayAdapter<Album> {


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param albums  A List of Album objects to display in a list
     */
    public AlbumAdapter(Activity context, ArrayList<Album> albums) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, albums);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Album} object located at this position in the list
        Album currentAlbum = null;
        currentAlbum = currentAlbum.get();

        // Find the TextView in the list_item.xml layout with the ID album_title
        TextView albumTextView = listItemView.findViewById(R.id.album_title_tv);
        // Get the version name from the current Album  object and
        // set this text on the name TextView
        albumTextView.setText(currentAlbum.getAlbumName());

        // Find the TextView in the list_item.xml layout with the ID album_type
        TextView typeTextView = listItemView.findViewById(R.id.album_type_tv);
        // Get the version number from the current Album  object and
        // set this text on the number TextView
        typeTextView.setText(currentAlbum.getAlbumType());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView albumArtistIconView = listItemView.findViewById(R.id.list_item_album_icon);

        if (currentAlbum.hasImage()) {
        // set the image to the image resource specified in the current word
        albumArtistIconView.setImageResource(currentAlbum.getAlbumPictureID());
        }
        else {albumArtistIconView.setVisibility(View.GONE);}

        // Find the TextView in the list_item.xml layout with the ID artist_name
        TextView artistTextView = listItemView.findViewById(R.id.artist_name_tv);
        // Get the version name from the current Album  object and
        // set this text on the name TextView
        artistTextView.setText(currentAlbum.getArtistName());

        // Find the TextView in the list_item.xml layout with the title_name
        TextView titleTextView = listItemView.findViewById(R.id.title_name_tv);
        // Get the version number from the current Album  object and
        // set this text on the number TextView
        titleTextView.setText(currentAlbum.getTitleName());

        // Find the TextView in the list_item.xml layout with the title_name
        TextView titleDurationTextView = listItemView.findViewById(R.id.title_duration_tv);
        // Get the version number from the current Album  object and
        // set this text on the number TextView
        titleDurationTextView.setText(currentAlbum.getTitleDuration());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
