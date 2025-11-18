package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;
import java.util.ArrayList;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<BookAuthor> authorList = new ArrayList<>();
        authorList.add(new BookAuthor("Nguyen Van A", 1980, "Viet tieu su"));
        authorList.add(new BookAuthor("Tran Thi B", 1995, "Viet truyen ngan"));

        Book book = new Book(1, "Lap Trinh Huong Doi Tuong", "Giao trinh", 
                             25.50, 50000, authorList);

        System.out.println(book.toString());
    }
}
