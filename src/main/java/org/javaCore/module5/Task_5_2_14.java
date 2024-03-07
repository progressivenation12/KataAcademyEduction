package org.javaCore.module5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_5_2_14 {
    public static void main(String[] args) {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(getSalesMap(reader));
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> salersMap = new HashMap<>();
        Scanner scanner = new Scanner(reader);

        while (scanner.hasNext()) {
            salersMap.merge(scanner.next(), Long.parseLong(scanner.next()), Long::sum);
        }
        return salersMap;
    }
}
