package com.hust.kstn.models;

public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100]; 
    private int itemsCount = 0; 
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsCount < 100) {
            itemsInStore[itemsCount] = disc;
            itemsCount++;
            System.out.println("The disc '" + disc.getTitle() + "' has been added to the store.");
        } else {
            System.out.println("Store is full. Cannot add: " + disc.getTitle());
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsCount == 0) {
            System.out.println("The store is currently empty.");
            return;
        }
        for (int i = 0; i < itemsCount; i++) {
            if (itemsInStore[i] != null && itemsInStore[i].equals(disc)) {
                for (int j = i; j < itemsCount - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[itemsCount - 1] = null;
                itemsCount--;
                System.out.println("The disc '" + disc.getTitle() + "' has been removed from the store.");
                return;
            }
        }
        System.out.println("The disc '" + disc.getTitle() + "' does not exist in the store.");
    }
}







