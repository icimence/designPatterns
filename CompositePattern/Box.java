package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
    List<Component> children = new ArrayList<>();
    private final String name;

    public Box(String name) {
        this.name = name;
    }

    public void addItem(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }

    @Override
    public double getPrice() {
        double sum = 0;
        for (Component component : children) {
            sum += component.getPrice();
        }
        return sum;
    }

    @Override
    public void introduce() {
        System.out.println("----------------------------");
        System.out.println("This is a Box" + name);
        for (Component component : children) {
            component.introduce();
        }
        System.out.println("Box" + name + " introduce complete");
        System.out.println("----------------------------");
    }
}
