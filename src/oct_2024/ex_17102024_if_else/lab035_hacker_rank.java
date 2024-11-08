package oct_2024.ex_17102024_if_else;

import java.util.Scanner;

public class lab035_hacker_rank {
    public static void main(String[] args) {
        // ✅ Grade Calculator:
        // Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F)
        // based on the following grading scale:
        //
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        // Logic Building - Java

        // Step 1
        // Find the inputs / outputs
        // Input | score -> (0 - 100) -> data type -> int
        // Output | grade -> data type -> char


        // 2. Basic Logic |  Rough Logic
        // if ( score >= 90 && score <= 100 ) -> return or print grade - A
        // else if score <=89 && score >= 80 -> return or print grade - B
        // else if score <=79 && score >= 70 -> return or print grade - C
        // D,E
        //  // else -> grade -> F


        // 3. Write the code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();
        //char grade = sc.nextLine();

        if (score>=90 && score<=100) {
            System.out.println("Grade A");
        }
        else if (score>=80 && score<=89) {
            System.out.println("Grade B");
        }
            else if (score>=70 && score<=79) {
            System.out.println("Grade C");
        }
            else if (score>=60 && score<=69) {
            System.out.println("Grade D");
        }
            else if (score>=50 && score<=59) {
            System.out.println("Grade E");
        }
            else if (score<0 || score>100) {
            System.out.println("your grade is zero");
        }
            else {
            System.out.println("Grade F");
        }
            sc.close();
            }

    }
