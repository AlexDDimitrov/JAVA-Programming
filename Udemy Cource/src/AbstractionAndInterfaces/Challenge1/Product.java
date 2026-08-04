package AbstractionAndInterfaces.Challenge1;

public abstract class Product {
    protected String type;
    protected double price;
    protected String description;

    public Product(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getPrice(int qty) {
        return qty * price;
    }

    public void printItem(int qty) {
        System.out.printf("%2d qty at %8.2f each, %-15s %-35s \n",
                qty, price, type, description);
    }

    public abstract void showDetails();
}
