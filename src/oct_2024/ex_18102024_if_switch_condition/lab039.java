package oct_2024.ex_18102024_if_switch_condition;

import java.util.Scanner;

public class lab039 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome" :
                System.out.println("Starting the Chrome");
                System.out.println("........");
                break;
            case "firefox" :
                System.out.println("Starting the Firefox");
                break;
            case "edge" :
                System.out.println("Starting the Microsoft Edge");
                break;
            default :
                System.out.println("No idea about this browser");
                break;
        }
        sc.close();
    }
}
