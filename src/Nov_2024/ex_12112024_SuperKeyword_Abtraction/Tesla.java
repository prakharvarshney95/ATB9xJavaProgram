package Nov_2024.ex_12112024_SuperKeyword_Abtraction;

public class Tesla extends Engine {

    @Override
    void startEngine() {
        System.out.println("Starting at the Electric Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping at the Electric Engine");

    }

    void drive(){
        startEngine();
        stopEngine();
    }
}
