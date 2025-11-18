package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;
import java.util.ArrayList;
import java.util.List;

public class CompactDiscTest {
    public static void main(String[] args) {
        List<Track> trackList = new ArrayList<>();
        trackList.add(new Track("Track A - Intro", 5));
        trackList.add(new Track("Track B - Main Song", 15));
        trackList.add(new Track("Track C - Zero Length", 0)); 
        
        CompactDisc cd = new CompactDisc(2, "The Best Of OOP", "Education", 
                                         49.99, "AI Assistant", "Dr. Trang", trackList);
        
        System.out.println("Total length of CD: " + cd.totalLength() + " minutes.");
        
        cd.play();
        
        Track trackD = new Track("Track D", 10);
        cd.addTrack(trackD);
        cd.removeTrack(new Track("Track C - Zero Length", 0)); 
        System.out.println("\nTotal length after changes: " + cd.totalLength() + " minutes.");
    }
}