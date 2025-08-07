package main.java.com.sishodiya.practice.core.programs;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        boolean prime = true;
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int loopEnd = (int) Math.sqrt(number);
        System.out.println("loop end is "+loopEnd);

        if (number == 0 || number == 1) {
                prime = false;
        }
        for (int i = 2; i <= loopEnd; i++) {
            
            if (number % i == 0) {
                prime = false; 
                break;
            }
        }
        if(prime)
            System.out.println("Number is a prime number");
        else
            System.out.println("Number is not a prime number");
    }
}
