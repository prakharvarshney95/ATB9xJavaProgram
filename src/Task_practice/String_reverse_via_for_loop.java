package Task_practice;

import java.util.Scanner;

public class String_reverse_via_for_loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to reverse");
        String str = sc.nextLine();
        sc.close();

       String reversed = "";
       str = str.toUpperCase();

       for(int i=str.length()-1; i>=0; i--) {
           reversed += str.charAt(i);
       }

        System.out.println("Reversed String is " + reversed);



    }
}
