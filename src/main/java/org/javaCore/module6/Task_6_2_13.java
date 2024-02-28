package org.javaCore.module6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Task_6_2_13 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        Map<String, Integer> wordMap = new HashMap<>();

        Stream<String> wordStream = reader.lines()
                .flatMap(lines -> Arrays.stream(lines.split("[^а-яА-Яa-zA-Z0-9]")))
                .map(String::toLowerCase)
                .filter(word -> !word.isEmpty());

        wordStream.forEach(word -> wordMap.put(word, wordMap.containsKey(word) ? wordMap.get(word) + 1 : 1));

        wordMap.entrySet()
                .stream()
                .sorted((firstElement, secondElement) -> firstElement.getValue().equals(secondElement.getValue()) ?
                        firstElement.getKey().compareTo(secondElement.getKey()) :
                        secondElement.getValue().compareTo(firstElement.getValue()))
                .limit(10)
                .forEach(element -> System.out.println(element.getKey()));

        reader.close();
    }
}
