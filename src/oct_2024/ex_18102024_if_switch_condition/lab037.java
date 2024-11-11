package oct_2024.ex_18102024_if_switch_condition;

import java.util.Scanner;

public class lab037 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days between (1 to 7)");
        int day = sc.nextInt();

        switch (day) {
            case 1 :
                System.out.println("Mon");
                break;
                case 2 :
                System.out.println("Tues");
                break;
            case 3 :
                System.out.println("Wed");
                break;
            case 4 :
                System.out.println("Thu");
                break;
            case 5 :
                System.out.println("Fri");
                break;
            case 6 :
                System.out.println("Sat");
                break;
            case 7 :
                System.out.println("Sun");
                break;
            default :
                System.out.println("Invalid Input, please enter a no. between 1 to 7");
                break;
        }
        System.out.println("End of the loop");
        sc.close();
    }
}
