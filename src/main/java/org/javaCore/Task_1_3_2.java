package org.javaCore;

public class Task_1_3_2 {
    public static void main(String[] args) {
        System.out.println(charExpression(10));
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
