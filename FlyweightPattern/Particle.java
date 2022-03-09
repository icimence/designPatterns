package FlyweightPattern;

public class Particle {
    private final ParticleType particleType;
    private int x;
    private int y;
    private double speed;

    public Particle(ParticleType particleType, int x, int y, double speed) {
        this.particleType = particleType;
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public ParticleType getParticleType() {
        return particleType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getSpeed() {
        return speed;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
