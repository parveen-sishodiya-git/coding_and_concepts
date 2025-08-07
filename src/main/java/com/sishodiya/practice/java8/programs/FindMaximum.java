package main.java.com.sishodiya.practice.java8.programs;// package java8styled;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindMaximum {
    public static void main1(String[] args) {
        int[] arr = {1000,15,55,1,361,72,6,66};
        // OptionalInt result = IntStream.of(arr).reduce((a,b)-> a > b ? a : b);
        int result = IntStream.of(arr).reduce(0, Math::max);
        System.out.println("Max number is "+result);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1000,15,55,1,361,72,1000,6,66));
        int max = list.stream().max(Comparator.comparingInt(n->n)).orElse(0);
        System.out.println(max);
    }
}
