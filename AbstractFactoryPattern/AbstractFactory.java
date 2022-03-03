package AbstractFactoryPattern;

public interface AbstractFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}
