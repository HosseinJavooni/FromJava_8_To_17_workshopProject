package org.FromJava8To17WorkshopProject.section_01.stream;

import java.util.Comparator;
import java.util.List;

public class TestOf_filter_InStreamApi {
    public static void main(String[] args) {
        List<Person> personList = PersonListMaker.givePersonList();
        personList.forEach(System.out::println);
        System.out.println("============= After filtering  person.getAge() > 30 =============");
        personList.stream().filter(person -> person.getAge() > 30).forEach(System.out::println);
    }
}
