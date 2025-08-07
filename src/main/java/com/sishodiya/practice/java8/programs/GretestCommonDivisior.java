package main.java.com.sishodiya.practice.java8.programs;// package java8styled;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class GretestCommonDivisior {
    public static void main(String[] args) {
        int[] arr = {36 , 60, 48};
        OptionalInt result = IntStream.of(arr).reduce((a,b)->{
            // System.out.println(a+" - "+b);
            while (b != 0) {
                int temp = b;
                System.out.println(a+" - "+b);
                b = a % b;
                a = temp;
            }
            return a;
        });
        System.out.println(result);
    }
}
