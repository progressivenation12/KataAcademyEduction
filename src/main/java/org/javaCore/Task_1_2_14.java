package org.javaCore;

public class Task_1_2_14 {
    public static void main(String[] args) {
        calcCircleRadius(10);
    }

    public static void calcCircleRadius(double area) {
        System.out.printf("%.3f", Math.sqrt(area / Math.PI));
    }
}
