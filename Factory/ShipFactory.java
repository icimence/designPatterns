package Factory;

public class ShipFactory  extends Factory{

    @Override
    public Transportation createTrans() {
        return new Ship();
    }
}
