package MasteringJavaCollections.FinalChallenge;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("SKU-100", "Pro Laptop", "TechCorp", "Electronics");
        Product mouse = new Product("SKU-101", "Wireless Mouse", "LogiTech", "Electronics");
        Product coffee = new Product("SKU-200", "Organic Coffee Beans", "JavaRoasters", "Groceries");

        InventoryItem laptopStock = new InventoryItem(laptop, 10, 5, 2, 1200.00);
        InventoryItem mouseStock = new InventoryItem(mouse, 50, 20, 10, 49.99);
        InventoryItem coffeeStock = new InventoryItem(coffee, 5, 10, 3, 14.99);

        Collection<InventoryItem> initialInventory = new ArrayList<>();
        initialInventory.add(laptopStock);
        initialInventory.add(mouseStock);
        initialInventory.add(coffeeStock);

        Store myStore = new Store(initialInventory);

        myStore.listProductsByCategory();
        System.out.println();

        Cart customerCart = new Cart(Cart.TypeEnum.PHYSICAL);
        myStore.manageStoreCarts(customerCart);

        System.out.println("\nReserving items for customer...");
        laptopStock.reserveItem(1);
        mouseStock.reserveItem(2);

        customerCart.addItem(laptop);
        customerCart.addItem(mouse, 2);

        System.out.println();
        myStore.checkOutCart(customerCart);

        coffeeStock.reserveItem(3);
        Cart groceryCart = new Cart(Cart.TypeEnum.PHYSICAL);
        groceryCart.addItem(coffee, 3);

        myStore.checkOutCart(groceryCart);
        System.out.println("Current Coffee physical total stock post-reorder: " + coffeeStock.getQtyTotal());

        myStore.abandonCarts();
    }
}
