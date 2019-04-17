package com.github.tavyy.javabasics.exercise.array;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.stream.IntStream;

public class OccurrenceFinder {

    private final int[] items;

    OccurrenceFinder(int[] items, int maxValueInArray) {
        this.items = items;
    }

    long[] getNumberOfOccurrences(int[] itemsToSearch) {
        var result = new long[itemsToSearch.length];
        for (var i = 0; i < itemsToSearch.length; i++) {
            for (var item : items) {
                if (item == itemsToSearch[i]) {
                    result[i] = result[i] + 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int maxValue = 100;
        int[] itemsToSearch = {2, 30, 14, 11, 8, 6, 20, 23, 36, 77, 89, 65, 44, 27, 7, 99, 87, 59, 57, 50, 40, 22, 95, 91, 84, 74};
        SecureRandom random = new SecureRandom();
        var items = new int[10_000_000];
        for (var i = 0; i < items.length; i++) {
            items[i] = random.nextInt(maxValue);
        }


        long startTime = System.currentTimeMillis();
        var finder = new OccurrenceFinder(items, maxValue);
        var occurrences = finder.getNumberOfOccurrences(itemsToSearch);
        System.out.println("Spent time = " + (System.currentTimeMillis() - startTime) + " ms");
        System.out.println(Arrays.toString(occurrences));

        var expectedResult = IntStream.of(itemsToSearch).mapToLong(item -> IntStream.of(items).filter(i -> i == item).count()).toArray();
        System.out.println(Arrays.toString(expectedResult));
    }

}
