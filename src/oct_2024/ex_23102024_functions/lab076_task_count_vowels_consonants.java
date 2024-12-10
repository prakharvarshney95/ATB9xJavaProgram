package oct_2024.ex_23102024_functions;

import java.util.Scanner;

public class lab076_task_count_vowels_consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string for which you want to count the vowels and consonants");
        String input = sc.nextLine();
        input = input.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z')  {
                consonantCount++;
            }
}
            System.out.println("Vowel count is " + vowelCount);
            System.out.println("Consonant count is " + consonantCount);
sc.close();
    }
}
