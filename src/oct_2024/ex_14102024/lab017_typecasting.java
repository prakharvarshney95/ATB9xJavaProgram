package oct_2024.ex_14102024;

public class lab017_typecasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //
        // short s = phone_no; // Implict - JVM
        int s = (int)phone_no; // Explicit - User - Loss that data
        System.out.println(s);
    }
}
