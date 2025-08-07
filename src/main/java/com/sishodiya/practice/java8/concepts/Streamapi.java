package main.java.com.sishodiya.practice.java8.concepts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streamapi {
    static int i;
    public static void main(String[] args) {
        int i;
        List<String> list = Arrays.asList("apple","banana","aguavafdhfkhsdi","guava");      
        // list.stream().filter(name -> name.startsWith("a")).forEach(System.out::println);
        Optional<String> result =  list.stream().map(name -> name.toUpperCase()).reduce((a,b)->a+b);    
        // System.out.println(result);
        Map<String,Integer> map = list.stream().collect(Collectors.toMap(name -> name, name-> name.length(),(existing,replacement)->existing));
        map.entrySet().stream().forEach(entry->{
            // System.out.println(entry.getKey());
            // System.out.println(entry.getValue());
        });

        List<String> liii = list.stream().filter(s-> s.length()>5).sorted(Comparator.comparingDouble(String::length).reversed()).collect(Collectors.toList());
        System.out.println(liii);
        // IntStream.of(1,1,1,1).mapToObj(num-> "value = "+num).forEach(System.out::println);
        
    }
}

