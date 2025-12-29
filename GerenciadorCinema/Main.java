package GerenciadorCinema;

import java.util.Scanner;

public class Main {

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


    public static void chooseMenu(int opcao){

        printMenu();

        switch (opcao) {
            //case 1 -> Opcao.mostrarSala();

            case 2 -> Opcao.venderIngresso();

            case 3 -> Opcao.cancelarIngresso();

            case 4 -> Opcao.relatorio();

            case 5 -> System.exit(0);

            default -> throw new IllegalStateException("Unexpected value: " + opcao);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true){

            //printa o menu
            printMenu();
            int opcao = sc.nextInt();

            //logica das opcoes
            chooseMenu(opcao);


        }


    }


}
