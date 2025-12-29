package GerenciadorCinema;

import java.util.Arrays;

public class Menu {

    public static int[][] matrizSala(){
        int[][] sala = new int[5][10];

        for (int i = 0; i < sala.length; i++){
            Arrays.fill(sala[i], 0);
        }

        return sala;
    }


    public static void printMenu(){

        System.out.println("=== MENU CINEMA ===");
        System.out.println("1. Mostrar Sala");
        System.out.println("2. Vender ingresso");
        System.out.println("3. Cancelar Ingresso");
        System.out.println("4. Relatório Financeiro");
        System.out.println("5. Sair");
        System.out.print("Escolha: ");

    }


    public static void chooseMenu(int opcao, int[][] sala){

        switch (opcao) {
            case 1:
                Opcao.mostrarSala(sala);
                break;

            case 2:
                Opcao.venderIngresso(sala);
                break;

            case 3:
                Opcao.cancelarIngresso(sala);
                break;

            case 4:
                Opcao.relatorio(sala);
                break;

            case 5:
                System.exit(0);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + opcao);
        }

    }

}
