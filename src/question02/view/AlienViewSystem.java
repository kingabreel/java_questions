package question02.view;

import question02.controller.ManagementSystem;
import question02.model.Alien;
import question02.model.Especie;
import question02.utils.FillLists;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AlienViewSystem {
    private ManagementSystem system;
    private Scanner scanner;
    public AlienViewSystem(){
        system = new ManagementSystem();
        scanner = new Scanner(System.in);
        new FillLists(system);
        System.out.println("Bem vindo!");
        while (true){
            menu();
        }
    }

    private void menu(){
        System.out.println("""
                
                1- Novo alien detectado
                2- Pesquisar aliens por planetas
                3- Pesquisar alieniginas por periculosidade
                4- Pesquisar alieníginas por espécie
                5- Verificar alieníginas em quarentena
                6- Verificar todos os alieniginas cadastrados
                7- Verificar todas as espécies cadastradas
                8- Verificar todos os alieníginas detectados nos ultimos 6 meses
                
                0- Sair""");

        int escolha = -1;

        while (escolha < 0 || escolha > 9){
            try {
                escolha = scanner.nextInt();
            } catch (IllegalArgumentException e){
                throw new RuntimeException("Inválido");
            }

            if (escolha == 0){
                System.out.println("Finalizando programa");
                System.exit(0);
            }
        }

        switch (escolha){
            case 1 -> {
                scanner.nextLine();
                Alien alien = new Alien();
                System.out.print("Nome do alien: ");
                String nome = scanner.nextLine();
                alien.setName(nome);

                Especie especie = new Especie();
                System.out.print("Nome da especie: ");
                String nomeEspecie = scanner.nextLine();
                especie.setName(nomeEspecie);

                System.out.print("Planeta origem: ");
                String planeta = scanner.nextLine();
                especie.setOriginalPlanet(planeta);

                System.out.println("Nível médio de periculosidade da especie: 1-10");
                int periculosidadePlaneta = 0;
                while (periculosidadePlaneta < 1 || periculosidadePlaneta > 10){
                    periculosidadePlaneta = scanner.nextInt();
                }
                especie.setDangerLevel(periculosidadePlaneta);

                alien.setEspecie(especie);

                alien.setEntranceDetected(LocalDate.now());

                alien.setId((long) system.getAliens().size());

                system.createAlien(alien);
                System.out.println("Alien Cadastrado com sucesso:");
                System.out.println(alien);
            }
            case 2 -> {
                scanner.nextLine();
                System.out.println("Qual o nome do planeta: ");
                String planeta = scanner.nextLine();

                system.getAliens().forEach(alien -> {
                    if (alien.getEspecie().getOriginalPlanet().equalsIgnoreCase(planeta)) {
                        System.out.println(alien);
                        System.out.println(alien.getEspecie());
                    }
                });
            }
            case 3 -> {
                System.out.println("Nível de periculosidade: 1-10");
                int periculosidade = 0;
                while (periculosidade < 1 || periculosidade > 10){
                    periculosidade = scanner.nextInt();
                }

                int finalPericulosidade = periculosidade;
                system.getAliens().forEach(alien -> {
                    if (alien.getDangerLevel() >= finalPericulosidade) {
                        System.out.println(alien);
                    }
                });
            }
            case 4 -> {
                scanner.nextLine();
                System.out.println("Nome da espécie: ");
                String especie = scanner.nextLine();

                system.getAliens().forEach(alien -> {
                    if (alien.getEspecie().getName().equalsIgnoreCase(especie)) System.out.println(alien);
                });
            }
            case 5 -> {
                System.out.println("Alieniginas em quarentena: ");
                system.getQuarentine().forEach(System.out::println);
            }
            case 6 -> {
                System.out.println("Lista de aliens cadastrados: ");
                system.getAliens().forEach(System.out::println);
            }
            case 7 -> {
                System.out.println("Lista de espécies cadastradas: ");
                system.getEspecies().forEach(System.out::println);
            }
            case 8 -> {
                System.out.println("Aliens dos ultimos 6 meses");
                system.getAliens().forEach(alien -> {
                    if (alien.getEntranceDetected().isAfter(LocalDate.now().minusMonths(6))) System.out.println(alien);
                });
            }
        }
    }

}
