package org.javaCore.module2;

import java.util.Arrays;

public class Task_2_5_06 {
    public static void main(String[] args) {
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100,
                101, 102, 103, 104, 105, 106, 107, 108, 109, 110,
                111, 112, 113, 114, 115, 116, 117, 118, 119, 120,
                121, 122, 123, 124, 125, 126, 127});

        System.out.print(asciiCharSequence.length() + "\n");
        System.out.print(asciiCharSequence.charAt(36) + "\n");
        System.out.println(asciiCharSequence.subSequence(33, 38));
        System.out.println(asciiCharSequence);

    }

    public static class AsciiCharSequence implements CharSequence {
        private final byte[] array;

        public AsciiCharSequence(byte[] array) {
            this.array = array.clone();
        }

        @Override
        public int length() {
            return array.length;
        }

        @Override
        public char charAt(int index) {
            return (char) array[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(array, start, end));
        }

        @Override
        public String toString() {
            return new String(array);
        }
    }
}
