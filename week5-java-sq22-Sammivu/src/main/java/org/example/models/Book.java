package org.example.models;

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

    public String getAuthor() {
        return author;
    }

    public int getQuantityAvailable() {
        if (quantityAvailable <= 0) {
            System.out.println("No book available");

        }
            return quantityAvailable;

    }


//    public boolean borrowBook() {
//        if (quantityAvailable > 0) {
//            quantityAvailable--;
//            return true;
//        } else {
//            return false;
//        }
//    }


    public void returnBook() {
        quantityAvailable++;
    }

    @Override
    public String toString() {
        return "Book:" +
                "BookTitle= " + bookTitle  +
                ", Author= " + author ;
    }
}
