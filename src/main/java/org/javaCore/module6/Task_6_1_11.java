package org.javaCore.module6;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Task_6_1_11 {
    public static void main(String[] args) {
        Predicate<Object> condition = Objects::isNull; // возвращает true, если переданный ему объект равен null, и false в противном случае.
        Function<Object, Integer> ifTrue = obj -> 0; // всегда возвращает 0
        Function<CharSequence, Integer> ifFalse = CharSequence::length; // вернет длину строки
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);

        String test = "Hallo World! Learn Java!";

        System.out.println(safeStringLength.apply(test));
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return x -> condition.test(x) ? ifTrue.apply(x) : ifFalse.apply(x);
    }


}
