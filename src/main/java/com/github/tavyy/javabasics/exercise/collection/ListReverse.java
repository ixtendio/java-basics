package com.github.tavyy.javabasics.exercise.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

/**
 * Optimize the code
 */
public class ListReverse {

    public static void main(String... args) {
        int listSize = 10_000_000;
        List<Integer> list = new ArrayList<>(listSize);
        for (int i = 0; i < listSize; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        Iterable<Integer> reversedList = reverse(list);
        System.out.println("Spent time: " + (System.currentTimeMillis() - start) + " ms");
        StreamSupport.stream(reversedList.spliterator(), false).filter(e -> e <= 10).forEach(e -> System.out.print(e + " "));
    }

    private static Iterable<Integer> reverse(List<Integer> list) {
        List<Integer> result = new ArrayList<>(list.size());
        for (Integer val : list) {
            result.add(0, val);
        }
        return result;
    }

}
