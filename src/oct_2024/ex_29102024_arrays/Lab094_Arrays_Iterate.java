package oct_2024.ex_29102024_arrays;

import java.util.Arrays;

public class Lab094_Arrays_Iterate {
    public static void main(String[] args) {

        int[] marks = {51,100,91,87,90,91,92};
        System.out.println(marks.length);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);

        System.out.println("  - - - - - -");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        Arrays.sort(marks);
        int item_index = Arrays.binarySearch(marks, 100);
        System.out.println(item_index);



    }
}
