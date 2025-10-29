import java.util.*;

/**
 * Represents a single product with basic details like ID, name, and price.
 */
class Product {
    private int id;
    private String name;
    private int price;

    // Constructor to initialize a product
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Returns product name with price in a readable format
    String getDisplayName() {
        return name + " : Rs " + price;
    }

    // Returns product price
    int getPrice() {
        return price;
    }

    // Returns the first letter of product name (used for quick selection)
    String getShortName() {
        return name.substring(0, 1);
    }

    // Returns product ID
    int getId() {
        return id;
    }

    // Returns product name
    String getName() {
        return name;
    }
}
