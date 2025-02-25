package Task_practice;

import java.util.Locale;
import java.util.Scanner;

public class String_palindrome_check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for palandrome check");
        String name = sc.nextLine();
        sc.close();

        Boolean isPalindrome = true;
        name = name.toLowerCase();

        for (int i = 0; i < name.length() / 2; i++) {
            char start = name.charAt(i);
            char end = name.charAt(name.length() - 1 - i);

            if (start != end) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("String is palindrome");
        }
                else{
                System.out.println("String is not palindrome");
            }
        }
    }
