package org.example.models;

import org.example.enums.Role;

public class Person {

    private final String fullName;
    private final int age;
    private final Role role;
    private Book bookBorrowed;

    public Person(String fullName, int age, Role role) {
        this.fullName = fullName;
        this.age = age;
        this.role = role;

    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public Role getRole() {
        return role;
    }

    public Book getBookBorrowed() {
        return bookBorrowed;
    }

    public void setBookBorrowed(Book bookBorrowed) {
        this.bookBorrowed = bookBorrowed;
    }
}
