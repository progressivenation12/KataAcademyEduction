package org.javaCore.module6;

import java.util.function.UnaryOperator;

public class Task_6_1_09 {
    public static void main(String[] args) {
        System.out.println(sqrt().apply(2));
    }

public static UnaryOperator<Integer> sqrt() {
    return i -> i * i;
}
}
