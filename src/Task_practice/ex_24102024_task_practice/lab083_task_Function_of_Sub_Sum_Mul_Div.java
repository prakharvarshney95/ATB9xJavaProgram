package Task_practice.ex_24102024_task_practice;

import java.util.Scanner;

public class lab083_task_Function_of_Sub_Sum_Mul_Div {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first parameter");
        int a = sc.nextInt();
        System.out.println("Enter the second parameter");
        int b = sc.nextInt();

        int result_sum = sum_of_numbers(a,b);
        System.out.println("Sum is " +result_sum);

        int result_sub = sub_of_numbers(a,b);
        System.out.println("Subtraction is " +result_sub);

        int result_mul = mul_of_numbers(a,b);
        System.out.println("multiplication is " +result_mul);

        int result_div = div_of_numbers(a,b);
        System.out.println("division is " +result_div);

        int result_modulus = modulus_of_numbers(a,b);
        System.out.println("modulus is " +result_modulus);

    sc.close();
    }

    static int sum_of_numbers(int a, int b) {
    return (a+b);
    }
    static int sub_of_numbers(int a, int b) {
    return (a-b);
    }

    static int mul_of_numbers (int a, int b) {
        return (a*b);
    }

    static int modulus_of_numbers (int a, int b) {
        return (a%b);
    }

    static int div_of_numbers (int a, int b) {
        if (b == 0) {
            System.out.println("not allowed");
        }
        return (a/b);
        }}