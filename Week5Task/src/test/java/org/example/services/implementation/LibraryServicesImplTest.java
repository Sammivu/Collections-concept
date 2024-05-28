package org.example.services.implementation;

import org.example.enums.Role;
import org.example.models.Book;
import org.example.models.Library;
import org.example.models.Person;
import org.example.services.LibraryServices;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServicesImplTest {
    LibraryServicesImpl libraryServices = new LibraryServicesImpl();
    Person teacher = new Person("Sampson Gbewa", 30, Role.TEACHER);

    @Test
    void checkBook_IfNull() {
        assertNull(libraryServices.checkBook("Eat that frog", Library.getBooks()));
    }
    @Test
    void checkBook_IfNotNull(){
        assertNotNull(libraryServices.checkBook("Purple Hibiscus", Library.getBooks()));
    }

    @Test
    void addPersonToQueueOnPriority() {
        assertEquals("Sampson Gbewa", libraryServices.addPersonToQueueOnPriority(teacher));
    }

    @Test
    void addPeopleToQueueOnFirstCome() {
        assertEquals("Sampson Gbewa", libraryServices.addPeopleToQueueOnFirstCome(teacher));
    }

    @Test
    void giveBookBasedOnRole_IfNull() {
        assertEquals("", libraryServices.giveBookBasedOnRole("Eat That frog", Library.getBooks()));

    }
    @Test
    void giveBookBasedOnRole_IfNotNull() {
        assertNotNull(libraryServices.giveBookBasedOnRole("Eat That frog", Library.getBooks()));

    }

    @Test
    void booksGivenByFirstCome_IfNull() {
        assertEquals("", libraryServices.giveBookBasedOnRole("Eat That frog", Library.getBooks()));
    }
    @Test
    void booksGivenByFirstCome_IfNotNull() {
        assertNotNull(libraryServices.giveBookBasedOnRole("Eat That frog", Library.getBooks()));
    }
}