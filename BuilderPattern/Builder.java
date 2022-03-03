package BuilderPattern;

public interface Builder {
    void setWindows(int windows);
    void setDoor(Door door);
    void setWall(Wall wall);
    void setGarage(Garage garage);
}
