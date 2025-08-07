package main.java.com.sishodiya.practice.java8.programs;// package java8styled;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterVowels {
    public static void main(String[] args) {
        String str = "ukfhauuuuuuuuujifndklsnfkew";
        // str.chars().mapToObj(ch -> (char) ch).filter(element -> ("aeiou".indexOf(element) != -1)).forEach(System.out::println);
        // str.chars().mapToObj(ch -> (char) ch).forEach(System.out::println);
        

        //char playground 
        String chars = str.chars().mapToObj(c -> Character.toUpperCase((char) c)).map(String::valueOf).collect(Collectors.joining("-","[","]"));
        //chars.forEach(System.out::println);
        System.out.println(chars);

    }
}
