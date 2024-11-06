package oct_2024.ex_15102024;

public class lab024 {
    public static void main(String[] args) {
        short score =74;
        String grade = (score>=90) ? "A" : (score>=75) ? "B" : (score>=64) ? "C" : "D";
        System.out.println("Your Grade is -> " + grade);
        System.out.printf("Your Grade is %s", grade);    }
}
