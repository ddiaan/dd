package kz.enu.restvt.rest.controller;

import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kz.enu.restvt.rest.entities.Song;
import kz.enu.restvt.rest.entities.Artist;
import kz.enu.restvt.rest.entities.Playlist;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/music")
public class Controller {

    @Autowired
    private ObjectMapper objectMapper;

    private final Artist artist = new Artist(1, "Queen", "Rock");
    private final List<Song> songs = Arrays.asList(
            new Song(1, "Bohemian Rhapsody", 355, artist),
            new Song(2, "We Will Rock You", 200, artist)
    );
    private final Playlist playlist = new Playlist(1, "Rock Classics", songs);

    @GetMapping("/hello")
    public String printHello() {
        return "Hello, Music Library!";
    }

    @GetMapping("/songs")
    public String getSongs() {
        try {
            return objectMapper.writeValueAsString(songs);
        } catch (JsonProcessingException e) {
            return "Error converting to JSON: " + e.getMessage();
        }
    }

    @GetMapping("/artists")
    public String getArtists() {
        try {
            return objectMapper.writeValueAsString(artist);
        } catch (JsonProcessingException e) {
            return "Error converting to JSON: " + e.getMessage();
        }
    }

    @GetMapping("/playlist")
    public String getPlaylist() {
        try {
            return objectMapper.writeValueAsString(playlist);
        } catch (JsonProcessingException e) {
            return "Error converting to JSON: " + e.getMessage();
        }
    }
}
