package org.javaCore;

public class Task_1_3_8 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(9));
    }

    public static boolean isPowerOfTwo(int value) {
        return (Integer.bitCount(Math.abs(value))) == 1;
    }
}
