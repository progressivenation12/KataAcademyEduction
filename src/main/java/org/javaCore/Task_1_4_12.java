package org.javaCore;

public class Task_1_4_12 {
    public static void main(String[] args) {
        System.out.println(checkWeekend("Sunday"));
    }

    public static String checkWeekend(String weekday) {
        return (weekday.equals("Saturday") || weekday.equals("Sunday")) ? "Ура, выходной!" : "Надо еще поработать";
    }
}
