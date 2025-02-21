package Nov_2024.ex_07112024_Inheritance.singleInheritance.example1;

import org.w3c.dom.ls.LSOutput;

public class Lab112_single_inheritance {
    public static void main(String[] args) {
        // Single Inheritance
        // Son will get the attributes from Father.
        // 1 son and 1 father.

        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk2(); //son has extended
        s1.bhk3();

        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();
//        f1.bhk3(); Father has not extended

    }


}
