package Exercicios.GerenciadorCinema;

import java.util.Arrays;

public class Menu {

    public static int[][] matrizSala() {
        int[][] sala = new int[5][10];

        for (int[] sala1 : sala) {
            Arrays.fill(sala1, 0);
        }

        return sala;
    }


    public static void printMenu(){

        System.out.println("\n=== MENU CINEMA ===");
        System.out.println("1. Mostrar Sala");
        System.out.println("2. Vender ingresso");
        System.out.println("3. Cancelar Ingresso");
        System.out.println("4. Relatório Financeiro");
        System.out.println("5. Sair");
        System.out.print("Escolha: ");

    }


    public static void chooseMenu(int opcao, int[][] sala){

        switch (opcao) {
            case 1 -> Opcao.mostrarSala(sala);

            case 2 -> Opcao.venderIngresso(sala);

            case 3 -> Opcao.cancelarIngresso(sala);

            case 4 -> Opcao.relatorio(sala);

            case 5 -> System.exit(0);

            default -> throw new IllegalStateException("Unexpected value: " + opcao);
        }

    }

}
