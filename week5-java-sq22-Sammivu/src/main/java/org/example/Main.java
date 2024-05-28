package org.example;

import org.example.enums.Role;
import org.example.models.Book;
import org.example.models.Library;
import org.example.models.Person;
import org.example.services.implementation.LibraryServicesImpl;

import java.util.ArrayList;
import java.util.PriorityQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PriorityQueue<Person> people = new PriorityQueue<>();
        //People that can be added to the queue
        Person person1 = new Person("Sampson", 30, Role.TEACHER);
        Person person2 = new Person("Alabo Hamlet", 23,  Role.SENIOR_STUDENT);
        Person person3 = new Person("Sunday Agbo", 40, Role.TEACHER);
        Person person4 = new Person("Royal Mathias", 16, Role.JUNIOR_STUDENT);

        //Books that can be added to the Library
        Book book1 = new Book("How time flies" ,"Hamlet",1);
        Book book2 = new Book("Today is here", "Royal",1);
        Book book3 = new Book("The future is here", "Yomi",0);

        Library librarian = new Library();
        librarian.addBook(book1);
        librarian.addBook(book2);
        librarian.addBook(book3);


        LibraryServicesImpl libraryServices = new LibraryServicesImpl();

        //Adding people to queue
        libraryServices.addPersonToQueue(person2);
        libraryServices.addPersonToQueue(person3);
        libraryServices.addPersonToQueue(person4);
        libraryServices.addPersonToQueue(person1);

        // People's request to borrow book
        person1.setBookBorrowed(book3);
        person2.setBookBorrowed(book2);

        //Processing request from people
        libraryServices.addRequest(book3,person1);
        libraryServices.addRequest(book2,person2);


        //Book availability check
        System.out.println(libraryServices.checkBookAvailability(person1,librarian.getBooks()));
        System.out.println("****************************");

        //Based on the persons on queue
        System.out.println(libraryServices.booksGivenByRole(person2, librarian.getBooks()));
        System.out.println(libraryServices.booksGivenByRole(person3, librarian.getBooks()));
        System.out.println(libraryServices.booksGivenByRole(person1, librarian.getBooks()));
        System.out.println("*****************************************");

        //Books given by priority
        libraryServices.booksGivenByRole(librarian.getBooks());
        System.out.println("************************");

        //Returned Book
        libraryServices.returnBook(person1,book3);

    }
}