package oct_2024.ex_17102024_if_else;

import java.util.Scanner;

public class lab029 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();

        if (age > 18)
        {
            System.out.println("Allowed to vote");
        }
        else
            {
            System.out.println("Not allowed to vote");

            }
        sc.close();
    }
        }