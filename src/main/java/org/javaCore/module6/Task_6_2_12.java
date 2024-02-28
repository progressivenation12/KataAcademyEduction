package org.javaCore.module6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task_6_2_12 {
    public static void main(String[] args) {
        Integer[] ints = {13, 16, 25, 62, 384, 745, 502, 200};
        Comparator<Integer> comparator = Comparator.comparingInt(o -> o);
        BiConsumer<Integer, Integer> biConsumer = (t, u) -> System.out.printf("%s, %s", t, u);
        findMinMax(Arrays.stream(ints), comparator, biConsumer);
    }

    public static <T> void findMinMax(Stream<? extends T> stream, Comparator<? super T> order, BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> list = stream.sorted(order).collect(Collectors.toList());

        minMaxConsumer.accept(list.stream().min(order).orElse(null), list.stream().max(order).orElse(null));
    }
}
