package org.javaCore.module4;

import java.io.*;

public class Task_4_2_05 {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[]{3, 18, 1, -53};
        InputStream inputStream = new ByteArrayInputStream(data);

        System.out.println(sumOfStream(inputStream));
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sumRead = 0;
        int currentRead;

        while ((currentRead = inputStream.read()) != -1) {
            sumRead += (byte) currentRead;
        }
        return sumRead;
    }
}
