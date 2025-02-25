package Task_practice;

import java.util.Scanner;

public class String_reverse_via_stringBuilder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to reverse");
        String str = sc.nextLine();
        sc.close();

//       String reversed = "";
        str = str.toUpperCase();

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Reversed String is " + reversed);



    }
}
