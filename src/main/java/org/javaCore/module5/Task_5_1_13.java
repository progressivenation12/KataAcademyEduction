package org.javaCore.module5;

public class Task_5_1_13 {
    public static void main(String[] args) {
        System.out.println(Box.getBox());
    }

    public static class Box<T> {
        private T object;

        public static <T> Box<T> getBox() {
            return new Box<>();
        }
    }
}
