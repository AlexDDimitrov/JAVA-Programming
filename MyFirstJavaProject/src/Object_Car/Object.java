package Object_Car;

public class Object {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1.isRunning);

        car1.start();
        car1.isRunning = true;
        car1.end();
        car1.isRunning = false;
        car1.drive();

        Car car2 = new Car();
        car2.make = "Ferrari";
        car2.model = "F80";
        car2.year = 2025;
        System.out.println(car2.make);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.price);
        System.out.println(car2.isRunning);

        car2.start();
        car2.isRunning = true;
        car2.end();
        car2.isRunning = false;
        car2.drive();
    }
}
