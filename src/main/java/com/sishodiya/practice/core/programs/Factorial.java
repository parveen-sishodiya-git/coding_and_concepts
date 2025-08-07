package main.java.com.sishodiya.practice.core.programs;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        // int result = IntStream.rangeClosed(1, number).reduce(1, (a, b) -> a * b);
        
        // for (int i = 0; i <= number; i++) {
        //     System.out.println(i);
        // }

        // System.out.println("----------------------------------");
        
        
        int result = IntStream.rangeClosed(1, number).reduce(1,(a,b)->a*b);
        System.out.println("Result " + result);
    }
}


// import java.util.Scanner;
// public class Factorial {
//     public static void main(String[] args) {
//         int number = new Scanner(System.in).nextInt();
//         int result = 1;
//         while (number>1) {
//             result = result * number;
//             number--;
//         }
//         System.out.println("Result "+result);
//     }    
// }
