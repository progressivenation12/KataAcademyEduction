package org.javaCore.module2;

public class Task_2_4_11 {
    public static void main(String[] args) {
        LazyStudent lazyStudent = new LazyStudent();

        lazyStudent.study();
    }

    public static class LazyStudent extends Task_2_4_09.Student {
        public LazyStudent() {
        }

        @Override
        public void study() {
            System.out.println("Сегодня не учусь, мне лень.");
        }
    }
}
