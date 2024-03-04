package org.javaCore.module4;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Task_4_3_06 {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {72, 101, 108, 108, 111};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        Charset charset = StandardCharsets.US_ASCII;

        System.out.println(readAsString(inputStream, charset));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        StringBuilder stringBuilder = new StringBuilder();
        int charRead;

        while ((charRead = inputStreamReader.read()) != -1) {
            stringBuilder.append((char) charRead);
        }

        return stringBuilder.toString();
    }
}
