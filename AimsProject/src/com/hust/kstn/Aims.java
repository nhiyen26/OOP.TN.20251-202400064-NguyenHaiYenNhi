package com.hust.kstn;

import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;

public class Aims {

    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
        dvd1.setId("DVD001");

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
        dvd2.setId("DVD002");

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 18.99);
        dvd3.setId("DVD003");

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Titanic", "Drama", "James Cameron", 195, 29.99);
        dvd4.setId("DVD004");

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Demo Play Test", "Test", "Test Director", 0, 5.00);
        dvd5.setId("DVD005");

        /*
         * cart.addDVD(dvd1); // add dvd
         * cart.addDVD(dvd2);
         * cart.addDVD(dvd3);
         */

        cart.addDVD(dvd1, dvd2);
        cart.addDVD(dvd3);

        cart.print();

        cart.removeDVD(dvd2); // remove dvd
        cart.calculateTotalCost(); // calculate cost
        cart.print();

        cart.removeDVD(dvd4);
        cart.addDVD(dvd4);

        cart.search("DVD001"); // search by ID
        cart.search("The Lion King"); // search by title
        cart.search("DVD099");

    }

}
