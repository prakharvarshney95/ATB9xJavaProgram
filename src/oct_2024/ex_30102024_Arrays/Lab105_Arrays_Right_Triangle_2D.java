package oct_2024.ex_30102024_Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab105_Arrays_Right_Triangle_2D {
    public static void main(String[] args) {


        //*
        //**
        //***
        //****
        //*****

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();

        for(int i=0; i< n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }


       }
    }
