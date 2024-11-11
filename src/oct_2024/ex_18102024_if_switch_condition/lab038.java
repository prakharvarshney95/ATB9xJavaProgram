package oct_2024.ex_18102024_if_switch_condition;

import java.util.Scanner;

public class lab038 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the days between (1 to 7)");
                int day = sc.nextInt();

                switch (day) {
                    case 1 :
                        System.out.println("Mon");
                    case 2 :
                        System.out.println("Tues");
                    case 3 :
                        System.out.println("Wed");
                    case 4 :
                        System.out.println("Thu");
                    case 5 :
                        System.out.println("Fri");
                    case 6 :
                        System.out.println("Sat");
                    case 7 :
                        System.out.println("Sun");
                    default :
                        System.out.println("Invalid Input, please enter a no. between 1 to 7");
                }
                System.out.println("End of the loop");
                sc.close();
    }
}
