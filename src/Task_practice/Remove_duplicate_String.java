package Task_practice;

import java.util.Scanner;

public interface Remove_duplicate_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to remove duplicates");
        String str = sc.nextLine();
        sc.close();

        str = str.toLowerCase();
        String results = "";

        for(int i=0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if(results.indexOf(ch) == -1) {
                results += ch;
            }
        }

//        To reverse the result of string

        String reversed = "";
        for (int i=results.length()-1; i>=0; i--) {
            reversed += results.charAt(i);
        }
//

//        To reverse the actual input string

        String reversedactualString = "";
        for (int i=str.length()-1; i>=0; i--) {
            reversedactualString += str.charAt(i);
        }

        System.out.println("String without duplicates is: " + results);
        System.out.println("String without duplicates and with reverse order is: " + reversed);
        System.out.println("Actual String and with reverse order is: " + reversedactualString);
    }
}
