package oct_2024.ex_17102024_if_else;

import java.util.Scanner;

public class lab034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("Num1 > Num2");
        }
        else if (num2 > num1) {
            System.out.println("Num2 > Num1");
        }
        else{
            System.out.println("both Numbs are equal");
        }
        sc.close();
    }
}
