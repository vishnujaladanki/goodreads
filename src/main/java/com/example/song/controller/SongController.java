 package com.example.song.controller;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
 import java.util.*;

import com.example.song.service.SongH2Service;
import com.example.song.model.Song;
@RestController
 public class SongController{
    @Autowired
    public SongH2Service songH2Service;
    @GetMapping("/songs")
    public ArrayList<Song> getSongs(){
      return songH2Service.getSongs();
    }
    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId){
      return songH2Service.getSongById(songId);
    }
    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song){
      return songH2Service.addSong(song);
    }
    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int songId, @RequestBody Song song){
      return songH2Service.updateSong(songId, song);
    }
    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("songId") int songId){
      songH2Service.deleteSong(songId);
    }
 }
 