package org.javaCore.module4;

import java.util.Locale;
import java.util.Scanner;

public class Task_4_3_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        sumDoubleOfString(scanner);
    }

    private static void sumDoubleOfString(Scanner scanner) {
        double sum = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                sum += scanner.nextDouble();
            } else {
                scanner.next();
            }
        }

        System.out.printf("%.6f\n", sum);
    }
}
