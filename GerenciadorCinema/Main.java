package GerenciadorCinema;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void clearScreen() {
        try {

            String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void printMenu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MENU CINEMA ===");
        System.out.println("1. Mostrar Sala");
        System.out.println("2. Vender ingresso");
        System.out.println("3. Cancelar Ingresso");
        System.out.println("4. Relatório Financeiro");
        System.out.println("5. Sair");
        System.out.print("Escolha: ");

    }


    public static void chooseMenu(int opcao, int[][] sala){

        printMenu();


        switch (opcao) {
            case 1:
                clearScreen();
                Opcao.mostrarSala(sala);
                break;

            //case 2 -> Opcao.venderIngresso(sala);

            //case 3 -> Opcao.cancelarIngresso(sala);

            case 4:
                Opcao.relatorio(sala);
                clearScreen();
                break;

            case 5:
                System.exit(0);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + opcao);
        }


    }


    public static void main(String[] args) {

        //inicializa a matriz com 0
        int[][] sala = new int[5][10];

        for (int i = 0; i < sala.length; i++){
            Arrays.fill(sala[i], 0);
        }

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 5){

            //printa o menu
            printMenu();
            opcao = sc.nextInt();
            clearScreen();

            //logica das opcoes
            chooseMenu(opcao, sala);

        }
    }
}
