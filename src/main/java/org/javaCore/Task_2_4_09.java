package org.javaCore;

public class Task_2_4_09 {
    public static void main(String[] args) {
        Student student = new Student();
        JavaStudent javaStudent = new JavaStudent();

        student.study();
        javaStudent.study();
    }

    public static class Student {
        protected final String studying;

        protected Student(String work) {
            this.studying = work;
        }

        public Student() {
            this.studying = "Прохожу тестовое задание.";
        }

        public void study() {
            System.out.println("Я очень занят. " + studying);
        }
    }

    public static class JavaStudent extends Student {
        public JavaStudent() {
            super("Прохожу курс по Java.");
        }
    }
}



