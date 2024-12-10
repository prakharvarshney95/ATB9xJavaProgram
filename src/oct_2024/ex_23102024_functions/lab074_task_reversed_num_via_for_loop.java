package oct_2024.ex_23102024_functions;

import java.util.Scanner;

public class lab074_task_reversed_num_via_for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int num = sc.nextInt();

        int reversednum = 0;

        for (; num!= 0; num/=10) {
            int digit = num % 10;
            reversednum = reversednum * 10 + digit;
        }
        System.out.println("reversed number is "+ " "+ reversednum);
        sc.close();
    }
}