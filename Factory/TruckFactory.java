package Factory;

public class TruckFactory extends Factory{
    @Override
    public Transportation createTrans() {
        return new Truck();
    }
}
