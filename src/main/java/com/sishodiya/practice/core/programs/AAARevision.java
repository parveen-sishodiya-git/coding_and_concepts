package main.java.com.sishodiya.practice.core.programs;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AAARevision {
    public static void main(String[] args) {
        //shift all ones to left
//        shiftAllOneToLeft();

        //------------------------java8
        evenNumberProduct();
    }

//    Would you like real-time examples like summing salary, finding max number, or combining strings using reduce?

    public static void evenNumberProduct(){
        int length1 = Arrays.asList("praveen","sishodiya")
                .stream()
                .reduce(0,(a,b)-> a + b.length(),(c,d)->0);

        System.out.println(length1);
    }

    public static void sum(){
        IntStream.rangeClosed(2, new Scanner(System.in).nextInt()).filter(a -> a%2 == 0).reduce(0, (a, b)->a+b);
    }

    private static void shiftAllOneToLeft() {
        int[] nums = {5,4,3,2,1,1};
        boolean onePresent = false;
        //int[] nums = {2,1,3,1,1,4,1,5,1,1,4,18,10,1,3,1,1,5,1};
        int right = nums.length-1;
        int k = nums.length-1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 1){
                nums[k] = nums[i];
                k--;
            }else{
                onePresent = true;
            }
        }

        if(onePresent){
            if(k==0){
                nums[k] = 1;
            }else {
                for (int i = 0; i < k; i++) {
                    nums[i] = 1;
                }
            }
        }


        System.out.println("After Processing");
        for (int num:nums)
            System.out.print(num+", ");
    }
}
