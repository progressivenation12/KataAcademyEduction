package org.javaCore.module5;

import java.util.*;

public class Task_5_2_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> numbers = new LinkedList<>();
        int checkIndex = 0;

        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();

            if (checkIndex++ % 2 != 0) {
                numbers.add(value);
            }
        }

        Iterator<Integer> descendingIterator = numbers.descendingIterator();

        descendingIterator.forEachRemaining(i -> System.out.print(i + " "));
    }
}
