package BuilderPattern;

public class HouseBuilder implements Builder{
    private HouseType houseType;
    private int windows;
    private Door door;
    private Garage garage;
    private Wall wall;

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public House buildHouse(){
        return new House(houseType,windows,wall,door,garage);
    }
}
