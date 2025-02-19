package oct_2024.ex_24102024_task_practice;

import java.util.Arrays;
import java.util.Scanner;

public class Lab098_Arrays_Empty {
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
        System.out.println(Arrays.toString(numbers));

//        for (int i = 0; i < numbers.length ; i++) {

        }
    }
