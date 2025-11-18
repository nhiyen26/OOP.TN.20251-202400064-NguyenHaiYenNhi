package com.hust.kstn.models;

public class Cart {
    private static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    private int qtyOrdered = 0;

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBER_ORDERED) {
            itemsInCart[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc '" + disc.getTitle() + "' has been added successfully.");
        } else {
            System.out.println("The cart is almost full. Cannot add disc: " + disc.getTitle());
        }
    }

    public void addDVD(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDVD(dvd1);
        addDVD(dvd2);
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

    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty. Cannot remove DVD.");
            return;
        }
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] != null && itemsInCart[i].equals(disc)) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsInCart[j] = itemsInCart[j + 1];
                }
                itemsInCart[qtyOrdered - 1] = null;
                qtyOrdered--;
                System.out.println("The disc '" + disc.getTitle() + "' has been removed successfully.");
                return;
            }
        }
        System.out.println("The disc '" + disc.getTitle() + "' does not exist in the cart.");
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] != null) {
                totalCost += itemsInCart[i].getCost();
            }
        }
        System.out.println("Total cost of the items in cart: " + String.format("%.2f", totalCost));
        return totalCost;
    }

    public void print() {
        System.out.println("=== Total item in cart: " + qtyOrdered + " ===");
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
        } else {
            for (int i = 0; i < qtyOrdered; i++) {
                DigitalVideoDisc item = itemsInCart[i];
                System.out.println((i + 1) + ". [ID: " + item.getId() + "] Title: " + item.getTitle() + " - Cost: "
                        + String.format("%.2f", item.getCost()));
            }
        }
        calculateTotalCost();
    }

    public DigitalVideoDisc search(String id) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] != null && itemsInCart[i].getId() != null && itemsInCart[i].getId().equals(id)) {
                System.out.println("\nSearch result (by ID):");
                System.out.println("[ID: " + itemsInCart[i].getId() + "] Title: " + itemsInCart[i].getTitle()
                        + " - Cost: " + String.format("%.2f", itemsInCart[i].getCost()));
                return itemsInCart[i];
            }
        }
        System.out.println("Product with ID " + id + " not found in the cart.");
        return null;
    }

    public DigitalVideoDisc search(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] != null && itemsInCart[i].getTitle() != null
                    && itemsInCart[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("\nSearch result (by Title):");
                System.out.println("[ID: " + itemsInCart[i].getId() + "] Title: " + itemsInCart[i].getTitle()
                        + " - Cost: " + String.format("%.2f", itemsInCart[i].getCost()));
                return itemsInCart[i];
            }
        }
        System.out.println("Product with title '" + title + "' not found in the cart.");
        return null;
    }

    public DigitalVideoDisc search(String title) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsInCart[i] != null && itemsInCart[i].getTitle() != null
                    && itemsInCart[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("\nSearch result (by Title):");
                System.out.println("[ID: " + itemsInCart[i].getId() + "] Title: " + itemsInCart[i].getTitle()
                        + " - Cost: " + String.format("%.2f", itemsInCart[i].getCost()));
                return itemsInCart[i];
            }
        }
        System.out.println("Product with title '" + title + "' not found in the cart.");
        return null;
    }

}
