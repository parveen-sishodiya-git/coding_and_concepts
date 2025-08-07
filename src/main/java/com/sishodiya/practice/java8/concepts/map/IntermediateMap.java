package main.java.com.sishodiya.practice.java8.concepts.map;

import java.util.Arrays;
import java.util.List;

public class IntermediateMap {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana");

        //mapping string to its length
        list.stream().map(e->e+"_"+e.length()).forEach(System.out::println);
    }
}
