package org.javaCore.module1;

import java.math.BigInteger;

public class Task_1_4_08 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static BigInteger factorial(int value) {
        if (value == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(value).multiply(factorial(value - 1));
    }
}
