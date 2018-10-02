package com.example.android.musicapp2;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


import java.util.ArrayList;

/**
 * Music player that shows playlist and song that is currently playing after clicking on listiem
 */

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creates a list of songs, albums, and artists
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Remember Me", "Coco", "Benjamin Bratt", R.drawable.coco));
        songs.add(new Song("Proud Corazon", "Coco", "Anthony Gonzalez", R.drawable.coco));
        songs.add(new Song("Let it Go", "Frozen", "Idina Menzel", R.drawable.frozen));
        songs.add(new Song("In Summer", "Frozen", "Josh Gad", R.drawable.frozen));
        songs.add(new Song("Under the Sea", "The Little Mermaid", "Samuel E Wright", R.drawable.mermaid));
        songs.add(new Song("Kiss the Girl", "The Little Mermaid", "Samuel E Wright", R.drawable.mermaid));
        songs.add(new Song("How Far I'll Go", "Moana", "Alessia Cara", R.drawable.moana));
        songs.add(new Song("You're Welcome", "Moana", "Duane Johnson", R.drawable.moana));
        songs.add(new Song("The Sound of Silence", "Trolls", "Anna Kendrick", R.drawable.trolls));
        songs.add(new Song("Can't Stop the Feeling!", "Trolls", "Justin Timberlake", R.drawable.trolls));

        final SongAdapter songAdapter = new SongAdapter(this, songs);

        ListView listView = findViewById(R.id.listview_songs);

        listView.setAdapter(songAdapter);


    }

}
