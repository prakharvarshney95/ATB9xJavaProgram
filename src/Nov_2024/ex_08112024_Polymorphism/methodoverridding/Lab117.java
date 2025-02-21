package Nov_2024.ex_08112024_Polymorphism.methodoverridding;

public class Lab117 {
    public static void main(String[] args) {

        Hound h1 = new Hound();
        h1.bark();
    }
}

class Dog {
    void bark(){
        System.out.println("I am Dog, i will Bark!!");
    }
    int age = 10;
}

 class Hound extends Dog{
    // Hound is type of Dog

    @Override
    void bark(){
        System.out.println("Bark of Hound");
    }
}
