package main.java.com.sishodiya.practice.core.arrays;

import java.awt.image.Kernel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ArrayPlayground {
    public static void main(String[] args) {
        int target1 = 9;
        int[] arr = {12, 87, 5, 7, 87, 6, 4};
        int[] sorted = {4, 5, 6, 7,12,87};
        sumToTarget(arr,target1);
        sumToTargetJ8(arr,target1);
    }

    //This is the program to return indecis of two number which sums to target.
    //{12, 4, 5, 7, 87, 6} -> will return 1,2 ( 4 + 5 = 9 )
    static void sumToTarget(int[] arr, int target){
        Map<Integer,Integer> bucket = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<target){
                if(bucket.containsKey(target-arr[i])){
                    System.out.println("Indexes are "+i+","+bucket.get(target-arr[i]));
                }else {
                    bucket.put(arr[i], i);
                }
            }
        }
    }

    static void sumToTargetJ8(int[] arr, int target){
        Map<Integer,Integer> bucket = new HashMap<>();
        IntStream.range(0, arr.length).forEach(i -> {
            if (arr[i] < target) {
                int complement = target - arr[i];
                if (bucket.containsKey(complement)) {
                    System.out.println("Indexes are " + i + "," + bucket.get(complement));
                } else {
                    bucket.put(arr[i], i);
                }
            }
        });

    }

}

