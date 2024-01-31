package org.javaCore;

import java.math.BigInteger;

public class Task_1_2_15 {
    public static void main(String[] args) {
        maxLongSqr();
    }

    public static void maxLongSqr() {
        BigInteger fromInteger = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println(fromInteger.pow(2));
    }
}
