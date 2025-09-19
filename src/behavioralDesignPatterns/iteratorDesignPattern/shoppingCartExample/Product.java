package behavioralDesignPatterns.iteratorDesignPattern.shoppingCartExample;

public class Product {
    String productName;
    int productQuantity;
    public Product(String name, int quantity){
        this.productName = name;
        this.productQuantity = quantity;
    }

    @Override
    public String toString(){
        return "product:-> " + this.productName + ", quantity:-> " + this.productQuantity + ".";
    }
}
