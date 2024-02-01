package org.javaCore;

import java.util.Arrays;

public class Task_1_5_09 {
    public static void main(String[] args) {
        printArray(new int[]{1,2,3,4,5,5,6,7,7});
        printArray(new int[]{});
    }

    public static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
