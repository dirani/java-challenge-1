package com.example.demo;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}

public class LambdaExample {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Bob", 30));
        persons.add(new Person("Charlie", 28));

        // Transform each person's age using lambda syntax
        List<Person> transformedPersons = new ArrayList<>();
        persons.forEach(person -> {
            int newAge = person.getAge() + 1; // Increment age by 1
            person.setAge(newAge);
            transformedPersons.add(person);
        });

        // Print the transformed persons
        transformedPersons.forEach(System.out::println);
    }
}
