package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};

        for(Vehicle vehicle: vehicles) {
            vehicle.go();
        }
        //polymorphism can be achieved by using classes of interfaces
    }
}
