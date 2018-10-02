package com.example.android.musicapp2;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * This activity displays song title, artist, album, and album art from clicked listitem from MainActivity.
 * Icons: https://icons8.com/icon/52996/playlist
 */

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nowplaying);

        // Get the intent that was used to start this activity
        Intent nowPlayingIntent = getIntent();


        // Sets data to appropriate TextViews
        TextView playingSongText = findViewById(R.id.playing_song);
        playingSongText.setText(nowPlayingIntent.getStringExtra("KEY_SONG"));

        TextView playingAlbumText = findViewById(R.id.playing_album);
        playingAlbumText.setText(nowPlayingIntent.getStringExtra("KEY_ALBUM"));

        TextView playingArtistText = findViewById(R.id.playing_artist);
        playingArtistText.setText(nowPlayingIntent.getStringExtra("KEY_ARTIST"));

        ImageView playingAlbumIcon = findViewById(R.id.playing_albumicon);
        playingAlbumIcon.setImageResource(nowPlayingIntent.getIntExtra("KEY_ALBUMART", 0));


        final ImageView playButton = findViewById(R.id.play_button);

        // This code switches play and pause buttons
        playButton.setTag(1);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (playButton.getTag().equals(1)) {
                    playButton.setImageResource(R.drawable.pause50);
                    playButton.setTag(2);
                } else {
                    playButton.setImageResource(R.drawable.play50);
                    playButton.setTag(1);
                }

            }
        });
    }
}
//add back button to action bar

