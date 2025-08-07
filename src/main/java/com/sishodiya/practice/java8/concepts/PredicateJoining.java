package main.java.com.sishodiya.practice.java8.concepts;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        Predicate<String> testLength = s -> s.length()<=7;
        Predicate<String> testEven = s -> s.length() % 2 == 0;

        System.out.println("Before Joining Predicate");
        System.out.println("Length is valid : "+testLength.test("Praveen"));
        System.out.println("Length is even or not = "+testEven.test("Praveen"));
        System.out.println("After Joining Predicate");
        System.out.println(testLength.and(testEven).test("Praveen"));
        System.out.println(testLength.or(testEven).test("Praveen"));
        System.out.println(testEven.negate().test("Praveen"));
    }    
}
