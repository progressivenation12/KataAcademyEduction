package org.javaCore.module3;

public class Task_3_1_06 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length > 3) {
            StackTraceElement stackTraceElement = stackTraceElements[3];
            return stackTraceElement.getClassName() + '#' + stackTraceElement.getMethodName();
        }
        return null;
    }
}
