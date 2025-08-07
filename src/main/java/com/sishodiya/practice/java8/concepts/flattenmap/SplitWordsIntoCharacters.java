package main.java.com.sishodiya.practice.java8.concepts.flattenmap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SplitWordsIntoCharacters {
    public static void main(String[] args) {
        List<Character> chars = Stream.of("apple_","banana_","guava_").flatMap(s->s.chars().mapToObj(c->(char)c)).collect(Collectors.toList());
        //"apple".chars().mapToObj(c->(char) (c+1)).forEach(System.out::println);
        chars.forEach(System.out::println);
        concateAllStrings();
    }

    public static void concateAllStrings(){
        String mainString = Stream.of("apple_","banana_","guava_").reduce("",(a,b)->a+b);
        System.out.println(mainString);
    }
}
