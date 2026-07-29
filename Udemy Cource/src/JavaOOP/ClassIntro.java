package JavaOOP;

public class ClassIntro {
    static void main(String[] args) {
        Car car = new Car();

        car.setMake("Porsche");
        car.setModel("911 turbo");
        car.setColor("Black");
        car.setDoors(4);
        car.setConvertable(false);

        System.out.println("make = " + car.getMake());
        car.describeCar();
    }
}
