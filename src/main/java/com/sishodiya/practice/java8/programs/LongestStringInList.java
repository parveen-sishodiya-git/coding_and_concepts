package main.java.com.sishodiya.practice.java8.programs;

import java.util.Optional;
import java.util.stream.Stream;

public class LongestStringInList {
    public static void main(String[] args) {
        Optional<String> finalstr = Stream.of("apple","ahyujikolp","blllllllllllllllanana","rampuri")
                .reduce((shortstr,longstr)->shortstr.length()>longstr.length()?shortstr:longstr);
        System.out.println(finalstr.get());
    }
}
