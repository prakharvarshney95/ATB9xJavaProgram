package Task_practice;

import java.util.Scanner;

public class Hackerrank_8_Java_End_of_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1;

        // Read input until EOF
        while (sc.hasNext()) {
            String line = sc.nextLine(); // Read the next line
            System.out.println(lineNumber + " " + line);
            lineNumber++; // Increment line number
        }

        sc.close(); // Close scanner
    }
}


