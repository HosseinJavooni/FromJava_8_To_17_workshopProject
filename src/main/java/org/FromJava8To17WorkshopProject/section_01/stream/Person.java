package org.FromJava8To17WorkshopProject.section_01.stream;

public class Person {
    public Person(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }
    private String name;
    private int age;
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", role='" + role + '\'' +
                '}';
    }
}
