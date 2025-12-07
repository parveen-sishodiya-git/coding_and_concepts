package main.java.com.sishodiya.practice.java8.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringPlayground {
    public static void main(String[] args) {
        String sentence = "I parveenn am learning java 8 stream api questions";
        String doublySentence = "Java is java very super super Java language kids kids";

        //Program to get highest length of word
        //getHighestLengthWord(sentence);

        //Program to get nth highest length of word
        //getNthHighestLengthWord(sentence,1);

        //Program to find nth smallest length of word
        //getNthLowestLengthWord(sentence,3);

        //Program to find occurance of each words
        //occuranceOfWords(doublySentence);

        //Program to find n no of vowels words
        //nNoOfVowelsWords(doublySentence,2);
    }

    static void nNoOfVowelsWords(String str,int n){
        Stream.of(str.split(" ")).filter(x->x.replaceAll("[^aeiouAEIOU]","").length()==n)
                .forEach(System.out::println);

    }

    static void occuranceOfWords(String str){
        Map<String, Long> map = Stream.of(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().forEach(System.out::println);
    }

    public static void getNthLowestLengthWord(String sentence,int n){
        String longestWord = Stream.of(sentence.split(" "))
                .sorted(Comparator.comparingInt(String::length)).limit(n)
                .max(Comparator.comparing(String::length)).orElse("NA");
        System.out.println(longestWord);

        //http://localhost:8080/authenticate-user

//        {
//            "personname":"praveen",
//            "personpassword":"Test@123"
//        }

//        --------------------------------

//        {
//            "personname":"praveen",
//            "personpassword":"Test@123"
//        }

    }




    public static void getNthHighestLengthWord(String sentence,int n){
//        String longestWord = Stream.of(sentence.split(" "))
//                .sorted(Comparator.comparingInt(String::length).reversed()).limit(n)
//                .min(Comparator.comparing(String::length)).orElse("NA");

        String longestWord = Stream.of(sentence.split(" "))
                .sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst().get();

        System.out.println(longestWord);
    }

    public static void getHighestLengthWord(String sentence){
        String longestWord = Stream.of(sentence.split(" "))
                .max(Comparator.comparing(String::length)).orElse("NA");
        System.out.println(longestWord);
    }


}
