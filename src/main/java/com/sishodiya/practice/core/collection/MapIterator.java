package main.java.com.sishodiya.practice.core.collection;

import java.util.HashMap;
import java.util.Map;

public class MapIterator {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2, "Banana");
        map.put(1, "Apple");
        map.put(3, "Guava");
        // printByEntrySet(map);
        // printByKeySet(map);
        map.forEach((key, value)-> System.out.println(key+" " +value));
    }

    public static void printByKeySet(Map<Integer,String> map){
        for(int key: map.keySet()){
            // System.out.println(map.get(key));
        }
        for(String value:map.values()){
            System.out.println(value);
        }
    }
    public static void printByEntrySet(Map<Integer,String> map){
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("key "+entry.getKey()+" value "+entry.getValue());
        }
    }
}
