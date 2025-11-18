package com.hust.kstn.models;

public class Track {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    
    public void play() {
        if (this.length > 0) {
            System.out.println("Playing track: " + this.title);
            System.out.println("Track length: " + this.length);
        } else {
            System.out.println("ERROR: Cannot play track '" + this.title + "'. Length is 0 or less."); 
        }
    }
    
    @Override
    public String toString() {
        return title + " - " + length + " mins";
    }
}