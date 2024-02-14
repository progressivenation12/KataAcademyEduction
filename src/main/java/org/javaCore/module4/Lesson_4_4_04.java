package org.javaCore.module4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Lesson_4_4_04 {
    public static void main(String[] args) {
        String fileName = "peopleSerializable.dat";
        List<Person> people = new ArrayList<>();

        people.add(new Person("Roman", 34, 189, true));
        people.add(new Person("Violetta", 32, 168, true));
        people.add(new Person("Varvara", 9, 135, false));

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeInt(people.size());
            objectOutputStream.writeObject(people);

            System.out.println("End write!");
            System.out.println("-----------------------");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        int newPeopleSize = 0;
        List<Person> newPeople = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            newPeopleSize = objectInputStream.readInt();
            newPeople = (List<Person>) objectInputStream.readObject();
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        System.out.printf("Number of people: %d\n", newPeopleSize);
        for (Person p : newPeople) {
            System.out.printf("Name: %s, Age: %d\n", p.name(), p.age());
        }

        System.out.println("-----------------------");
        System.out.println("End read!");
    }

    private record Person(String name, int age, double height, boolean married) implements Serializable {
    }
}
