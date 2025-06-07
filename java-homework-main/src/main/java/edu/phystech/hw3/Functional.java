package edu.phystech.hw3;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Functional {

    public static <T, R> List<R> map(List<T> list, Function<? super T, ? extends R> func) {
        List<R> result = new ArrayList<>(list.size());
        for (T item : list) {
            result.add(func.apply(item));
        }
        return result;
    }

    public static <T, R> R reduce(List<T> list, BiFunction<R, ? super T, R> func, R initial) {
        R result = initial;
        for (T item : list) {
            result = func.apply(result, item);
        }
        return result;
    }
}



