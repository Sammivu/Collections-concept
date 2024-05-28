package org.example.services.implementation;

import org.example.models.Book;
import org.example.models.Person;
import org.example.services.PersonComparator;
import org.example.services.LibraryServices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class LibraryServicesImpl implements LibraryServices {

    ArrayList<Person> addRequest = new ArrayList<>();

    PriorityQueue<Person> peoplePriorityQueue;
    public LibraryServicesImpl() {
        peoplePriorityQueue= new PriorityQueue<>(new PersonComparator());

    }

    @Override
    public void addPersonToQueue(Person persons) {
        peoplePriorityQueue.add(persons);
    }

    @Override
    public boolean checkBookAvailability(Person person, List<Book> inventory) {
        // The logic for the availability
       // System.out.println(person.getBookBorrowed());
        for (Book book : inventory){
            if(book.equals(person.getBookBorrowed())){
                return true;
            }
        }
        return false;
    }




//Method overloading was implemented here
    @Override
    public String booksGivenByRole(Person person1, List<Book> inventory) {

        if (peoplePriorityQueue.isEmpty()){
            return  "No person on the queue";
        }

        boolean check = checkBookAvailability(person1, inventory);

        //System.out.println(person.getFullName());

        if(check) return person1.getFullName()+" "+ person1.getRole()+ ", has taken "+ person1.getBookBorrowed()+ ".";

        return person1.getFullName()+" "+ person1.getRole()+", book request: "+ person1.getBookBorrowed()+ ".";

    }


    public String booksGivenByRole( List<Book> inventory) {

        if(peoplePriorityQueue.isEmpty())  return  "No person on the queue";

        Iterator<Person> iterator = peoplePriorityQueue.iterator();
        while (iterator.hasNext()){

          //  System.out.println(iterator.next().getFullName());

           Person person = peoplePriorityQueue.poll();
            boolean check = checkBookAvailability(person, inventory);

            if(check) {
                assert person != null;
                System.out.println(person.getFullName()+" "+person.getRole()+ ", has taken "+ person.getBookBorrowed()+ ".");
            }
            else{
                assert person != null;

                System.out.println(person.getFullName()+" "+person.getRole()+ ", book request made: "+ person.getBookBorrowed()+ ".");
            }

        }


        return null;

    }


    @Override
    public void addRequest(Book book, Person person) {
        addRequest.add(person);
    }
    @Override

    public ArrayList<Person> returnBook(Person person, Book book){

            Book bookBorrowed= person.getBookBorrowed();
            if (book == bookBorrowed) {
                book.returnBook();
                System.out.println(person.getFullName() + " returned '" + bookBorrowed + "'");
            }


        return null;
    }


}
