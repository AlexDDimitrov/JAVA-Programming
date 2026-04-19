package Object_Car;

public class Car {
    String make = "Ford";//attribute
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;

    void start() {
        System.out.println("Engine ON");
    }
    void end() {
        System.out.println("Engine OFF");
    }
    void drive() {
        System.out.println("You are driving a " + make + ' ' + model + "!");
    }
}
