package oct_2024.ex_10102024;

import java.util.Scanner;

public class lab009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter Age : "+"\t");
        int Age = scanner.nextInt();
        System.out.print("enter FirstName : "+"\t");
        String FirstName = scanner.next();
        System.out.print("enter LastName : "+"\t");
        String LastName = scanner.next();
        System.out.print("enter Occupation : "+"\t");
        String Occupation = scanner.next();
        System.out.println("Age"+" \t"+"FirstName"+" \t"+"LastName"+" \t"+"Occupation");
        System.out.println(Age+"   \t"+FirstName+"   \t\t"+ LastName+" \t\t"+Occupation);
    }
}
