package org.FromJava8To17WorkshopProject.section_01.stream;

import java.util.List;

public class TestOf_limit_and_skip_InStreamApi {
    public static void main(String[] args) {
        List<Person> personList = PersonListMaker.givePersonList();
        personList.stream().forEach(System.out::println);
        System.out.println("================After call limit Method of Stream api================");
        personList.stream().limit(3).forEach(System.out::println);
        System.out.println("================After call skip Method of Stream api================");
        personList.stream().skip(6).forEach(System.out::println);
    }
}
