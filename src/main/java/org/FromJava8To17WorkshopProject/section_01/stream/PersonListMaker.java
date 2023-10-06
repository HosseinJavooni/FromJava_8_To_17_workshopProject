package org.FromJava8To17WorkshopProject.section_01.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PersonListMaker {
    public static List<Person> givePersonList(){
        return Arrays.asList(
                new Person("Hossein", 39, "Manager"),
                new Person("Hossein", 39, "Manager"),
                new Person("Hossein", 39, "Manager"),
                new Person("Mahan", 2, "Bose"),
                new Person("Saeed", 34, "Manager"),
                new Person("Sepehr", 34, "Business Manager"),
                new Person("Ali", 28, "Clerk"),
                new Person("Mahan", 42, "Accounting"),
                new Person("Homa", 42, "Scrum Master"),
                new Person("Hamid", 35, "Hr")
        );
    }
}
