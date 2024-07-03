package question02.controller;

import question02.model.Alien;
import question02.model.Especie;

import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {
    private List<Alien> aliens;
    private List<Especie> especies;
    private List<Alien> quarentine;
    public ManagementSystem() {
        aliens = new ArrayList<>();
        especies = new ArrayList<>();
        quarentine = new ArrayList<>();
    }

    public void createAlien(Alien alien){
        getAliens().add(alien);
        verifyIfEspecieExists(alien.getEspecie());
        verifyDangerousness(alien);
    }

    private void createEspecie(Especie especie){
        getEspecies().add(especie);
    }

    public void verifyIfEspecieExists(Especie especie){
        if (!getEspecies().contains(especie)) createEspecie(especie);
    }

    private void addToQuarentine(Alien alien){
        getQuarentine().add(alien);
    }

    public void verifyDangerousness(Alien alien){
        if (alien.getDangerLevel() > 7 && !getQuarentine().contains(alien)){
            addToQuarentine(alien);
        }
    }

    public List<Alien> getAliens() {
        return aliens;
    }

    public List<Especie> getEspecies() {
        return especies;
    }

    public List<Alien> getQuarentine() {
        return quarentine;
    }
}
