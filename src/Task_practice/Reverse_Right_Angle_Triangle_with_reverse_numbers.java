package Task_practice;

import java.util.Scanner;

public class Reverse_Right_Angle_Triangle_with_reverse_numbers {
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
            for (int i = rows; i >= 1; i--) {
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
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
