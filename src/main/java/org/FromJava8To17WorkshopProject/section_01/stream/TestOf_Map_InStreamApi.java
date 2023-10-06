package org.FromJava8To17WorkshopProject.section_01.stream;

import java.util.List;
import java.util.stream.Stream;

public class TestOf_Map_InStreamApi {
    public static void main(String[] args) {
        List<Person> personList = PersonListMaker.givePersonList();
        personList.forEach(System.out::println);
        System.out.println("=======New Person List After some doing some task with stream api map method=======");
        personList.stream().map(person -> {
            if(person.getRole().startsWith("M")){
                person.setRole(person.getRole().toUpperCase());
                return person;
            } else return person;
        }).forEach(System.out::println);
    }
}
