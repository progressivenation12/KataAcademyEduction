package org.javaCore.module6;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class Task_6_2_15 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(factorial(number));
    }

public static BigInteger factorial(int value) {
    if (value < 0) {
        throw new IllegalArgumentException("Введеное число не может быть меньше 0!");
    }
    return IntStream.rangeClosed(1, value)
            .mapToObj(BigInteger::valueOf)
            .reduce(BigInteger.ONE, BigInteger::multiply);
}
}