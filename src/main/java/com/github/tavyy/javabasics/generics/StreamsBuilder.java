package com.github.tavyy.javabasics.generics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsBuilder {

    public static void main(String[] args) {

        List<Integer> result = Stream.<Integer>builder()
                .add(1)
                .add(2)
                .add(3)
                .add(4)
                .build()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
