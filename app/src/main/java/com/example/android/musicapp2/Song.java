package com.example.android.musicapp2;

public class Song {

    /**
     * Default classes for the song
     */
    private String mSong;
    private String mAlbum;
    private String mArtist;
    private int mAlbumArt;

    public Song(String song, String album, String artist, int albumArt) {
        mSong = song;
        mAlbum = album;
        mArtist = artist;
        mAlbumArt = albumArt;
    }

    public String getSong() {
        return mSong;
    }
    public String getAlbum() {
        return mAlbum;
    }
    public String getArtist() {
        return mArtist;
    }
    public int getAlbumArt() {
        return mAlbumArt;
    }

}