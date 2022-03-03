package BuilderPattern;

public class BuilderDriver{
    public static void main(String[] args){
        HouseBuilder houseBuilder = new HouseBuilder();
        Director director = new Director();
        director.buildSimpleHouse(houseBuilder);
        House house = houseBuilder.buildHouse();
        HouseFileBuilder fileBuilder = new HouseFileBuilder();
        director.buildSimpleHouse(fileBuilder);
        HouseFile houseFile = fileBuilder.createHouseFile();
        houseFile.introduceHouse();
        System.out.println("----------------------------------------");
        house.getDoor().getOut();
        house.getDoor().open();
        house.getDoor().getOut();
    }
}
