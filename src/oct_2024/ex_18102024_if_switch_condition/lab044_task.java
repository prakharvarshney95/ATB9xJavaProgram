package oct_2024.ex_18102024_if_switch_condition;

import java.util.Scanner;

public class lab044_task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator (+,-,*,/,%)");
        char operator = sc.next().charAt(0);
        float result;

        switch (operator) {
            case '+' :
                result = num1+num2;
                System.out.println(num1+"+"+num2+ "=" +result);
                break;
            case '-' :
                result = num1-num2;
                System.out.println(num1+"-"+num2+ "=" +result);
                break;
            case '*':
                result = num1*num2;
                System.out.println(num1+"*"+num2+ "=" +result);
                break;
            case '/':
                result = num1/num2;
                System.out.println(num1+"/"+num2+ "=" +result);
                break;
            case '%':
                result = num1%num2;
                System.out.println(num1+"%"+num2+ "=" +result);
                break;

        }
        sc.close();
    }
}
