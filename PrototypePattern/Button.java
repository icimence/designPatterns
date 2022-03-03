package PrototypePattern;

import java.util.Objects;

public class Button extends Prototype {
    private int height;
    private int width;
    private String color;

    public Button() {
    }

    public Button(Button prototype) {
        super(prototype);
        this.color = prototype.getColor();
        this.height = prototype.getHeight();
        this.width = prototype.getWidth();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Prototype clone() {
        return new Button(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Button button = (Button) o;

        if (height != button.height) return false;
        if (width != button.width) return false;
        return Objects.equals(color, button.color);
    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + width;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
