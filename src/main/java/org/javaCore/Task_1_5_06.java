package org.javaCore;

import java.util.Arrays;

public class Task_1_5_06 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(inverseArray(new int[]{1, 4, 6, 7})));
        System.out.println(Arrays.toString(inverseArray(new int[]{})));
    }

    public static int[] inverseArray(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        } else {
            int[] newArray = new int[numbers.length];
            int newArrayIndex = 0;
            for (int i = numbers.length - 1; i >= 0; i--) {
                newArray[newArrayIndex++] = numbers[i];
            }
            return newArray;
        }
    }
}