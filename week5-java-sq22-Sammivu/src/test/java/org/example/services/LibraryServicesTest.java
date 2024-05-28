package org.example.services;

import org.example.enums.Role;
import org.example.models.Book;
import org.example.models.Library;
import org.example.models.Person;
import org.example.services.implementation.LibraryServicesImpl;
import org.junit.jupiter.api.Test;
//
//import static com.sun.tools.classfile.Module_attribute.RequiresEntry.length;
//import static java.lang.StringUTF16.compareTo;
//import static java.lang.StringUTF16.length;
//import static jdk.internal.jrtfs.JrtFileAttributeView.AttrID.size;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServicesTest {

    @Test
    void addPersonToQueue() {

        Person p1 = new Person("Sampson", 30, Role.TEACHER);

        assertEquals(Role.TEACHER, p1.getRole());

    }

    @org.junit.jupiter.api.Test
    void checkBookAvailability() {


    }

    @org.junit.jupiter.api.Test
    void booksGivenByRole() {
    }

    @org.junit.jupiter.api.Test
    void addRequest() {
    }

    @org.junit.jupiter.api.Test
    void returnBook() {
    }
}