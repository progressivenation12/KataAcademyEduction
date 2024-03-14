package org.javaCore.module6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task_6_2_13 {
public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

    reader.lines()
            .map(lines -> lines.toLowerCase().split("[^а-яА-Яa-zA-Z0-9]"))
            .flatMap(Arrays::stream)
            .filter(word -> !word.isEmpty())
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(10)
            .map(Map.Entry::getKey)
            .forEach(System.out::println);

    reader.close();
}
}
