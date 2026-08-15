package MasteringJavaCollections.FinalChallenge;

public class InventoryItem {
    private Product product;
    private int qtyTotal;
    private int qtyReserved;
    private int qtyReorder;
    private int qtyLow;
    private double salesPrice;

    public InventoryItem(Product product, int qtyTotal, int qtyReorder, int qtyLow, double salesPrice) {
        this.product = product;
        this.qtyTotal = qtyTotal;
        this.qtyReorder = qtyReorder;
        this.qtyLow = qtyLow;
        this.salesPrice = salesPrice;

        this.qtyReserved = 0;
    }

    public void reserveItem(int amount) {
        int availableToReserve = qtyTotal - qtyReserved;
        if (amount > availableToReserve) {
            System.out.println("Unable to reserve: not enough stock available");
            return;
        }
        qtyReserved += amount;
    }

    public void releaseItem(int amount) {
        if (amount > qtyReserved) {
            System.out.println("Unable to release: amount exceeds current reservations");
            return;
        }
        qtyReserved -= amount;
    }

    public void sellItem(int amount) {
        if (amount > qtyReserved) {
            System.out.println("Unable to sell: requested amount exceeds current reservations");
            return;
        }

        qtyTotal -= amount;
        qtyReserved -= amount;

        System.out.println("Successfully sold " + amount + " units.");

        if (qtyTotal <= qtyLow && qtyReorder > 0) {
            placeInventoryOrder();
        }
    }

    private void placeInventoryOrder() {
        qtyTotal += qtyReorder;
    }

    //getters
    public Product getProduct() { return product; }
    public int getQtyTotal() { return qtyTotal; }
    public int getQtyReserved() { return qtyReserved; }
    public double getSalesPrice() { return salesPrice; }

}
