package org.javaCore;

import java.util.Arrays;

public class Task_1_5_04 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getSubArrayBetween(new int[]{1, 3, 5, 6, 9, 11, 24}, 25, 25)));
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        int startIndex = 0;
        int endIndex = 0;

        if (numbers.length == 0 || start > numbers[numbers.length - 1] || end > numbers[numbers.length - 1] || start > end) {
            return new int[0];
        } else {
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i - 1] < start && numbers[i] >= start) {
                    startIndex = i;
                }

                if (numbers[i] <= end) {
                    endIndex = i;
                }
            }

            int[] newArray = new int[endIndex - startIndex + 1];
            int subIndex = 0;

            for (int i = startIndex; i <= endIndex; i++) {
                newArray[subIndex++] = numbers[i];
            }

            return newArray;
        }
    }
}
