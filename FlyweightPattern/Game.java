package FlyweightPattern;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Particle> particles = new ArrayList<>();

    public void addParticles(int x, int y, double speed, String name, String color, String sprite) {
        ParticleType particleType = ParticleTypeFactory.getParticleTpe(name, color, sprite);
        Particle particle = new Particle(particleType, x, y, speed);
        particles.add(particle);
    }

    public List<Particle> getParticles() {
        return particles;
    }
}
