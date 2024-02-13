package org.javaCore.module4;

import java.io.*;

public class Task_4_2_06 {
    public static void main(String[] args) throws IOException {
        byte[] dataInput = new byte[]{3, 10, 4, 5, 7};

        InputStream inputStream = new ByteArrayInputStream(dataInput);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        print(inputStream, outputStream);

        byte[] dataOutput = outputStream.toByteArray();

        for (int i = 0; i < dataOutput.length; i++) {
            if (i == dataOutput.length - 1) {
                System.out.printf("%d", dataOutput[i]);
            } else {
                System.out.printf("%d, ", dataOutput[i]);
            }
        }
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        while (inputStream.available() > 0) {
            byte currentByte = (byte) inputStream.read();
            if (currentByte % 2 == 0) {
                outputStream.write(currentByte);
                outputStream.flush();
            }
        }
    }
}
