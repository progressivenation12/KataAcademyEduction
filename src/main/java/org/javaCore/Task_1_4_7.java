package org.javaCore;

import java.math.BigInteger;

public class Task_1_4_7 {
    public static void main(String[] args) {
        System.out.println(factorial(100));
    }

    public static BigInteger factorial(int value) {
        BigInteger bigInteger = BigInteger.ONE;
        if (value == 0) {
            return BigInteger.valueOf(1);
        } else {
            for (int i = 1; i <= value; i++) {
                bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
            }
        }
        return bigInteger;
    }
}
