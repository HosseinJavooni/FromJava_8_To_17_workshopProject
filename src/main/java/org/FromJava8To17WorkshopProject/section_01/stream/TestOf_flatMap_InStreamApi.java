package org.FromJava8To17WorkshopProject.section_01.stream;

import java.util.Arrays;
import java.util.List;

public class TestOf_flatMap_InStreamApi {
    public static void main(String[] args) {
        List<Person> personList = PersonListMaker.givePersonList();
        personList.stream().map(person -> person.getName().split("")).forEach(array -> {
            for(String s: array)
                System.out.print(s + "  ");
            System.out.println();
        });
        System.out.println("===========After using flatmap() that make flat every element============");
        personList.stream().map(person -> person.getName().split("")).flatMap(Arrays::stream).forEach(System.out::print);
    }
}
