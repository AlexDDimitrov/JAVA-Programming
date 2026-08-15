package MasteringJavaCollections.FinalChallenge;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Store {
    private Collection<InventoryItem> inventory;
    private Collection<Cart> carts;
    private Collection<InventoryItem> aisleInventory;

    public Store(Collection<InventoryItem> inventory) {
        this.inventory = inventory;
        this.aisleInventory = new ArrayList<>(inventory);
        this.carts = new ArrayList<>();
    }

    public void manageStoreCarts(Cart cart) {
        this.carts.add(cart);
        System.out.println("Cart ID " + cart.getCartId() + " is now managed by the store.");
    }

    public void checkOutCart(Cart cart) {
        System.out.println("Processing checkout for Cart ID: " + cart.getCartId());

        Map<Product, InventoryItem> inventoryMap = inventory.stream()
                .collect(Collectors.toMap(InventoryItem::getProduct, item -> item));

        cart.printSalesSlip(inventoryMap);

        cart.getProducts().forEach((product, quantity) -> {
            InventoryItem item = inventoryMap.get(product);
            if (item != null) {
                item.sellItem(quantity); // This triggers the stock drop and automated reorder!
            }
        });

        this.carts.remove(cart);
    }

    public void abandonCarts() {
        LocalDate today = LocalDate.now();

        long abandonedCount = carts.stream()
                .filter(cart -> !cart.getDate().equals(today))
                .count();

        carts.removeIf(cart -> !cart.getDate().equals(today));

        if (abandonedCount > 0) {
            System.out.println("Successfully cleared " + abandonedCount + " stale/abandoned carts from previous days.");
        }
    }

    public void listProductsByCategory() {
        System.out.println("=== PRODUCTS BY CATEGORY ===");

        Map<String, List<InventoryItem>> groupedByCategory = inventory.stream()
                .collect(Collectors.groupingBy(item -> item.getProduct().category()));

        groupedByCategory.forEach((category, items) -> {
            System.out.println("\nCategory: [" + category.toUpperCase() + "]");
            for (InventoryItem item : items) {
                System.out.printf(" - %-20s | Stock: %-3d | Price: $%.2f%n",
                        item.getProduct().name(),
                        item.getQtyTotal(),
                        item.getSalesPrice()
                );
            }
        });
    }
}
