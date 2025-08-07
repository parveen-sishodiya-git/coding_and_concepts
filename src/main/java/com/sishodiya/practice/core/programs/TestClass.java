package main.java.com.sishodiya.practice.core.programs;// package dpackage;

import java.util.Set;
import java.util.stream.Collectors;

public class TestClass {

    public static void main(String[] args) {
        String str = "aaaaaabbbbbbb";

        Set<Character> set = str.chars().mapToObj(c->(char) c).collect(Collectors.toSet());

        set.stream().forEach(System.out::print);


        //
        // str.toCharArray();

    }
}