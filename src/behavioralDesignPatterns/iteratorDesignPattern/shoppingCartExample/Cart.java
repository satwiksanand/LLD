package behavioralDesignPatterns.iteratorDesignPattern.shoppingCartExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {
    List<Product> cartProducts;

    public Cart() {
        cartProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartProducts.add(product);
    }

    public Iterator<Product> iterator() {
        return new CartIterator();
    }

    class CartIterator implements Iterator<Product> {
        int currentPosition = 0;

        @Override
        public boolean hasNext() {
            return currentPosition < cartProducts.size();
        }

        @Override
        public Product next() {
            return cartProducts.get(currentPosition++);
        }

        @Override
        public void remove() {
            cartProducts.remove(--currentPosition);
        }
    }
}
