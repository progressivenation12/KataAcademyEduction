package org.javaCore.module1;

import java.math.BigInteger;

public class Task_1_4_07 {
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }

    public static BigInteger factorial(int value) {
        BigInteger bigInteger = BigInteger.ONE;

        for (int i = 1; i <= value; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }

        return bigInteger;
    }
}
