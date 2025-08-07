package main.java.com.sishodiya.practice.java8.concepts.flattenmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlattenMap {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple","banana","c","d");
        List<String> list2 = Arrays.asList("e","fish","girraf","h");
        List<String> list3 = Arrays.asList("i","j","k","l");
        List<String> list4 = Arrays.asList("m","n","o","perrot");

        List<String> mainList = Stream.of(list1,list2,list3,list4).flatMap(s->s.stream()).collect(Collectors.toList());
        mainList.stream().forEach(System.out::println);
    }
}
