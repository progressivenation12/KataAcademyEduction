package org.javaCore;

public class Task_1_4_10 {
    public static void main(String[] args) {
        System.out.println(isWeekend("Monday"));
    }

    public static boolean isWeekend(String weekday) {
        switch (weekday) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> {
                return false;
            }
            case "Saturday", "Sunday" -> {
                return true;
            }
        }
        return false;
    }
}
