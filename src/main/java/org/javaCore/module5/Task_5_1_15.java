package org.javaCore.module5;

import java.util.Arrays;

public class Task_5_1_15 {
    public static void main(String[] args) {
        DynamicArray<Integer> integerDynamicArray = new DynamicArray<>();

        integerDynamicArray.add(125);
        integerDynamicArray.add(126);
        integerDynamicArray.remove(1);

        System.out.println(integerDynamicArray.size());
        System.out.println(integerDynamicArray.get(0));

    }

    public static class DynamicArray<T> {
        private static final int DEFAULT_SIZE = 10;
        private T[] array = (T[]) new Object[DEFAULT_SIZE];
        private int arraySize = 0;

        public DynamicArray() {
        }

        public void add(T el) {
            if (arraySize == array.length) {
                array = Arrays.copyOf(array, array.length * 2);
            }
            array[arraySize] = el;
            arraySize++;
        }

        public void remove(int index) {
            if (index < 0 || index >= arraySize) {
                throw new ArrayIndexOutOfBoundsException();
            }

            T[] tempArray = array;
            array = (T[]) new Object[tempArray.length - 1];

            System.arraycopy(tempArray, 0, array, 0, index);
            System.arraycopy(tempArray, index + 1, array, index, tempArray.length - index - 1);

            arraySize--;
        }

        public int size() {
            return array.length;
        }

        public T get(int index) {
            if (index < 0 || index >= arraySize) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return array[index];
        }
    }
}
