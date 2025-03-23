package Task_practice;

import java.util.Scanner;

public class Hackerrank_7_Java_Datatypes {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer count you want to check");
        int t=sc.nextInt();
        System.out.println("Now enter those " + t + " integer value you want to check");


        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");

                if (x>=Byte.MIN_VALUE && x<=Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }

                if (x>=Short.MIN_VALUE && x<=Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                if (x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                if (x>=Long.MIN_VALUE && x<=Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



