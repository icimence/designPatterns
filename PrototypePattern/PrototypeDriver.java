package PrototypePattern;

public class PrototypeDriver {
    public static void main(String[] args) {
        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();
        Button button = new Button();
        button.x = 1;
        button.y = 2;
        button.setColor("blue");
        button.setHeight(50);
        button.setWidth(200);
        prototypeRegistry.addItem("blueLoadingButton", button);
        Button button2 = (Button) prototypeRegistry.getItemByName("blueLoadingButton");
        System.out.println("Now we start to judge if these buttons are same");
        boolean flag = button == button2;//检查是否是同一个对象，即指向相同地址，如果这样会导致在后续修改时摧毁原型
        System.out.println("First check whether they are the same object: " + flag);
        flag = button.equals(button2);//检查是否内容相同，复制出来的必须和原型相同
        System.out.println("Then check whether they are same: " + flag);
    }
}
