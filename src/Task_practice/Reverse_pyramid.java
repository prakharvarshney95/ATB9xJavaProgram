package Task_practice;

import java.util.Scanner;

public class Reverse_pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows for pattern");
        int rows = sc.nextInt();
        sc.close();

        for(int i=rows; i>=1; i--) {
            for (int j=0; j<rows-i; j--) {
                System.out.print(" ");
            }

            for(int k=1; k<=2*i-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
