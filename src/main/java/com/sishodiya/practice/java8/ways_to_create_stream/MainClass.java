package main.java.com.sishodiya.practice.java8.ways_to_create_stream;// package WaysToCreateStream;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        
        //ways to create the stream
        //collection.stream
        createCollectionStream();
        //Arrays.stream
        createArraysStream();
        //Stream.of
        createStreamByOf();
        //Stream.builder
        createStreamByBuilder();
        //Stream.iterate
        createStreamByIterator();
    }

    private static void createStreamByIterator() {

        Stream.iterate("*", n-> " "+n+"*").limit(150).forEach(System.out::println);
        
    }

    private static void createStreamByBuilder() {
        Stream.Builder<String> mybuilder =  Stream.builder();
        mybuilder.add("mybuilder").add("null");
        Stream<String> teststttr = mybuilder.build();
    }

    private static void createStreamByOf() {
        Stream<Integer> test = Stream.of(1,51,61,61,61,65,16,165,16);
        Stream<String> test2 = Stream.of("test","fdsaf","fdsfdsa");

    }

    private static void createArraysStream() {
        Integer[] testarr = {4,54,54,54,54,54,545,1,16,1,165,16,1894,613,16,4,5};
        Stream<Integer> teststream = Arrays.stream(new Integer[] {4,54,54,54,54,54,545,1,16,1,165,16,1894,613,16,4,5});
        Stream<Integer> teststream2 = Arrays.stream(testarr);

        String[] strarr = {"apple","bol","christ"};
        Stream<String> str = Arrays.stream(strarr);
    }

    private static void createCollectionStream() {

        List<String> testlist2str = Arrays.asList("dfd","dfd");

        List<Integer> testlist2 = Arrays.asList(4,51,51,51,51,51,5,15,154,548,4,8);
        testlist2.stream();



        List<Integer> salaries = new ArrayList<>();
        salaries.add(13020);
        salaries.add(45400);
        salaries.add(140053);
        salaries.add(10345);
        salaries.add(14500);
        salaries.add(13400);
        salaries.add(145400);
        salaries.add(15400);

        //System.out.println(salaries.stream().count());
        Stream<Integer> salaryStream = salaries.stream();

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");

        Stream<String> fstream = fruits.stream();

        List<String> department = new LinkedList<>();
        department.add("IT");
        department.add("NETWORKING");
        department.add("ADMIN");

        Stream<String> dlist = department.stream();

        Set<String> baby = new HashSet<>();
        baby.add("ram");
        baby.add("lakhan");

        baby.stream();

        Queue<Integer> testints = new PriorityQueue<>();
        testints.add(5);
        testints.add(2);

        testints.stream();
        
    }
}
