package main.java.com.sishodiya.practice.java8.concepts.distinct;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctStream {
    public static void main(String[] args) {
        List<String> list = Stream.of("apple","banana","Apple","apple").distinct().collect(Collectors.toList());
        list.forEach(System.out::println);

        List<Integer> list2 = Stream.of(1,2,1,3,1,4).distinct().collect(Collectors.toList());
        list2.forEach(System.out::println);
    }
}
