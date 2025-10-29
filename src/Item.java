/**
 * Represents an item in the shopping cart — a product with its quantity.
 */
class Item {
    private Product product;
    private int quantity;

    // Constructor to initialize an item with a product and quantity
    public Item(Product p, int q) {
        product = p;
        quantity = q;
    }

    // Returns total price for this item (quantity × price per product)
    int getItemPrice() {
        return quantity * product.getPrice();
    }

    // Returns item details like "2 x Mango Rs 32"
    String getItemInfo() {
        return quantity + " x " + product.getName() + " Rs " + getItemPrice() + "\n";
    }

    // Increases quantity of this item (for repeated additions)
    void incQuantity(int i) {
        quantity += i;
    }
}
