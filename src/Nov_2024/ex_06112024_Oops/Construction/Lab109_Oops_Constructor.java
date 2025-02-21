package Nov_2024.ex_06112024_Oops.Construction;


public class Lab109_Oops_Constructor {
    public static void main(String[] args) {

        Car tesla = new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);

       }
    }
