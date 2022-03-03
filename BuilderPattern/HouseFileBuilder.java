package BuilderPattern;

import javax.swing.*;

public class HouseFileBuilder implements Builder {
    private int windows;
    private Garage garage;
    private Wall wall;
    private Door door;

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void setWall(Wall wall) {
        this.wall = wall;
    }

    @Override
    public void setDoor(Door door) {
        this.door = door;
    }

    public HouseFile createHouseFile() {
        return new HouseFile(windows, wall, door, garage);
    }
}
