package org.javaCore;

import java.util.Arrays;

public class Task_1_5_05 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArrayMiddle(new int[]{1, 5, 2, 17})));
        System.out.println(Arrays.toString(getArrayMiddle(new int[]{14, 16, 3})));
        System.out.println(Arrays.toString(getArrayMiddle(new int[]{})));
    }

    public static int[] getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            return new int[0];
        }

        if (numbers.length % 2 == 0) {
            return new int[]{numbers[(numbers.length / 2) - 1], numbers[numbers.length / 2]};
        } else {
            return new int[]{numbers[numbers.length / 2]};
        }
    }
}
