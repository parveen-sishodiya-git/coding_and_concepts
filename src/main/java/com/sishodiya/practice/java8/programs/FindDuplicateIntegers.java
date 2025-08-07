package main.java.com.sishodiya.practice.java8.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Find duplicate elements in integer list

public class FindDuplicateIntegers {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Set<Integer> finalset = Stream.of(12,14,3,14,12,5,16,14,1,115,115,115).filter(n-> !set.add(n)).collect(Collectors.toSet());
        finalset.forEach(System.out::println);

//        Stream.of(12,14,3,14,12,5,16,14,1,115,115,115).distinct().forEach(System.out::println);
    }

}
