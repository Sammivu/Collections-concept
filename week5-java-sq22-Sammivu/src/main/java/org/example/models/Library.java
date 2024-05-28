package org.example.models;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Library {

    List<Book> inventory;

    public Library() {
        this.inventory = new ArrayList<>();
    }

   public void addBook(Book book){
        inventory.add(book);
   }

    public List<Book> getBooks(){
        return  inventory;
    }



}


