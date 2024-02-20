package org.javaCore.module5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Task_5_2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        int checkIndex = 0;

        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();

            if (checkIndex++ % 2 != 0) {
                numbers.add(value);
            }
        }

        Collections.reverse(numbers);

        numbers.forEach(i -> System.out.print(i + " "));

        scanner.close();
    }
}
