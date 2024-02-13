package org.javaCore.module4;

import java.io.*;

public class Task_4_2_05 {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[]{1, 2, 4, 10};
        InputStream inputStream = new ByteArrayInputStream(data);

        System.out.println(sumOfStream(inputStream));
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sumRead = 0;

        while (inputStream.available() > 0) {
            byte currentRead = (byte) inputStream.read();
            sumRead += currentRead;
        }
        return sumRead;
    }
}
