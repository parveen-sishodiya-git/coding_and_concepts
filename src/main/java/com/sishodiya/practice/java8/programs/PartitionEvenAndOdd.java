package main.java.com.sishodiya.practice.java8.programs;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitionEvenAndOdd {
    public static void main(String[] args) {
        Map<Boolean, List<Integer>> map = Stream.of(1,2,3,4,5,56,8,10)
                .collect(Collectors.partitioningBy(n->n%2==0));
        map.entrySet().forEach(System.out::println);
    }
}
