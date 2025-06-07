package edu.phystech.hw3;

import java.util.Set;
import java.util.HashSet;

public class SetUtilsTest {

    public static class SetUtils {

        public static <T> Set<T> union(Set<T> first, Set<T> second) {
            var result = new HashSet<>(first);
            result.addAll(second);
            return result;
        }

        public static <T> Set<T> intersection(Set<T> first, Set<T> second) {
            var result = new HashSet<>(first);
            result.retainAll(second);
            return result;
        }

        public static <T> Set<T> difference(Set<T> first, Set<T> second) {
            var result = new HashSet<>(first);
            result.removeAll(second);
            return result;
        }

        public static <T> Set<T> symmetricDifference(Set<T> first, Set<T> second) {
            var union = union(first, second);
            var intersection = intersection(first, second);
            union.removeAll(intersection);
            return union;
        }
    }
