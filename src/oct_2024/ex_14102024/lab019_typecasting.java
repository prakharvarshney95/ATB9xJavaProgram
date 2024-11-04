package oct_2024.ex_14102024;

public class lab019_typecasting {
    public static void main(String[] args) {
        // GST - 18.45
        int course = 100;
        float GST = 18.454854f;
        double total_price = course+(double)GST; // Narrowing -> Explicit
        System.out.println(total_price);
    }
}
