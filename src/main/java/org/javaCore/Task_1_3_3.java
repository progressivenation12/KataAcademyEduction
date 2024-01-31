package org.javaCore;

public class Task_1_3_3 {
    public static void main(String[] args) {
        System.out.println(getAgeDiff((byte) 2, (byte) 5));
    }

    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) Math.abs(age1 - age2);
    }
}
