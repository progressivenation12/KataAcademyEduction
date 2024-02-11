package org.javaCore.module1;

public class Task_1_3_02 {
    public static void main(String[] args) {
        System.out.println(charExpression(10));
    }

    public static char charExpression(int a) {
        return (char) ('\\' + a);
    }
}
