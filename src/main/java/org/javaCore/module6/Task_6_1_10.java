package org.javaCore.module6;

public class Task_6_1_10 {
    public static void main(String[] args) {
        System.out.println(getGenerator().cond(1));
    }

    @FunctionalInterface
    public interface NumberGenerator<T extends Number> {
        boolean cond(T arg);
    }

    public static NumberGenerator<? super Number> getGenerator() {
        return (Number number) -> number.intValue() > 0;
    }
}
