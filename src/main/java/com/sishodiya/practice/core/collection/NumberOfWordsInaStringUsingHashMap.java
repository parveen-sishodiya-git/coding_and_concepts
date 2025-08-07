package main.java.com.sishodiya.practice.core.collection;// package main_package;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NumberOfWordsInaStringUsingHashMap {
    public static void main(String[] args) {
        String str = "this this this this this is my dummy sentence ok i will check number of words in this";
        String[] words = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String s: words){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        Iterator<HashMap.Entry<String,Integer>> it = map.entrySet().iterator();
        int numberOfWords = 0;
        while (it.hasNext()) {
            HashMap.Entry<String,Integer> entry = it.next();
            numberOfWords += entry.getValue();
        }
        System.out.println("No of words are "+numberOfWords);
    }
}
