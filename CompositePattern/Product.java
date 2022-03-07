package CompositePattern;

public class Product implements Component {
    private final String name;
    private final double price;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void introduce() {
        System.out.println("This product name is " + name);
        System.out.println("This product price is " + price);
    }
}
