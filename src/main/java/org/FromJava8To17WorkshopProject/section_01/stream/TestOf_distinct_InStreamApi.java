package org.FromJava8To17WorkshopProject.section_01.stream;

import java.util.List;

public class TestOf_distinct_InStreamApi {
    public static void main(String[] args) {
        List<Person> personList = PersonListMaker.givePersonList();
        System.out.println(personList.stream().map(Person::getAge).toList());
        System.out.println("=======After mapping on the age field and call distinct========");
        System.out.println(personList.stream().map(Person::getAge).distinct().toList());
    }

}
