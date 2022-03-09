package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class ParticleTypeFactory {
    private static final Map<String, ParticleType> particleTypeMap = new HashMap<>();
    public static ParticleType getParticleTpe(String name, String color,String sprite){
        ParticleType particleType = particleTypeMap.get(name);
        if (particleType == null){
            particleType = new ParticleType(name,color,sprite);
            particleTypeMap.put(name, particleType);
        }
        return particleType;
    }
}
