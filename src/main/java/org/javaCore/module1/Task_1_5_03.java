package org.javaCore.module1;

public class Task_1_5_03 {
    public static void main(String[] args) {
        printArray(new int[]{});
    }

    public static void printArray(int[] numbers) {
        System.out.print('[');
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.print(']');
    }
}
