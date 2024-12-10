package oct_2024.ex_23102024_functions;

import java.util.Scanner;

public class lab077_task_palindrome_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int num = sc.nextInt();

        int originalnum = num;
        int reversednum = 0;

        for (; num!= 0; num/=10) {
            int digit = num % 10;
            reversednum = reversednum * 10 + digit;
        }
        if (originalnum == reversednum) {
            System.out.println("This is palindrome number");
        }
        else {
            System.out.println("This is non-palindrome number");
        }
        sc.close();

    }
}
