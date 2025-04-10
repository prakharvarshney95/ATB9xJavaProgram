package Task_practice;

import java.util.Scanner;

public class Rightly_Alighned_Right_triangle {
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
            int currentNumber=1;
            for (int i=1; i<= rows; i++) {
                for (int j=1; j<= rows-i; j++) {
                    System.out.print("  ");
                }
                for (int k=1; k<=2*i; k++) {
                    System.out.print(currentNumber++);
                }
                System.out.println();
                currentNumber = 1;
            }
        } catch (Exception e) {  // Fixed spelling of 'exception'
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            sc.close();
        }
    }
}
