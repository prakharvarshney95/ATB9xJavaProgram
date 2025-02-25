package Nov_2024.ex_12112024_SuperKeyword_Abtraction;

public class Lab125 {
    public static void main(String[] args) {
//        WagonR r  = new WagonR();
//        r.drive();

        Tesla t  = new Tesla();
        t.drive();

//        class Engine = new Engine();
    }
}

class WagonR extends Engine{

    void drive(){
        startEngine();
        stopEngine();
    }



    @Override
    void startEngine() {
        System.out.println("starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("stopping car");
    }
}



abstract class Engine {
    abstract void startEngine();
    abstract void stopEngine();
}