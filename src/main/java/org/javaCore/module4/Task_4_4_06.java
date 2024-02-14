package org.javaCore.module4;

import java.io.*;
import java.util.Objects;

public class Task_4_4_06 {
    public static void main(String[] args) {
        Animal[] animals = {new Animal("Cat"),
                new Animal("Dog"),
                new Animal("Elephant"),
                new Animal("Cock"),
                new Animal("Bull"),
                new Animal("Ant"),
                new Animal("Tentacles"),
                new Animal("Worm")};

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
            objectOutputStream.writeInt(animals.length);
            for (Animal animal : animals) {
                objectOutputStream.writeObject(animal);
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        Animal[] animalsDeserializable = deserializeAnimalArray(byteArrayOutputStream.toByteArray());

        for (Animal animal : animalsDeserializable) {
            System.out.println(animal.name);
        }
    }

public static Animal[] deserializeAnimalArray(byte[] data) {
    Animal[] animalArray;
    try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
        int animalArraySize = objectInputStream.readInt();
        animalArray = new Animal[animalArraySize];

        for (int i = 0; i < animalArraySize; i++) {
            animalArray[i] = (Animal) objectInputStream.readObject();
        }
    } catch (Exception exception) {
        throw new IllegalArgumentException();
    }

    return animalArray;
}

    private record Animal(String name) implements Serializable {
        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Animal) {
                return Objects.equals(name, ((Animal) obj).name);
            }
            return false;
        }
    }
}
