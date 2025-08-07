package main.java.com.sishodiya.practice.java8.concepts.sorted;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorSorted {
    public static void main(String[] args) {
        List<String> list = Stream.of("banana","guava","apple").sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        list.forEach(System.out::println);

    }
}
