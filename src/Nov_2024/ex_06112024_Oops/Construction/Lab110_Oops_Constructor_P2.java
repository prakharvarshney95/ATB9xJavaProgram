package Nov_2024.ex_06112024_Oops.Construction;


import java.util.Scanner;

public class Lab110_Oops_Constructor_P2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car2 t1 = new Car2("Tesla", 2015, "Q9X");
        System.out.println(t1.model);
        System.out.println(t1.year);
        System.out.println(t1.name);

        t1.display();

        Car2 t2 = new Car2("Nano", 2010, "ATB9x");
        System.out.println(t2.year);
        System.out.println(t2.model);
        System.out.println(t2.name);

        t2.display();

        System.out.println("Enter the model");
        String model_input = sc.next();
        System.out.println("Enter the year");
        int year_input = sc.nextInt();
        System.out.println("Enter the name");
        String name_input = sc.next();

        Car2 t3 = new Car2(model_input, year_input, name_input);
        System.out.println(t3.model);
        System.out.println(t3.year);
        System.out.println(t3.name);

        t3.display();


    }
}

class Car2 {

    String model;
    int year;
    String name;

    Car2(String model, int year, String name) {
        System.out.println("PC");
        this.model = model;
        this.year = year;
        this.name = name;

    }

    void display() {
        System.out.println("Car2 Details "+this.model+" "+this.year+" "+this.name);
    }

}
