package prototype;

public class Main {
    public static void main(String[] args) {
        ProductPrototype product1 = new Product("Laptop", 999.99);
        ProductPrototype product2 = new Product("Smartphone", 499.99);

        // Clone the prototypes to create new product instances
        ProductPrototype newProduct1 = product1.clone();
        ProductPrototype newProduct2 = product2.clone();

        System.out.println("Original Products:");
        product1.display();
        product2.display();

        System.out.println("\nCloned Products:");
        newProduct1.display();
        newProduct2.display();
    }
}
