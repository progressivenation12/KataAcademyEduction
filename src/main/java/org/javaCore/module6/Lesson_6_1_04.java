package org.javaCore.module6;

public class Lesson_6_1_04 {
    public static void main(String[] args) {
        Operation operation = (a, b) -> a * b;

        System.out.println(operation.calculate(10, 20));
    }

    interface Operation {
        int calculate(int a, int b);
    }
}
