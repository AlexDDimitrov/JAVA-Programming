package Getter_And_Setter_Methods;

public class Main {
    public void main(String[] args) {
        Car car = new Car("Charger", "Yellow", 1000);

        System.out.println(car.getPrice());
        //car.model - inaccessible
        //car.model = "Mustang"; we don't want to change the parameters so we use private
        //but we can use getters - read and setters - write to change that

        //setter:
        car.setPrice(5000);
        car.setColor("Red");
        System.out.println(car.getPrice());
        //getter - getPrice();    setter - setPrice;
        //if we want to add extra security and don't want to allow to write with setters we write final;
    }
}
