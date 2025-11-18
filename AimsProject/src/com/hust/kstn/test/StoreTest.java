package com.hust.kstn.test;

import com.hust.kstn.models.DigitalVideoDisc;
import com.hust.kstn.models.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Tạo một cửa hàng mới
        Store store = new Store();
        
        // Tạo các đĩa DVD (Cần đủ tham số: Title, Category, Director, Length, Cost)
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        // Sửa lỗi: Thêm tên Director
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", "Ron Clements", 90, 18.99f);
        
        // Thêm các đĩa vào cửa hàng
        store.addDigitalVideoDisc(dvd1);
        store.addDigitalVideoDisc(dvd2);
        store.addDigitalVideoDisc(dvd3);
        
        // Kiểm tra xóa một sản phẩm tồn tại
        store.removeDigitalVideoDisc(dvd2);
        
        // Kiểm tra xóa một sản phẩm không tồn tại
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Titanic", "Drama", "James Cameron", 195, 29.99f);
        store.removeDigitalVideoDisc(dvd4); 
    }
}