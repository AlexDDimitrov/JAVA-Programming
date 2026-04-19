package Composition;

public class Main {
    public void main(String[] args) {
        //composition - represents a "part-of" relationship between objects
        // engine is a "part-of" car
        //allows complex objects to be constructed from smaller object

        Car car = new Car("Mustang", 2026, "v8");
        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
