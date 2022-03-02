package AbstractFactory;

public class VictorianChair implements Chair{
    @Override
    public void doChairJob() {
        System.out.println("You can sit on this victorian Chair!");
    }
}
