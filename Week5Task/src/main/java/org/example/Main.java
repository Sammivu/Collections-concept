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

        LibraryServicesImpl libraryServices = new LibraryServicesImpl();

        //People that can be added to the queue
        Person teacher = new Person("Sampson Gbewa", 30, Role.TEACHER);
        Person senior = new Person("Alabo Hamlet", 23,  Role.SENIOR_STUDENT);
        Person junior = new Person("Royal Mathias", 16, Role.JUNIOR_STUDENT);



        libraryServices.addPersonToQueueOnPriority(teacher);
        libraryServices.addPersonToQueueOnPriority(senior);
        libraryServices.addPersonToQueueOnPriority(junior);

        libraryServices.addPeopleToQueueOnFirstCome(junior);
        libraryServices.addPeopleToQueueOnFirstCome(senior);
        libraryServices.addPeopleToQueueOnFirstCome(teacher);


        System.out.println("****************************");
        System.out.println("Priority");
        libraryServices.giveBookBasedOnRole("Purple Hibiscus",Library.getBooks());

        System.out.println("*****************************************");

        System.out.println("First Come");
        libraryServices.booksGivenByFirstCome("Things fall Apart",Library.getBooks());


        System.out.println("*************************");


    }
}