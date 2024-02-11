package org.javaCore.module1;

import java.util.Arrays;

public class Task_1_5_07 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeAndSort(new int[]{1, 3, 7, 5}, new int[]{8, 4, 2, 4})));
        System.out.println(Arrays.toString(mergeAndSort(new int[]{}, new int[]{1, 4, 3})));
    }

    public static int[] mergeAndSort(int[] firstArray, int[] secondArray) {
    int[] newArray = new int[firstArray.length + secondArray.length];

    System.arraycopy(firstArray, 0, newArray, 0, firstArray.length);
    System.arraycopy(secondArray, 0, newArray, firstArray.length, secondArray.length);

    if (firstArray.length == 0 && secondArray.length == 0) {
        return new int[0];
    } else {
        for (int i = 0; i < newArray.length; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                int tempIndex;
                if (newArray[i] > newArray[j]) {
                    tempIndex = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = tempIndex;
                }
            }
        }
    }
    return newArray;
    }
}
