package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc {
    private String artist;
    private List<Track> tracks = new ArrayList<>();

    public CompactDisc(String title, String category, double cost, 
                       String director, int length, String artist, List<Track> tracks) {
        super(title, category, cost, director, length); 
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist() {
        return artist;
    }
    public List<Track> getTracks() {
        return tracks;
    }

    public int totalLength() {
        int total = 0;
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }
    
    public void play() {
        if (totalLength() <= 0) {
            System.out.println("ERROR: Cannot play CD '" + this.getTitle() + "'. Total length is 0 or less.");
            return;
        }
        
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("Total CD length: " + totalLength() + " minutes.");
        
        for (Track track : tracks) {
            track.play();
        }
    }
    
    public void addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("ERROR: Track '" + track.getTitle() + "' already exists.");
        } else {
            tracks.add(track);
            System.out.println("Track added.");
        }
    }
    
    public void removeTrack(Track track) {
        if (tracks.remove(track)) {
            System.out.println("Track removed.");
        } else {
            System.out.println("ERROR: Track not found in list.");
        }
    }
    
    @Override
    public String toString() {
        return "CD - " + super.toString() + " [Artist: " + artist + "]";
    }
}