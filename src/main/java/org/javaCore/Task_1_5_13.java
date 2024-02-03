package org.javaCore;

public class Task_1_5_13 {
    public static void main(String[] args) {
        printOddNumbers(new int[]{3,5,20,8,7,3,100});
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder builder = new StringBuilder();

        for (int j : arr) {
            if (Math.abs(j) % 2 == 1) {
                builder.append(j).append(',');
            }
        }

        if (!builder.isEmpty()) {
            System.out.println(builder.deleteCharAt(builder.length() - 1));
        }
    }
}
