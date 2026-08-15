package MasteringJavaCollections.FinalChallenge;

public record Product(String sku, String name, String manufacturer, String category) {
    @Override
    public String toString() {
        return "Product{" +
                "sku='" + sku + '\'' +
                ", name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
