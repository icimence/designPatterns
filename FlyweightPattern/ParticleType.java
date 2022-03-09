package FlyweightPattern;

public class ParticleType {
    private final String name;
    private final String color;
    private final String sprite;

    public ParticleType(String name, String color, String sprite) {
        this.name = name;
        this.color = color;
        this.sprite = sprite;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSprite() {
        return sprite;
    }
}
