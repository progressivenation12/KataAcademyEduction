package org.javaCore;

import java.util.Arrays;

public class Task_1_5_4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSubArrayBetween(new int[]{1, 3, 5, 6, 9, 11, 24}, 25, 25)));
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
    int startPosition = 0;
    int endPosition = 0;

    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] >= start && numbers[i - 1] < start) {
            startPosition = i;
        }

        if (numbers[i] == end) {
            endPosition = i;
        }
    }

    int[] newArray = new int[endPosition - startPosition + 1];

    int subIndex = 0;

    for (int i = startPosition; i <= endPosition; i++) {
        newArray[subIndex++] = numbers[i];
    }

    return newArray;
    }
}
