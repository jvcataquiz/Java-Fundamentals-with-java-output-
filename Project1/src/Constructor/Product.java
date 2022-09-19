package Constructor;

public class Product {
    String name;
    float price;
    Product(String name, float price){
        this.name = name;
        this.price = price;

        System.out.println("\n" + name + ": " + price +" Created!\n\n");
    }
}
