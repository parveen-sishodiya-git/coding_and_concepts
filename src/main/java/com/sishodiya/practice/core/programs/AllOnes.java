package main.java.com.sishodiya.practice.core.programs;

import java.util.Arrays;

public class AllOnes {
    public static void main(String[] args) {
        int[] nums = {2,1,3,1,1,4,1,5,1,1,4,18,10,1,3,1,1,5,1};
        int j = nums.length - 1;
        for (int i = nums.length - 1; i>=0 ;i--) {
            if (nums[i] != 1) {
                nums[j] = nums[i];
                j--;
            }
        }

        for (int i = 0; i < j; i++) {
            nums[i] = 1;
        }

        Arrays.stream(nums).mapToObj(num-> String.valueOf(num)+", ").forEach(System.out::print);

    }
}
