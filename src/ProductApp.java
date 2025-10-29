/**
 * The main application that simulates a shopping experience.
 */
public class ProductApp {

    /**
     * Allows the user to choose a product from a given list.
     */
    static Product chooseProduct(ArrayList<Product> allProducts) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Available products:");
        for (Product p : allProducts) {
            System.out.println(p.getShortName() + " - " + p.getDisplayName());
        }

        System.out.print("Enter product short name: ");
        String choice = sc.nextLine();

        // Match user choice with product short name
        for (Product p : allProducts) {
            if (choice.equalsIgnoreCase(p.getShortName())) {
                return p;
            }
        }

        System.out.println("Invalid choice!");
        // Return dummy product in case of invalid input
        return new Product(0, "null", 0);
    }

    /**
     * Handles the checkout process where user pays for the cart items.
     */
    static boolean checkout(Cart cart) {
        if (cart.isEmpty()) return false;

        int total = cart.getTotal();
        System.out.println("Pay in Cash: Rs. " + total);
        Scanner sc = new Scanner(System.in);
        int paid = sc.nextInt();

        // Compare payment with total amount
        if (paid > total) {
            System.out.println("Change: " + (paid - total));
            System.out.println("Thank you for shopping with us!");
            return true;
        } else if (paid == total) {
            System.out.println("Thank you for shopping with us!");
            return true;
        } else {
            System.out.println("Not enough cash!");
            return false;
        }
    }

    /**
     * Main driver function for the app.
     */
    public static void main(String[] args) {
        // Create a list of available products
        ArrayList<Product> allProducts = new ArrayList<>();
        allProducts.add(new Product(1, "apple", 26));
        allProducts.add(new Product(2, "mango", 16));
        allProducts.add(new Product(3, "guava", 36));
        allProducts.add(new Product(4, "banana", 56));
        allProducts.add(new Product(5, "strawberry", 29));

        // Create a new cart
        Cart cart = new Cart();
        Scanner sc = new Scanner(System.in);

        // Main loop for user interaction
        while (true) {
            System.out.println("\nSelect an action - (a)dd item, (v)iew cart, (c)heckout ");
            char action = sc.next().charAt(0);

            if (action == 'a') {
                // Add item to cart
                Product p = chooseProduct(allProducts);
                if (p.getPrice() != 0) {
                    cart.addProduct(p);
                    System.out.println("Added to cart: " + p.getDisplayName());
                }
            } else if (action == 'v') {
                // View cart details
                System.out.println("_____________");
                System.out.println(cart.viewCart());
                System.out.println("_____________");
            } else if (action == 'c') {
                // Checkout process
                System.out.println("_____________");
                System.out.println(cart.viewCart());
                System.out.println("_____________");
                if (checkout(cart)) break; // End program if payment successful
            } else {
                System.out.println("Please select a valid action.");
            }
        }
    }
}
