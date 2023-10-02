package org.FromJava8To17WorkshopProject.section_01.stream;

import java.util.Arrays;
import java.util.List;

public class TestOf_Map_InStreamApi {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Hossein", 39, "Manager"),
                new Person("Mahan", 2, "Bose"),
                new Person("Saeed", 34, "Manager")
        );
        personList.forEach(System.out::println);
        personList = personList.stream().map(person -> {
            if(person.getRole().startsWith("M")){
                person.setRole(person.getRole().toUpperCase());
                return person;
            } else return person;
        }).toList();
        System.out.println("=======New Person List After some doing some task with stream api map method=======");
        personList.forEach(System.out::println);
    }
}
