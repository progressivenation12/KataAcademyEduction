package org.javaCore.module1;


import java.util.Arrays;

public class Task_1_5_11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeAndSort(new int[]{1, 3, 7, 5}, new int[]{8, 4, 2, 4})));
        System.out.println(Arrays.toString(mergeAndSort(new int[]{}, new int[]{1, 4, 3})));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
        int[] newArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
        System.arraycopy(secondArray, 0, newArray, firstArray.length, secondArray.length);

        Arrays.sort(newArray);

        return newArray;
    }
}
