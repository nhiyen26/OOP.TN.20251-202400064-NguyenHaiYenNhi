package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
    private int id; 
    private String title;
    private String category;
    private double cost;
    
    private String artist;
    private String director; 
    private List<Track> tracks = new ArrayList<>();
    
    public CompactDisc(int id, String title, String category, double cost, 
                       String artist, String director, List<Track> tracks) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.artist = artist;
        this.director = director;
        this.tracks = tracks;
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
            System.out.println("ERROR: Cannot play CD '" + this.title + "'. Total length is 0 or less.");
            return;
        }
        
        System.out.println("Playing CD: " + this.title);
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
        return "CD [" + id + "][" + title + "][" + artist + "][" + totalLength() + " mins]";
    }
}