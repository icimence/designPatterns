package AbstractFactoryPattern;

public class ModernChair implements Chair{
    @Override
    public void doChairJob() {
        System.out.println("You can sit on this modern Chair!");
    }
}
