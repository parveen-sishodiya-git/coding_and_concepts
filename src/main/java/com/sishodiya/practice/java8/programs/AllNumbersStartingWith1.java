package main.java.com.sishodiya.practice.java8.programs;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllNumbersStartingWith1 {
    public static void main(String[] args) {
//        Integer.valueOf("a");
        List<Integer> list = Stream.of(1,4,11,14,51,44,11,45,101).filter(n->n%1==0)
                .map(String::valueOf).filter(s->s.startsWith("1")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(list);
    }
}
