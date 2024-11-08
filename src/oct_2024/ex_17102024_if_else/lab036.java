package oct_2024.ex_17102024_if_else;

import java.util.Scanner;

public class lab036 {
    public static void main(String[] args) {

        //Write a program that classifies a triangle based on its side lengths.
        //Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.
        //side1, side2, side2 → eq, iso, scalene

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side1");
        double side1 = sc.nextDouble();

        System.out.println("Enter the side2");
        double side2 = sc.nextDouble();

        System.out.println("Enter the side3");
        double side3 = sc.nextDouble();

        if (side1==side2 && side1==side3) {
            System.out.println("Equilateral Triangle");
        }
        else if (side1==side2 || side1==side3 || side2==side3) {
            System.out.println("Isosceles Triangle");
        }
        else if (side1<=0 && side2<=0 && side3<=0) {
            System.out.println("Invalid input, side can't be negative");
        }
        else {
            System.out.println("Scalene Triangle");
        }
        sc.close();
        }

    }