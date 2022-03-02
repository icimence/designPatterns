package Factory;

public class Truck implements Transportation{
    @Override
    public void deliver() {
        System.out.println("Truck has done the road deliver.");
    }
}
