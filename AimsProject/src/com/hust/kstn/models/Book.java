package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id; 
    private String title;
    private String category;
    private double cost;
    
    private int numOfTokens; 
    private List<BookAuthor> authors = new ArrayList<>(); 

    public Book(int id, String title, String category, double cost, 
                int numOfTokens, List<BookAuthor> authors) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.numOfTokens = numOfTokens;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book [" + id + "][" + title + "][" + cost + "][" + category + "][" 
               + numOfTokens + "]\nAuthors: " + authors;
    }
}