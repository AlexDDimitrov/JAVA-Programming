package AbstractionAndInterfaces.Challenge1;

import java.util.ArrayList;

record OrderItem(int qty, Product product) {}

public class Store {
    private static ArrayList<Product> products = new ArrayList<>();

    static void main(String[] args) {
        products.add(new ArtObject("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));
        products.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));

        products.add(new Furniture("Desk", 500, "Mahogany Desk"));
        products.add(new Furniture("Lamp", 20, "Tiffany Lamp"));
        listProducts();

        System.out.println();
        var order1 = new ArrayList<OrderItem>();
        addItem(order1, 1, 2);
        addItem(order1, 0, 1);
        printOrder(order1);

        System.out.println();
        var order2 = new ArrayList<OrderItem>();
        addItem(order2, 3, 5);
        addItem(order2, 0, 13);
        addItem(order2, 1, 6);
        addItem(order2, 2, 2);
        printOrder(order2);

    }

    public static void listProducts() {
        for (var item : products) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }

    public static void addItem(ArrayList<OrderItem> orderItems, int index, int qty) {
        orderItems.add(new OrderItem(qty, products.get(index)));
    }

    public static void printOrder(ArrayList<OrderItem> orderItems) {
        double sales = 0.0;
        for (var item : orderItems) {
            item.product().printItem(item.qty());
            sales += item.product().getPrice(item.qty());
        }

        System.out.println(sales);
    }
}
