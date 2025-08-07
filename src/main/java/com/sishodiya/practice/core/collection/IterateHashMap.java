// package map;
package main.java.com.sishodiya.practice.core.collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {
    public static void main(String[] args) {
        String str = "this this this this this is my dummy sentence ok i will check number of words in this";
        String[] words = str.split(" ");
        HashMap<String,Integer> map = new HashMap<>();
        for(String s: words){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        //iterating using while loop
        Iterator<HashMap.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> entry = iterator.next();
            // System.out.println(entry.getKey() +" "+entry.getValue());
        }
        
        //iterating using enhanced for loop
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() +" "+entry.getValue());
        }
    }
}
