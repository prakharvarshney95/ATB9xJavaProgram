package Task_practice;

import java.util.Scanner;

public class Hackerrank_6_Java_Loops_II {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // Number of queries

        for (int i = 0; i < t; i++) {
            int a = in.nextInt(); // Starting value
            int b = in.nextInt(); // Multiplier
            int n = in.nextInt(); // Number of terms

            int sum = a; // Initialize sum with 'a'

            // Generate the series
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b; // Compute the term using powers of 2
                System.out.print(sum + " "); // Print each term
            }

            System.out.println(); // New line for the next query
        }

        in.close();
    }
}


