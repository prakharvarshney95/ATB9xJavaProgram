package Task_practice;

import java.util.Scanner;

public class Non_repeating_character {


    //    String = aabbcdee
//   write programme to find first non-repeating character from the input string

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        sc.close();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non-repeating character: " + ch);
                return;

// String results = "";
//
//    for(int i = 0; i < str.length(); i++){
//            char ch = str.charAt(i);
//            {
//                if (results.indexOf(ch)== -1) {
////                    results = String.valueOf(+ ch);
//                    System.out.println(ch);


            }

        }
    }

}
