package oct_2024.ex_30102024_Arrays;

import java.util.Scanner;

public class Lab107_Arrays_2D_Pyramid {
    public static void main(String[] args) {

           //    *
           //   ***
           //  *****
           // *******
           //*********


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();

        for(int i=0; i<=n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <=2*i-1; k++) {
                System.out.print("*");
                
            }
            System.out.println(" ");
        }


       }
    }
