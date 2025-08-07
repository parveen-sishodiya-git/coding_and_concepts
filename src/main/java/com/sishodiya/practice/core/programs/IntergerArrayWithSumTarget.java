package main.java.com.sishodiya.practice.core.programs;
import java.util.HashMap;
import java.util.Map;

public class IntergerArrayWithSumTarget {
    static boolean elementsFound = false;
    static HashMap<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        int[] arr = {2,3,14,5,99,34};
        int targetNumber = 101;
        for(int i = 0; i < arr.length; i++){
            if (map.containsKey(targetNumber - arr[i])) {
                // System.out.println("Element at index "+i +" and "+getIndexFromMap(targetNumber - arr[i],map));
                System.out.println("Element at index "+i +" and "+ map.get(targetNumber - arr[i]));
                elementsFound = true;
            }else{
                map.put(arr[i], i);
            }
        }
        if(!elementsFound) System.out.println("Elements not found for number "+targetNumber);
    }
}
