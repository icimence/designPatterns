package AbstractFactory;

public class ModernCoffeeTable implements CoffeeTable{
    @Override
    public void doCoffeeJob() {
        System.out.println("You can enjoy your coffee on this modern table");
    }
}
