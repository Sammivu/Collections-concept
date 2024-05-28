package org.example.services;

import org.example.models.Book;
import org.example.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public interface LibraryServices {

    Book checkBook(String nameOfBook, List<Book>books);
     String addPersonToQueueOnPriority (Person person);
    String addPeopleToQueueOnFirstCome(Person person);

    String giveBookBasedOnRole( String nameOfBook, List<Book> getBooks);


    String booksGivenByFirstCome(String nameOfBook, List<Book> getBooks);





}
