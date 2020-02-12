package hu.me.krz.haladojava;

import java.util.List;
import java.util.Random;

public class Astronomer {

    private final String name;
    private List<Planet> planetList;
    
    public Astronomer(String name) {
        this.name = name;
    }
    
    public List<Planet> getDiscoveredPlanets() {
        return this.planetList;
    }
    
    public void observeTheSky() {
        for (int i = 0; i < 10; i++) {
            Random randomRadius = new Random();
            new Planet(new Point(i, 0, 0), randomRadius.nextInt(), this.name + i);
        }
    }

    @Override
    public String toString() {
        return "Astronomer [name=" + name + ", planetList=" + planetList + "]";
    }
    
}
