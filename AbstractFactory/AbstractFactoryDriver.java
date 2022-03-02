package AbstractFactory;
/**可以直接使用工厂生产的类进行消费，或者使用FurnitureSeller作为包装，成套使用
 * 两种调用方式的区别在于是否隐藏产品类的使用细节
 * 如果使用了FurnitureSeller则客户端，则在客户端视角将不会知道业务内容和方法
 *
 * 应该可以视情况进行选择
 */
public class AbstractFactoryDriver {
    public static void main(String[] args){
        //将会对两种调用方法都进行展示
        System.out.println(">>>>>>>>>>>>>>>Abstract Factory Pattern<<<<<<<<<<<<<<<");
        System.out.println("Assume you choose to create modern furniture");
        AbstractFactory abstractFactory = new ModernFurnitureFactory();
        //使用FurnitureSeller就体现在这里，可以看到所有家具的使用细节都被屏蔽了
        FurnitureSeller furnitureSeller = new FurnitureSeller(abstractFactory);
        furnitureSeller.enjoyFurniture();
        System.out.println("-----------------------------------------------------");
        //也可以不使用包装，单个使用家具，但是这要求客户端知道家具的实现细节。
        Chair chair = abstractFactory.createChair();
        chair.doChairJob();

        //下面已经注释的代码是维克多风格家具的代码，可以自行试用
//        System.out.println("-----------------------------------------------------");
//        System.out.println("Assume you choose to create victorian furniture");
//        abstractFactory = new VictorianFurnitureFactory();
//        furnitureSeller = new FurnitureSeller(abstractFactory);
//        furnitureSeller.enjoyFurniture();
//        System.out.println("-----------------------------------------------------");
//        chair = abstractFactory.createChair();
//        chair.doChairJob();
    }
}
