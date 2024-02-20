package org.javaCore.module5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task_5_2_14 {
    public static void main(String[] args) {
        try (Reader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(getSalesMap(reader));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> salersMap = new LinkedHashMap<>();

        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            String data;

            while ((data = bufferedReader.readLine()) != null) {
                String[] splitLine = data.split(" ");
                if (salersMap.isEmpty()) {
                    salersMap.put(splitLine[0], Long.parseLong(splitLine[1]));
                } else {
                    if (salersMap.containsKey(splitLine[0])) {
                        salersMap.replace(splitLine[0], salersMap.get(splitLine[0]) + Long.parseLong(splitLine[1]));
                    } else {
                        salersMap.put(splitLine[0], Long.parseLong(splitLine[1]));
                    }
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return salersMap;
    }
}
