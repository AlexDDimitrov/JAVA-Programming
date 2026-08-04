package AbstractionAndInterfaces.Challenge1;

public class Furniture extends Product{

    public Furniture(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " was manufactured in USA");
        System.out.printf("The price of the piece is %6.2f \n", price);
        System.out.println(description);
    }
}
