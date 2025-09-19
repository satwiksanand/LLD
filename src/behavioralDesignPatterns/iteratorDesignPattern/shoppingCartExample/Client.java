package behavioralDesignPatterns.iteratorDesignPattern.shoppingCartExample;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Product p1 = new Product("tooth paste", 15);
        Product p2 = new Product("pen", 30);
        Product p3 = new Product("bottle", 20);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        System.out.println("Displaying Cart:");
        Iterator<Product> iterator = cart.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }

        System.out.println("\nRemoving last product returned");
        iterator.remove();

        System.out.println("\nDisplaying Cart:");
        iterator = cart.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }
    }
}
