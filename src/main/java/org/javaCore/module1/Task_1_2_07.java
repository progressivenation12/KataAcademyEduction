package org.javaCore.module1;

public class Task_1_2_07 {
    public static void main(String[] args) {
        System.out.println(drawIsMonitorsCounter(10, 4));
    }

    public static int drawIsMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }
}
