package oct_2024.ex_30102024_Arrays;

import java.util.Arrays;

public class Lab100_Arrays_ForEach {
    public static void main(String[] args) {

        int[] a = new int[3];
        a[0] = 90;
        a[1] = 91;
        a[2] = 92;

//        for(int i=0; i<a.length; i++) {
//            System.out.println(a[i]);
//        }

        for (int i:a) {
            System.out.println(i);
        }

        String[] names = {"Prakhar", "Latif", "Anand", "Viraj"};
        for (String name:names) {
            System.out.println(name);
        }

        for (String n:names) {
            System.out.println(n);
        }

        int[] numbers = {44,56,22,11,7,36};
        for (int n:numbers) {
            System.out.println(n);
        }
//        System.out.println("Your array numbers are" + Arrays.toString(numbers));
        }
    }
