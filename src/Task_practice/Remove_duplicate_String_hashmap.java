package Task_practice;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.LinkedHashSet;

public interface Remove_duplicate_String_hashmap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to remove duplicates");
        String str = sc.nextLine();
        sc.close();

       StringBuilder result = new StringBuilder();
        LinkedHashSet<Character> seen = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            if (seen.add(ch)) {
                result.append(ch);
            }
        }

        System.out.println("String without duplicates is: " + result.toString());
    }
}
