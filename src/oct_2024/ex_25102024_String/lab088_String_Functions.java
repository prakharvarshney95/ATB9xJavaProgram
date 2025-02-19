package oct_2024.ex_25102024_String;

public class lab088_String_Functions {
    public static void main(String[] args) {
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11,15);
        System.out.println(roar);

        String s1 = "Prakhar";
        String s2 = "Varshney";
        System.out.println(s1.concat(s2));

        String s3 = "Prakhar";
        String s4 = s3.concat("Varshney");
        System.out.println(s4);

        String s5 = "hello";
        String s6 = "world";
        String s7 = "ji";
        System.out.println(s5+s6+s7);
        System.out.println(s5+" "+s6+" "+s7);

    }
}
