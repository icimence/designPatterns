package FactoryPattern;
public class FactoryDriver {
    public static void main (String[] args){
        System.out.println(">>>>>>>>>>>This is factory pattern<<<<<<<<<<<");
        System.out.println("Now I create a truck to deliver the package!");
        Factory factory = new TruckFactory();
        factory.doDeliverJob();
        System.out.println("\n-------------------------------------------\n");
        System.out.println("Now I create a ship to deliver the package!");
        factory = new ShipFactory();
        factory.doDeliverJob();
        System.out.println(">>>>>>>>>>>Factory Method Complete<<<<<<<<<<<");
    }
}
