package Task_practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex {
    String pattern = "^(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\."
            + "(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\."
            + "(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])\\."
            + "(25[0-5]|2[0-4][0-9]|1?[0-9]?[0-9])$";
}

public class Hackerrank_9_Java_Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();
        Pattern pattern = Pattern.compile(myRegex.pattern);

        while (scanner.hasNext()) {
            String ip = scanner.nextLine();
            Matcher matcher = pattern.matcher(ip);
            System.out.println(matcher.matches()); // Print true if valid, false otherwise
        }

        scanner.close();
    }
}

