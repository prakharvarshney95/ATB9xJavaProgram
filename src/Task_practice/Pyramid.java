package Task_practice;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pattern:");

        try {
            int rows = sc.nextInt();

            if (rows <= 0) {
                System.out.println("Please enter a positive integer.");
                return;
            }

            System.out.println("Pattern:");
            for (int i=1; i<= rows; i++) {
                for (int j=1; j<= rows-i; j++) {
                    System.out.print("  ");
                }
                for (int k=1; k<=2*i-1; k++) {
                    System.out.print(k+ " ");
                }
                System.out.println();
            }
        } catch (Exception e) {  // Fixed spelling of 'exception'
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}
