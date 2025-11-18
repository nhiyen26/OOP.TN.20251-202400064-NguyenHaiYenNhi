package com.hust.kstn.models;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsInCart[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added.");
        } else {
            System.out.println("The cart is almost full.");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            if (qtyOrdered < MAX_NUMBER_ORDERED) {
                addDigitalVideoDisc(disc);
            } else {
                System.out.println("The cart is full. Cannot add: " + disc.getTitle());
                break;
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
            return;
        }
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsInCart[j] = itemsInCart[j + 1];
                }
                itemsInCart[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc has been removed.");
                return;
            }
        }
        System.out.println("The disc does not exist in the cart.");
    }

    public float calculateTotalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsInCart[i].getCost();
        }
        return total;
    }

    public void print() {
        System.out.println("================THE CURRENT CART================");
        System.out.println("Total items: " + qtyOrdered); 
        System.out.println("Ordered Items:");
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
        } else {
            for (int i = 0; i < qtyOrdered; i++) {
                System.out.println((i + 1) + ". " + itemsInCart[i].toString());
            }
        }
        System.out.println("Subtotal: " + String.format("%.2f", calculateTotalCost()) + "$");
        System.out.println("================================================"); 
    }
        
    public void search(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i].getId() == id) {
                System.out.println("Found matching ID: " + itemsInCart[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match found for ID: " + id);
        }
    }

    public void search(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found matching Title: " + itemsInCart[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match found for Title: " + title);
        }
    }
}


