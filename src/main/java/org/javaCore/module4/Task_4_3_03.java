package org.javaCore.module4;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Task_4_3_03 {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("src/main/resources/test.txt");
            Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.US_ASCII);

            writer.write('Ы');

            writer.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
