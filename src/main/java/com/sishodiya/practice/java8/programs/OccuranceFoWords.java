package main.java.com.sishodiya.practice.java8.programs;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccuranceFoWords {
    public static void main(String[] args) {
        Map<String, Long> map = Stream.of("Java","very","java","is","api","2","very","java","am","api","java")
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().forEach(System.out::println);
    }
}
