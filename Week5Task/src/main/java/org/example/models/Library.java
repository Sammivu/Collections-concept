package org.example.models;

import org.example.services.PersonComparator;

import java.util.*;

public class Library {

    public static PriorityQueue<Person> peoplePriorityQueue = new PriorityQueue<>(new PersonComparator());
    public static Queue<Person> peopleQueue= new LinkedList<>();
    public static List<Book> getBooks() {

        List<Book>libraryBooks= new ArrayList<>();


                libraryBooks.add(new Book("Things fall Apart", "Chinua Achebe", 1));
                libraryBooks.add(new Book("Purple Hibiscus", "Chimamanda Ngozi Adichie", 1 ));
                libraryBooks.add(new Book("Stay with Me", "Ayọ̀bámi Adébáyọ̀", 3));


                        return libraryBooks;
    }

}
