package BuilderPattern;

public class House {
    private final HouseType houseType;
    private final int windows;
    private final Wall wall;
    private final Door door;
    private final Garage garage;

    public House(HouseType houseType, int windows, Wall wall, Door door, Garage garage) {
        this.houseType = houseType;
        this.windows = windows;
        this.wall = wall;
        this.door = door;
        this.garage = garage;
    }

    public String getHouseType() {
        return houseType.toString();
    }

    public int getWindows() {
        return windows;
    }

    public Wall getWall() {
        return wall;
    }

    public Door getDoor() {
        return door;
    }

    public Garage getGarage() {
        return garage;
    }
}
