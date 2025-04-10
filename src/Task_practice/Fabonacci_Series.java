package Task_practice;

import java.util.Scanner;

public class Fabonacci_Series {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of terms: ");
            int n = sc.nextInt();
            sc.close();

            int a = 0, b = 1;
            System.out.print("Fibonacci Series: " + a + " " + b);

            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
            }
        }
    }