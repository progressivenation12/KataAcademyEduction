package org.javaCore;

import java.math.BigInteger;

public class Task_1_2_15 {
    public static void main(String[] args) {
        maxLongSqr();

        String blockOne = "1.1 Введение в Java";
        String blockTwo = "1.2 Примитивные типы";
        String moduleName = "Введение в Java и базовый синтаксис";

        System.out.printf("Пройдено: %s, %s из модуля %s!", blockOne, blockTwo, moduleName);
    }

    public static void maxLongSqr() {
        BigInteger sqrt = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println(sqrt.multiply(sqrt));
    }
}
