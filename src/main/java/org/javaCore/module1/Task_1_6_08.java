package org.javaCore.module1;

public class Task_1_6_08 {
    public static void main(String[] args) {
        Task_1_6_08 task_1_6_08 = new Task_1_6_08();
        task_1_6_08.parseAndPrintNumber("64");
        task_1_6_08.parseAndPrintNumber("111");
    }

    public void parseAndPrintNumber(String str) {
        System.out.println(Integer.parseInt(str) / 2);
    }
}
