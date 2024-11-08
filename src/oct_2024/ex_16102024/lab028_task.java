package oct_2024.ex_16102024;

public class lab028_task {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int max = (a>b) ? a : b;

        System.out.println("maximum no. is"+" "+ max);
    }
}
