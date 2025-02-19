package oct_2024.ex_29102024_arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Lab097_Arrays_Empty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the array that you want to create");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number " + (i+1));
            numbers[i] = scanner.nextInt();
        }

        System.out.println("------");
        System.out.println("The numbers are:");
//        for (int i = 0; i < numbers.length ; i++) {
        for (int i = 0; i < size ; i++) {
            System.out.println(numbers[i]);

        }
    }
}
