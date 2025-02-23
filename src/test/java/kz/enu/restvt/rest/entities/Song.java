package kz.enu.restvt.rest.entities;

public class Song {
    private int id;
    private String title;
    private int duration;
    private Artist artist;

    public Song() {}

    public Song(int id, String title, int duration, Artist artist) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public Artist getArtist() { return artist; }
    public void setArtist(Artist artist) { this.artist = artist; }
}
