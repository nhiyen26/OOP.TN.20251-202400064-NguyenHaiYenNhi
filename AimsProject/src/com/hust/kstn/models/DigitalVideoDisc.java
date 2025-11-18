package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc { 
    
    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        super(title, category, cost, director, length); 
    }
    
    public DigitalVideoDisc(String title) {
        super(title, "Unknown Category", 0.0, "Unknown Director", 0);
    }
    
    public DigitalVideoDisc(String category, String title, double cost) {
        super(title, category, cost, "Unknown Director", 0);
    }
    
    public DigitalVideoDisc(String director, String category, String title, double cost) {
        super(title, category, cost, director, 0);
    }
    
    public void play() {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength() + " minutes.");
        } else {
            System.out.println("ERROR: Cannot play DVD '" + this.getTitle() + "'. Length is 0 or less.");
        }
    }

    @Override
    public String toString() {
        return "DVD - " + super.toString(); 
    }
   
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DigitalVideoDisc)) return false;
        DigitalVideoDisc other = (DigitalVideoDisc) obj;
        return this.getTitle().equals(other.getTitle()) &&
               this.getCategory().equals(other.getCategory()) &&
               this.getCost() == other.getCost();
    }
}