
package main.java.com.sishodiya.practice.core.programs;

public class MaxSubArraySub {
    public static void main(String[] args) {
        // int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums = {10,15,0,-100,75,1,6};
        findMaxSubarraySum(nums);
    }

    public static void findMaxSubarraySum(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        // Track start and end indices of current subarray and max subarray
        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // Print result
        System.out.println("Maximum subarray sum is: " + maxSoFar);
        System.out.print("Subarray: [");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i]);
            if (i < end) System.out.print(", ");
        }
        System.out.println("]");
    }
}

