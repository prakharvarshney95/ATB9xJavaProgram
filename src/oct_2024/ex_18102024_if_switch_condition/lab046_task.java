package oct_2024.ex_18102024_if_switch_condition;

import java.util.Scanner;

public class lab046_task {
    public static void main(String[] args) {
        System.out.println("Enter different units for conversion ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Conversion from km to miles");
                //To convert kilometers to miles-
                //Distance in miles = Distance in kilometers × 0.621371
                System.out.println("Enter the value in kilometers");
                double km = sc.nextDouble();
                double miles = km * 0.621371;
                //System.out.println("Miles converted to kilometers " + miles);
                //"2f" is a format specifier that indicates that a floating-point number should be rounded to two decimal places and displayed with two digits after the decimal point:
                //.2: Specifies the number of decimal places to display
                //f: Indicates that the value being inserted is a floating-point number
                System.out.printf("%.2f kilometers is %.2f miles.%n", km, miles);
//                System.out.printf(miles);
                break;

            case 2:
                System.out.println("Conversion from Celsius to Fahrenheit");
                System.out.println("Enter the value in Celsius");
                double celsius = sc.nextDouble();
                double fahrenheit = celsius * 5 / 9 + 32; // Conversion formula ;
                System.out.printf("%.2f celsius is %.2f fahrenheit", fahrenheit, celsius);
//                System.out.printf(celsius);
                break;

            default:
                System.out.println("Error: Invalid choice. Please enter 1 or 2.");
                break;
        }
    }
}
