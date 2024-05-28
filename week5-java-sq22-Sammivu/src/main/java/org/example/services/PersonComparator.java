package org.example.services;

import org.example.enums.Role;
import org.example.models.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {

        if(p1.getRole()==Role.TEACHER && p2.getRole()!=Role.TEACHER){
            return -1;

        }else if(p1.getRole()!=Role.TEACHER && p2.getRole()==Role.TEACHER){
            return 1;

        } else if(p1.getRole()== Role.SENIOR_STUDENT && p2.getRole()!=Role.SENIOR_STUDENT){
            return -1;
        } else if (p1.getRole()!=Role.SENIOR_STUDENT && p2.getRole()==Role.SENIOR_STUDENT) {
            return 1;

        } else if (p1.getRole()==Role.JUNIOR_STUDENT && p2.getRole()!=Role.JUNIOR_STUDENT) {
            return -1;

        } else if (p1.getRole()!=Role.JUNIOR_STUDENT && p2.getRole()==Role.JUNIOR_STUDENT) {
            return 1;
        }


        return 0;
    }

}
