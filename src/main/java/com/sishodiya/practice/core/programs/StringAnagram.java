package main.java.com.sishodiya.practice.core.programs;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {
    public static void main(String[] args) {
        String s1 = "aieuo";
        String s2 = "iouea";
        Map<Character,Integer> map = new HashMap<>();
        s1.chars().mapToObj(ch -> (char) ch).forEach(element -> {
            map.put(element, map.getOrDefault(element, 0)+1);
        });
        s2.chars().mapToObj(ch -> (char) ch).forEach(element -> {
            map.put(element, map.getOrDefault(element, 0)+1);
        });
        map.values().forEach(value -> {
            if (value != 2) {
                System.out.println("String is not anagram");
            }
        });
        // map.entrySet().forEach(entry->{
        //     System.out.println(entry.getKey()+" - "+entry.getValue());
        // });
    }   
}
