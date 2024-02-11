package org.javaCore.module1;

public class Task_1_4_11 {
    public static void main(String[] args) {
        System.out.println(isWeekend("Sunday"));
    }

    public static boolean isWeekend(String weekday) {
        if (weekday.equals("Saturday") || weekday.equals("Sunday")) {
            return true;
        }
        return false;
    }
}
