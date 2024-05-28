package org.example.services;

import org.example.models.Book;
import org.example.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public interface LibraryServices {

     void addPersonToQueue (Person persons);


    boolean checkBookAvailability(Person person, List<Book> inventory);


    String booksGivenByRole (Person BorrowedByPerson, List<Book> inventory);

    void addRequest(Book book, Person person);

    ArrayList<Person> returnBook(Person person, Book book);

}
