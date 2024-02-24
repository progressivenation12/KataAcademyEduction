package org.javaCore.module6;

import java.util.stream.IntStream;

public class Task_6_2_11 {
    public static void main(String[] args) {
        pseudoRandomStream(13).limit(10).forEach(System.out::println);
    }

    public static IntStream pseudoRandomStream(int seed) {
        return IntStream.iterate(seed, num -> (((num * num) / 10)) % 1000);
    }
}
