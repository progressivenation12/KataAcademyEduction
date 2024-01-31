package org.javaCore;

public class Task_1_4_11 {
    public static void main(String[] args) {
        System.out.println(isWeekend("Sunday"));
    }

    public static boolean isWeekend(String weekday) {
        if (weekday.equals("Monday") || weekday.equals("Tuesday") ||
                weekday.equals("Wednesday") || weekday.equals("Thursday") || weekday.equals("Friday")) {
            return false;
        } else {
            return weekday.equals("Saturday") || weekday.equals("Sunday");
        }
    }
}
