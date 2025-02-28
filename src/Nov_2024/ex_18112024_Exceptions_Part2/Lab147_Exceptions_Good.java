    package Nov_2024.ex_18112024_Exceptions_Part2;

public class Lab147_Exceptions_Good {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10/a;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c); // java.lang.ArithmeticException
    }
}