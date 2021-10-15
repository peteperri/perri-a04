package baseline;

public class Product {

    private final String name;
    private final double price;
    private final int quantity;

    //constructor for Product objects
    public Product(String name, double price, int quantity){

        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //returns the name of the product as a String
    public String getName(){
        return name;
    }

    //toString method to print out the product
    public String toString(){
        return String.format("Name: %s%nPrice: $%.2f%nQuantity: %d", name, price, quantity);
    }
}
