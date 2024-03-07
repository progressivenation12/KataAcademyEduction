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
        private Object[] array = new Object[10];
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
            System.arraycopy(array, index + 1, array, index, array.length - index - 1);
            arraySize--;
        }

        public int size() {
            return array.length;
        }

        @SuppressWarnings("unchecked")
        public T get(int index) {
            if (index < 0 || index >= arraySize) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return (T) array[index];
        }
    }
}