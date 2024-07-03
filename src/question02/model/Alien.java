package question02.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Alien implements ET{
    private Long id;
    private String name;
    private Especie especie;
    private int dangerLevel;
    private LocalDate entranceDetected;

    public Alien(){}
    public Alien(Long id, String name, Especie especie, LocalDate entranceDetected, int dangerLevel) {
        this.id = id;
        this.name = name;
        this.especie = especie;
        this.entranceDetected = entranceDetected;
        this.dangerLevel = dangerLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public LocalDate getEntranceDetected() {
        return entranceDetected;
    }

    public void setEntranceDetected(LocalDate entranceDetected) {
        this.entranceDetected = entranceDetected;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    public void setDangerLevel(int dangerLevel) {
        this.dangerLevel = dangerLevel;
    }

    @Override
    public void walk() {

    }

    @Override
    public void run() {

    }

    @Override
    public String toString() {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        return "Alien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", especie=" + especie +
                ", dangerLevel=" + dangerLevel +
                ", entranceDetected=" + entranceDetected.format(dt) +
                '}';
    }
}
