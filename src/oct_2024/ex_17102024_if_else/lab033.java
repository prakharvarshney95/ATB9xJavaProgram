package oct_2024.ex_17102024_if_else;

import java.util.Scanner;

public class lab033 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number, I'll tell whether it's odd or even");
        int num = sc.nextInt();

        if (num%2==0)
        {
            System.out.println("Number is even");
        }
        else{
            System.out.println("no. is odd");
        }
        sc.close();
    }
}
