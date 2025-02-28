package Task_practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the first string:");
        String s1 = sc.nextLine();

        System.out.println("Enter the second string:");
        String s2 = sc.nextLine();

        sc.close(); // Closing the scanner to avoid resource leak

        // Checking if they are anagrams
        if (areAnagrams(s1, s2)) {
            System.out.println("The strings are Anagrams.");
        } else {
            System.out.println("The strings are Not Anagrams.");
        }
    }

    public static boolean areAnagrams(String s1, String s2) {
        // Remove non-letter characters and convert to lowercase
        s1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check if lengths are different
        if (s1.length() != s2.length()) {
            return false;
        }

        // Convert to character arrays and sort
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted character arrays
        return Arrays.equals(arr1, arr2);
    }
}