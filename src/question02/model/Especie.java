package question02.model;

public class Especie implements ET{
    private String name;
    private String originalPlanet;
    private int baseDangerLevel;

    public Especie(){}
    public Especie(String name, String originalPlanet, int dangerLevel) {
        this.name = name;
        this.originalPlanet = originalPlanet;
        this.baseDangerLevel = dangerLevel;
    }

    public String getOriginalPlanet() {
        return originalPlanet;
    }

    public void setOriginalPlanet(String originalPlanet) {
        this.originalPlanet = originalPlanet;
    }

    public int getDangerLevel() {
        return baseDangerLevel;
    }

    public void setDangerLevel(int dangerLevel) {
        this.baseDangerLevel = dangerLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void walk() {

    }

    @Override
    public void run() {

    }

    @Override
    public String toString() {
        return "Especie{" +
                "name='" + name + '\'' +
                ", originalPlanet='" + originalPlanet + '\'' +
                ", baseDangerLevel=" + baseDangerLevel +
                '}';
    }
}
