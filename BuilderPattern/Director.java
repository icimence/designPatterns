package BuilderPattern;

public class Director {
    public void buildSimpleHouse(Builder builder){
        builder.setWindows(2);
        builder.setDoor(new Door(180,70));
        builder.setGarage(Garage.SMALL);
        builder.setWall(Wall.WOOD);
    }

    public void buildComfortHouse(Builder builder){
        builder.setWindows(4);
        builder.setDoor(new Door(200,90));
        builder.setGarage(Garage.MIDDLE);
        builder.setWall(Wall.STONE);
    }

    public void buildLuxuryHouse(Builder builder){
        builder.setWindows(6);
        builder.setDoor(new Door(240,120));
        builder.setGarage(Garage.LARGE);
        builder.setWall(Wall.CEMENT);
    }

}
