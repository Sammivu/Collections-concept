package org.example.services.implementation;

import org.example.models.Book;
import org.example.models.Library;
import org.example.models.Person;
import org.example.services.PersonComparator;
import org.example.services.LibraryServices;
import org.w3c.dom.ls.LSOutput;


import java.util.List;

import static org.example.models.Library.peoplePriorityQueue;
import static org.example.models.Library.peopleQueue;

public class LibraryServicesImpl implements LibraryServices {


    @Override
    public Book checkBook(String nameOfBook, List<Book> books) {
        Book book =null;
        for(Book b:books){
            if(nameOfBook.equals(b.getBookTitle()) && b.getQuantityAvailable()!= 0){
                b.setQuantityAvailable(b.getQuantityAvailable()-1);
                book = b;
            }
            else if (!books.contains(b)){
                System.out.println(nameOfBook+ " is not available, check back later");
            }
        }
        return book;
    }


    @Override
    public String addPersonToQueueOnPriority(Person person) {
        peoplePriorityQueue.add(person);
        return person.getFullName();
    }

    @Override
    public String addPeopleToQueueOnFirstCome(Person person) {
        peopleQueue.add(person);
        return person.getFullName();
    }

    @Override
    public String giveBookBasedOnRole(String book, List<Book> getBooks) {

        String result="";
        for(Person p:peoplePriorityQueue) {

            assert p != null;
            if (peoplePriorityQueue.isEmpty()) {
                System.out.println("No person on the queue");
            } else if (checkBook(book, getBooks)!= null) {
                System.out.println(p.getFullName() + " has borrowed " + book);
                result= book;
            }else{
                System.out.println(p.getFullName()+" book have been taken");
            }

        }
        return result;

    }

    @Override
    public String booksGivenByFirstCome(String book, List<Book> getBooks) {
        String result ="";

        for(Person p:peopleQueue){
            if(checkBook(book,getBooks) != null) {
                System.out.println(p.getFullName() + " has borrowed " + book);
                result = book;
            }else {
                System.out.println(p.getFullName()+ " cannot borrow "+ book+ " because it have been borrowed");
            }
        }
        return result;


    }
}





