package Nov_2024.ex_18112024_Exceptions_Part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab161_Custom_Exception {
    public static void main(String[] args) throws Exception {
        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);
        System.out.println(sbi.add(icici));

        Bank jp_chase = new Bank("USD",100);
        // 100 + 100*85 = 8600
        System.out.println(sbi.add(jp_chase));

    }
}