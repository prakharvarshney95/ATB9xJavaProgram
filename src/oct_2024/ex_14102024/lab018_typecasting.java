package oct_2024.ex_14102024;

public class lab018_typecasting {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //
        // short s = phone_no; // Implict - JVM
        byte s = (byte)phone_no; // Explicit - User - Loss that data
        System.out.println(s);
    }

    public static class lab019_typecasting {

    }
}
