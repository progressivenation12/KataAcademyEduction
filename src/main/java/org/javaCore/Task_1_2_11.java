package org.javaCore;

public class Task_1_2_11 {
    public static void main(String[] args) {
        System.out.println(doubleExpression(5.0, 2.0, 7.0));

        double literal = 0x0bp3;
        System.out.println(literal);
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) <= 0.0001;
    }
}
