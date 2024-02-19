package org.javaCore.module5;

public class Task_5_1_12 {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.object = "Hello";
        System.out.println(box.object);
    }

    static class Box<T> {
        private T object;
    }
}
