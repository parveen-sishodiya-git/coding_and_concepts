package main.java.com.sishodiya.practice.java8.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swWiss";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        str.toLowerCase().chars().mapToObj(c-> (char) c).forEach(c->{
            map.put(c,(map.getOrDefault(c,0)+1));
        });
        Optional<Character> charss =  map.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst();
        charss.ifPresent(System.out::println);

    }
}
