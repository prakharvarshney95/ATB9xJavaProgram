package oct_2024.ex_19102024_for_loop;

public class lab063 {
    public static void main(String[] args) {
        // Continue
        for (int i = 0; i < 50; i++) {
            if(i == 5){
                continue; // skip below code, move to top
            }
            System.out.println(i);
        }
    }
}
