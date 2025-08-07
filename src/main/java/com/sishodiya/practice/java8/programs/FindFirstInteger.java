package main.java.com.sishodiya.practice.java8.programs;

import java.util.Optional;
import java.util.stream.Stream;

public class FindFirstInteger {
    public static void main(String[] args) {
        Optional<Integer> intt = Stream.of(1,2,3,4,5).findFirst();
//        intt.ifPresent(System.out::println);
        intt.ifPresent(System.out::println);

    }
}
