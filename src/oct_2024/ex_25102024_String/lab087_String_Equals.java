package oct_2024.ex_25102024_String;

public class lab087_String_Equals {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

//        System.out.println(s1==s3);
//        System.out.println(s1==s4);
//        System.out.println(s10==s4);

        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s10));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equals(s5));
        System.out.println(s2.equalsIgnoreCase(s5));

    }
}
