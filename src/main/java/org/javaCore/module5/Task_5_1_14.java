package org.javaCore.module5;

import java.util.Objects;

public class Task_5_1_14 {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = Pair.of(1, "hello");
        Integer i = pair1.getFirst(); // 1
        String s = pair1.getSecond(); // "hello"

        System.out.println(i);
        System.out.println(s);

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair1.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair1.hashCode() == pair2.hashCode(); // true!

        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
    }

public static class Pair<V1, V2> {
    private final V1 first;
    private final V2 second;

    private Pair(V1 first, V2 second) {
        this.first = first;
        this.second = second;
    }

    public static <V1, V2> Pair<V1, V2> of(V1 first, V2 second) {
        return new Pair<>(first, second);
    }

    public V1 getFirst() {
        return first;
    }

    public V2 getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Pair<?, ?> pair)) {
            return false;
        }
        if (!Objects.equals(first, pair.first)) {
            return false;
        }

        return Objects.equals(second, pair.second);
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);

        return result;
    }
}
}
