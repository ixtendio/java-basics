package com.github.tavyy.javabasics.exercise.interfaces;

/**
 * Convert the sum function into a curry function
 */
public class CurryFunction {

    public static void main(String[] args) {

        System.out.println(sum(2, 3));
    }

    static int sum(int x, int y) {
        return x + y;
    }
}
