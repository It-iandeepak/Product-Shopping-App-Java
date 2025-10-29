/**
 * Represents the shopping cart which holds multiple items.
 */
class Cart {
    // Key = Product ID, Value = Item (Product + Quantity)
    private HashMap<Integer, Item> items = new HashMap<>();

    // Adds a product to the cart or increases quantity if already exists
    public void addProduct(Product p) {
        if (items.containsKey(p.getId())) {
            items.get(p.getId()).incQuantity(1);
        } else {
            items.put(p.getId(), new Item(p, 1));
        }
    }

    // Returns total amount of all items in the cart
    int getTotal() {
        int total = 0;
        for (Item item : items.values()) {
            total += item.getItemPrice();
        }
        return total;
    }

    // Displays all items and total price in a formatted way
    String viewCart() {
        if (items.isEmpty()) {
            return "Cart is empty";
        }
        StringBuilder sb = new StringBuilder();
        for (Item item : items.values()) {
            sb.append(item.getItemInfo());
        }
        sb.append("\nTotal Amount: Rs. ").append(getTotal()).append("\n");
        return sb.toString();
    }

    // Checks if the cart is empty
    boolean isEmpty() {
        return items.isEmpty();
    }
}
