package main.java.com.sishodiya.practice.java8.programs;

import java.util.List;
import java.util.ArrayList;

public class FilterSalary {
    public static void main(String[] args) {
        List<Integer> salaries = new ArrayList<>();
        salaries.add(13020);
        salaries.add(45400);
        salaries.add(140053);
        salaries.add(10345);
        salaries.add(14500);
        salaries.add(13400);
        salaries.add(145400);
        salaries.add(15400);

        //iterating
        // salaries.stream().forEach(System.out::println);

        //filtering
        System.out.println(salaries.stream().filter(sal -> sal > 30000).count()); //forEach(System.out::println);
     }    
}
