package com.example.android.musicapp2;

/**
 * Created by rchan01 on 7/25/2018.
 */

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {

        super(context, 0, songs);
    }

    // Class to hold ArrayList Views

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the {@link Words} object located at this position in the list
        final Song currentSong = getItem(position);

        //Find the TextView in the list_item.xml layout with the default name
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        //Get the song name from the current song object and set this text on the
        songTextView.setText(currentSong.getSong());

        //Find the TextView in the list_item.xml layout with the miwok name
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.album_text_view);
        //Get the default name from the current Word object and set this text
        albumTextView.setText(currentSong.getAlbum());

        //Find the TextView in the list_item.xml layout with the miwok name
        TextView artistTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        //Get the default name from the current Word object and set this text
        artistTextView.setText(currentSong.getArtist());

        //Find the Album image in the songlist.xml layout with the miwok name
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.album_icon);
        //Get the default name from the current Word object and set this text
        iconView.setImageResource(currentSong.getAlbumArt());


        // Set the OnClick listener for the layout
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent nowPlayingIntent = new Intent(getContext(), NowPlayingActivity.class);
                // Add the song name and artist name to the intent sent to NowPlayingActivity

                nowPlayingIntent.putExtra("KEY_SONG", currentSong.getSong());
                nowPlayingIntent.putExtra("KEY_ARTIST", currentSong.getArtist());
                nowPlayingIntent.putExtra("KEY_ALBUM", currentSong.getAlbum());
                nowPlayingIntent.putExtra("KEY_ALBUMART", currentSong.getAlbumArt());
                getContext().startActivity(nowPlayingIntent);
            }
        });
        return listItemView;
    }


}
