package main.java.com.sishodiya.practice.core.programs;

import java.util.Scanner;

public class TowerOfHanoiRec {
    // Recursive function to solve Tower of Hanoi
    public static void solveHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        // Step 1: Move n-1 disks from 'from' to 'aux' using 'to'
        solveHanoi(n - 1, from, aux, to);

        // Step 2: Move the nth (largest) disk from 'from' to 'to'
        System.out.println("Move disk " + n + " from " + from + " to " + to);

        // Step 3: Move n-1 disks from 'aux' to 'to' using 'from'
        solveHanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of disks
        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();

        System.out.println("\nSequence of moves:");
        solveHanoi(n, 'A', 'C', 'B'); // A=source, C=destination, B=auxiliary

        scanner.close();
    }
}
