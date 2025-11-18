package com.hust.kstn.models;

public class DigitalVideoDisc {
    private String id;
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public double getCost() {
        return cost;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DigitalVideoDisc() {
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        this.category = category;
        this.title = title;
        this.cost = cost;
    }

    public DigitalVideoDisc(String director, String category, String title, double cost) {
        this(category, title, cost); // Gọi constructor 3 để gán giá trị chung
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public void playDemo() {
        if (this.length > 0) {
            System.out.println("Playing DVD: " + this.title);
            System.out.println("DVD Length: " + this.length + " minutes.");
        } else {
            System.out.println("ERROR: The DVD " + this.title + " cannot be played.");
        }
    }

}
