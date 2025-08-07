package main.java.com.sishodiya.practice.core.programs;// package dpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringAsInput {
    public static void main(String[] args) {
        // String str1="This is a java interview";
        String str1="The quick brown fox jumps over the lazy dog";
        String singleString="Bablu";
        //anagram input
        String str2="rpvanee";
        String str3="parneev";
        
        //count occurance of character
        // characterOccurance(str1);

        //count vowels and consonents
        // countVowelsAndConsonents(str);

        //remove Duplicates from string
        // removeDuplicates(str);

        //check if two strings are anagram
        // checkTwoStringsAsAnagram(str2,str3);
        
        //reverse a string
        // reverseString(singleString);

        //return words in a given string
        // returnWordsInAGivenString(str1);

        //find weather s2 is a rotation of s1
        // findRotation();

        //dec to hexa
        // decimalToHexa();

        //string is panagram or not
        // checkStringPanagram(str1);

        //all streams
        // allStreams();

        // -------------------------------------------- Java 8 stream api programs

        String j8str1 = "The quick brown fox jumps over the lazy dog";
        int[] arrpos = {3, 7, 12, 18, 5, 21, 9, 16, 8, 11, 25, 6, 14, 20, 10};
        int[] arrmix = {5, -3, 0, 12, -7, 8, 0, -1, 15, -10, 3, -4, 0, 6, -8};
        
        //seperate even and odd
        // seperateEvenAndOdd(arrpos);

        //summerizing int
        // summarizingInt(arrpos);

        //summingint/long/double

        //averagingint/long/double

        //grouping by
        // groupingBy(j8str1);
        groupingBy_OccuranceOfCharacters(j8str1); //usage of grouping by
        
        //partitioning by
        // seperateEvenAndOdd(arrpos);

        //mapping
        mappingBy(arrpos);

        //reducing 
        // reducingDemo(arrpos);

    }


    public static void mappingBy(int[] arrpos){
        Arrays.stream(arrpos).filter(x -> x%2==0 ).forEach(System.out::print);
    }

    public static void reducingDemo(int[] arrpos){
        arrpos = new int[]{1,2,3};
        int sum = Arrays.stream(arrpos).boxed().collect(Collectors.reducing(0,n->n,Integer::sum));
        System.out.println(sum);
    }

    public static void groupingBy_OccuranceOfCharacters(String str){
        str = "pra ve en prv";
        // Map<Character,Long> map = str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        Map<Character,List<Character>> map = str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(c->c));
        map.keySet().stream().forEach(key->{
            System.out.println(key+" - "+map.get(key));
        });
    }

    public static void groupingBy(String str){
        Map<Integer,Long> map = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(s->s.length(),Collectors.counting()));

        map.keySet().stream().forEach(key->{
            System.out.println(key+" - "+map.get(key));
        });
    }
    public static void summarizingInt(int[] arrpos){
       IntSummaryStatistics stats = Arrays.stream(arrpos).boxed().collect(Collectors.summarizingInt(n->n));
       System.out.println(stats);
       System.out.println(stats.getMax());
    }
    public static void seperateEvenAndOdd(int[] arrpos){
        Map<Boolean,Long> map = Arrays.stream(arrpos).boxed().collect(Collectors.partitioningBy(num->num % 2 == 0,Collectors.counting()));
        map.keySet().stream().forEach(key->{
            System.out.println(key+" - "+map.get(key));
        });
    }

    public static void allStreams(){

        //all premitive stream
        //int array
        int[] arr = {1,2,3,3,34,3,3,};
        Arrays.stream(arr).forEach(System.out::print);
        Stream.of(arr).forEach(System.out::print);
        
        System.out.println();
        
        //string array
        String[] strarr = {"applle","bananan","fdsfs","fdsfds"};
        Arrays.stream(strarr).forEach(System.out::print);
        Stream.of(strarr).forEach(System.out::print);
        
        System.out.println();
        
        //string
        String str="This is a good news!!";
        str.chars().mapToObj(c->(char)c).forEach(System.out::print); //use mapToObj to convert 97 to a as chars() gives int
        System.out.println();
        str.chars().forEach(System.out::print);
        
        System.out.println();
        
        //char array
        char[] charr = {'a','b','c'};
        Stream.of(charr).forEach(System.out::println);

        //---------------------------------------------------------------------------------------------
        //all collection stream
        
        //asList is immutable fixed list, can not add remove update elements
        List<String> stringlist = Arrays.asList("apple","banana");
        stringlist.stream().forEach(System.out::print);
        
        System.out.println();
        
        List<Integer> intlist = Arrays.asList(1,2,1,12,12,12,1,5,48,4,45,15,5);
        intlist.stream().forEach(System.out::print); //this is stream with Integer which boxex and unboxex every time
        
        System.out.println();
        
        //IntStream is specific for primitive int type
        // int[] intt = {1,343,4,3,4,343,4,23,32,43,2,3,2};
        IntStream pintstream = IntStream.of(1,343,4,3,4,343,4,23,32,43,2,3,2);
        pintstream.forEach(System.out::print);


    }
    public static void checkStringPanagram(String str){
        int[] alphas = new int[26];
        str.chars().map(ch-> Character.toLowerCase(ch)).filter(ch->ch!=32).forEach(ch->alphas[(int)ch-97]++);

        boolean panagram = true;
        for (int i = 0; i < alphas.length; i++) {
            if (alphas[i]==0) {
                panagram = false;
                break;
            }
        }
        IntStream.of(alphas).forEach(e->{
            System.out.print(e+", ");
        });
        if (panagram) {
            System.out.println("String is panagram");
        }else
        {
            System.out.println("String is not panagram");

        }
        // Stream.of(alphas).filter(e-> e==0);

        // IntStream.of(alphas).filter(e -> e==0);


    }
    public static void decimalToHexa(){
        
        char[] hexs = "0123456789ABCDEF".toCharArray();
        int n = 2545;
        String hex = "";

        while (n > 0) {
            int rem = n % 16;
            hex = hexs[rem] + hex;
            System.out.println("Rem = "+rem+" Hex = "+hexs[rem]);
            n = n / 16;
        }
        System.out.println(hex);

    }

    public static void findRotation(){
        String s1 = "abcd";
        String s2 = "cdab";
        boolean rotation = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.equals(s2)) {
                rotation = true;
                break;
            }
            s1 = s1.charAt(s1.length()-1)+s1.substring(0,s1.length()-1);
        }
        if (rotation) {
            
            System.out.println("Rotation matched");
        }else{
            System.out.println("Rotation does not matched");

        }


    }
    public static void returnWordsInAGivenString(String s1){
        String[] arr = s1.split(" ");
        StringBuilder finalString = new StringBuilder();

        for(String str: arr){
            finalString.append(reverseString(str));
            finalString.append(" ");
        }
        System.out.print(finalString);
    }


    public static String reverseString(String s1){
        char[] finalChars = new char[s1.length()];
        int i = s1.length()-1;
        for(char ch:s1.toCharArray()){
            finalChars[i] = ch;
            i--;
        }
        String finall = new String(finalChars);//.replace("\n", "");
        // System.out.println(finall);
        return finall;
    }
    public static void checkTwoStringsAsAnagram(String s1, String s2){
        s1="praveen";
        s2="praveen";
        int[] dups = new int[26];
        if (s1.length() != s2.length()) {
            System.out.println("String is not anagram");
        }else{
            s1.chars().forEach(c -> dups[c-97]++);
            s2.chars().forEach(c -> dups[c-97]--);
            long test = IntStream.of(dups).filter(e -> e > 0).count();
            System.out.println((test==0)?"Anagram":"Not anagram");
        }

    }

    public static void removeDuplicates(String str){
        StringBuilder finalString = new StringBuilder();
        str.chars().mapToObj(c-> (char) c).filter(e-> {
            if (finalString.indexOf(String.valueOf(e)) == -1) {
                finalString.append(String.valueOf(e));
                return true;
            }
            return false;   
        }).forEach(System.out::print);
        
        
    }

    public static void countVowelsAndConsonents(String str){
        // str.chars().mapToObj(c -> (char) c).forEach(System.out::print);
        long v = str.chars().mapToObj(c -> (char) c).filter(c -> "aeiou".indexOf(c) >=0).count();
        long con = str.chars().mapToObj(c -> (char) c).filter(c -> "aeiou".indexOf(c) == -1).count();
        System.out.println("V = "+v);
        System.out.println("C = "+con);

    }
    public static void characterOccurance(String str){
        char[] chars = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>(); 

        for (int i = 0; i < chars.length; i++) {
            map.put(Character.toLowerCase(chars[i]), (map.getOrDefault(chars[i], 0)+1));
        }

        map.entrySet().stream().forEach(entry->{
            System.out.println(entry.getKey()+" = "+entry.getValue());
        });
    }
}