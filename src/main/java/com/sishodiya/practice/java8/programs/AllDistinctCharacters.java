package main.java.com.sishodiya.practice.java8.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AllDistinctCharacters {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana");
        Set<Character>  set = words.stream().flatMap(s->s.chars().mapToObj(c->(char) c)).collect(Collectors.toSet());
        System.out.println(set);
    }
}
