package jdk8新特性.stream;/*

 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class demo {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(ints);
        System.out.println(stream);
    }
}
