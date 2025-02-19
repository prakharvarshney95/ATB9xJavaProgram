package oct_2024.ex_30102024_Arrays;

import java.util.Scanner;

public class Lab106_Arrays_Reverse_Right_Triangle_2D {
    public static void main(String[] args) {

        //*****
        //****
        //***
        //**
        //*

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();

        for(int i=n; i>=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }


       }
    }
