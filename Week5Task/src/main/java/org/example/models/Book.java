package org.example.models;

import java.util.List;

public class Book {


    private String bookTitle;
    private String author;
    private int quantityAvailable;


    public Book(String bookTitle, String author, int quantityAvailable) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.quantityAvailable = quantityAvailable;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantityAvailable() {

        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

//     if (quantityAvailable >0){
//        return quantityAvailable;
//    }else return 0;
}
