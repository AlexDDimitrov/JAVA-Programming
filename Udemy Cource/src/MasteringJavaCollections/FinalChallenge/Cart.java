package MasteringJavaCollections.FinalChallenge;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    enum TypeEnum { PHYSICAL, VIRTUAL }

    private static long idCounter = 0;
    private final long cartId;
    private final Map<Product, Integer> products;
    private final LocalDate date;
    private final TypeEnum type;

    public Cart(TypeEnum type) {
        idCounter += 1;
        this.cartId = idCounter;
        this.products = new HashMap<>();
        this.date = LocalDate.now();
        this.type = type;
    }

    public void addItem(Product... pendingProducts) {
        for (Product p : pendingProducts) {
            addItem(p, 1);
        }
    }

    public void addItem(Product product, int quantity) {
        products.put(product, products.getOrDefault(product, 0) + quantity);
    }

    public void removeItem(Product product) {
        products.remove(product);
    }

    public void printSalesSlip(Map<Product, InventoryItem> inventory) {
        System.out.println("=================================");
        System.out.println("RECEIPT FOR CART ID: " + cartId);
        System.out.println("Date: " + date + " | Type: " + type);
        System.out.println("=================================");

        double totalCartPrice = 0;

        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product p = entry.getKey();
            int qty = entry.getValue();

            InventoryItem item = inventory.get(p);

            if (item != null) {
                double price = item.getSalesPrice();
                double itemTotal = price * qty;
                totalCartPrice += itemTotal;
                System.out.printf("- %-20s x%-3d $%.2f%n", p.name(), qty, itemTotal);
            } else {
                System.out.printf("- %-20s x%-3d (Price Unavailable)%n", p.name(), qty);
            }
        }

        System.out.println("---------------------------------");
        System.out.printf("TOTAL PRICE:                  $%.2f%n", totalCartPrice);
        System.out.println("=================================");
    }

    public LocalDate getDate() {
        return date;
    }

    public long getCartId() {
        return cartId;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}