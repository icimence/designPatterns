package BuilderPattern;

public class Door {
    private boolean open = false;
    private final double height;
    private final double width;

    public Door(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void open() {
        open = true;
    }

    public void close() {
        open = false;
    }

    public void getOut() {
        if (open) {
            System.out.println("你走出了家门");
        } else {
            System.err.println("门还关着，你撞在了门上");
        }
    }

    public boolean isOpen() {
        return open;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
