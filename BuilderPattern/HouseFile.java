package BuilderPattern;

public class HouseFile {
    private final int windows;
    private final Wall wall;
    private final Door door;
    private final Garage garage;

    public HouseFile(int windows, Wall wall, Door door, Garage garage) {
        this.windows = windows;
        this.wall = wall;
        this.door = door;
        this.garage = garage;
    }

    public void introduceHouse() {
        System.out.println("This is your House:");
        System.out.println("It has " + windows + " windows");
        System.out.println("You have a " + garage.toString() + " garage");
        System.out.println("The wall was built by " + wall.toString());
        System.out.println("The Door is " + door.getHeight() + "*" + door.getWidth());
    }
}
