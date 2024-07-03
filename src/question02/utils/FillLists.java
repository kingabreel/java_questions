package question02.utils;

import question02.controller.ManagementSystem;
import question02.model.Alien;
import question02.model.Especie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FillLists {
    private ManagementSystem system;
    public FillLists(ManagementSystem s){
        this.system = s;
        addAliens();
    }

    private void addAliens(){
        List<Alien> aliens = new ArrayList<>();

        aliens.add(new Alien(0L, "Metadado", new Especie("cac", "Menthos", 5), LocalDate.now(),6 ));
        aliens.add(new Alien(1L, "Asas", new Especie("cac", "Menthos", 5), LocalDate.now().minusMonths(10), 2));
        aliens.add(new Alien(2L, "Vector", new Especie("flames", "Sun", 10), LocalDate.now().minusMonths(5), 9));
        aliens.add(new Alien(3L, "Gib", new Especie("hybrid", "Earth", 1), LocalDate.now().minusMonths(3), 3));
        aliens.add(new Alien(4L, "Siel", new Especie("lien", "Mars", 6), LocalDate.now().minusYears(3), 5));
        aliens.add(new Alien(5L, "Hec", new Especie("lyzard", "Mars", 6), LocalDate.now().minusMonths(15), 8));
        aliens.add(new Alien(6L, "nic", new Especie("tiga", "Mond", 8), LocalDate.now().minusYears(2), 7));
        aliens.add(new Alien(7L, "velasos", new Especie("plant", "Vertit", 4), LocalDate.now(), 4));
        aliens.add(new Alien(8L, "spector", new Especie("spectro", "Menthos", 5), LocalDate.now().minusWeeks(10), 5));

        aliens.forEach(alien -> system.createAlien(alien));
    }
}
