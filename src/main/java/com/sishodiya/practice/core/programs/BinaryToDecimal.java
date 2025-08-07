package main.java.com.sishodiya.practice.core.programs;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input binary number as a string to handle leading zeros
        System.out.print("Enter a binary number: ");
        String binaryStr = scanner.nextLine();

        // Convert binary to decimal
        int decimal = 0;
        int power = binaryStr.length() - 1;

        char[] bits = binaryStr.toCharArray();

        for (int i = 0; i < bits.length; i++) {
            int bit = 0;
            if (bits[i] == '1') {
                bit = 1;
            }
            decimal = decimal + (int)(Math.pow(2, power) * bit);
            power--;
        }
        binaryToDecimal(bits);
        // System.out.println("Decimal is "+decimal);

        // Loop through the binary string from right to left
        
    }

    public static void binaryToDecimal(char[] bits){
        long decimal = 0L;
        int powerTurns = 0;
        for (int i = bits.length - 1; i>=0 ; i--) {
            System.out.println("Bit i got "+bits[i]);
            if (bits[i] != '0' && bits[i] != '1') {
                System.out.println("Invalid binary number");
                return;
            }
            if (bits[i] == '1') {
                decimal = decimal + (long)(Math.pow(2, powerTurns));
                System.out.println("in if");
            }
            powerTurns++;
        }
        System.out.println(decimal);
    }
}
