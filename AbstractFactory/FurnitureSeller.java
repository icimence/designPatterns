package AbstractFactory;

public class FurnitureSeller {
    private final Chair chair;
    private final Sofa sofa;
    private final CoffeeTable coffeeTable;

    public FurnitureSeller(AbstractFactory abstractFactory){
        chair = abstractFactory.createChair();
        coffeeTable= abstractFactory.createCoffeeTable();
        sofa = abstractFactory.createSofa();
    }

    public void enjoyFurniture(){
        chair.doChairJob();
        sofa.doSofaJob();
        coffeeTable.doCoffeeJob();
    }
}
