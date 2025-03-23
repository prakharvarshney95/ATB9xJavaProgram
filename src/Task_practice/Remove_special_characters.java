package Task_practice;

import java.util.Scanner;

public class Remove_special_characters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to reverse");
        String str = sc.nextLine();
        sc.close();

        String replace = str.replaceAll("[^A-Za-z0-9]", "");
        System.out.println("Cleaned String is: " + replace);
    }
}
