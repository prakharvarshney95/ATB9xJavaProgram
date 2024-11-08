package oct_2024.ex_16102024;

import java.util.Scanner;

public class lab026 {
    public static void main(String[] args) {
        // Scanner - Class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = scanner.nextInt();
        // float age = scanner.nextFloat();
       // double age = Scanner.nextDouble();

        System.out.println(age > 25 ? "Allowed to Goa" : "Not Allowed");

        //String username = scanner.next();

        scanner.close();
    }
}
