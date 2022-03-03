package AbstractFactoryPattern;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void doCoffeeJob() {
        System.out.println("You can enjoy your coffee on this victorian table");
    }
}
