package org.javaCore;

public class Task_1_4_9 {
    public static void main(String[] args) {
        System.out.println(determineGroup(77));
    }

    public static int determineGroup(int age) {
        if (age >= 7 && age <= 13) {
            return 1;
        } else if (age >= 14 && age <= 17) {
            return 2;
        } else if (age >= 18 && age <= 65) {
            return 3;
        }
        return -1;
    }
}
