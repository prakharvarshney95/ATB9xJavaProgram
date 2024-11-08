package oct_2024.ex_16102024;

import java.util.Scanner;

public class lab027_task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the user's name");
        String name = scanner.nextLine();

        System.out.println("Enter the user's age");
        int age = scanner.nextInt();

        System.out.println("Enter the user's salary");
        short salary = scanner.nextShort();


        System.out.println("age:" + age);
        System.out.println("name:" + name);
        System.out.println("salary:" + salary);

        scanner.close();
    }
}
