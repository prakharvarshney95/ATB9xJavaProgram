package oct_2024.ex_18102024_if_switch_condition;

import java.util.Scanner;

public class lab045_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month between (1 to 12)");
        int month = sc.nextInt();

        switch (month) {
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7:
                System.out.println("Jul");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default :
                System.out.println("Invalid Input, please enter a no. between 1 to 12");
                break;
        }
        System.out.println("End of the loop");
        sc.close();
    }
}
