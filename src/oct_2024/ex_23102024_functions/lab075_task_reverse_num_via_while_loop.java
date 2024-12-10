package oct_2024.ex_23102024_functions;

import java.util.Scanner;

public class lab075_task_reverse_num_via_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int num = sc.nextInt();

        int reversednum = 0;

        while (num!=0) {
           int digit = num%10;
           reversednum = reversednum*10 + digit;
           num = num/10;
        }
        System.out.println("Reversed number is" +" "+reversednum);
        sc.close();

    }
}
