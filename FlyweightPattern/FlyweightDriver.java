package FlyweightPattern;

import java.util.List;

public class FlyweightDriver {
    public static void main(String[] args) {
        Game game = new Game();
        game.addParticles(1, 1, 2.0, "redLargeParticle", "Red", "helloWorld");
        game.addParticles(2, 2, 5.0, "redLargeParticle", "Red", "helloWorld");
        List<Particle> particles = game.getParticles();
        boolean flag = particles.get(0)  == particles.get(1);
        System.out.println("Check if the particle is the same object: " + flag);
        flag = particles.get(0).getParticleType() == particles.get(1).getParticleType();
        System.out.println("Check if the particleType is the same object: " + flag);
    }
}
