package CompositePattern;

public class CompositeDriver {
    public static void main(String[] args) {
        Product product1 = new Product(20.0, "PRODUCT1");
        Product product2 = new Product(25.0, "PRODUCT2");
        Product product3 = new Product(31.0, "PRODUCT3");
        Product product4 = new Product(46.0, "PRODUCT4");
        Box box1 = new Box("GIFT1");
        Box box2 = new Box("GIFT2");
        Box box3 = new Box("GIFT3");
        box1.addItem(product1);
        box1.addItem(product4);
        box2.addItem(box1);
        box2.addItem(product2);
        box3.addItem(box2);
        box3.addItem(product3);
        System.out.println("Price of all the product is " + box3.getPrice());
        box3.introduce();
    }
}
