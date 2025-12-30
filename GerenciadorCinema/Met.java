package GerenciadorCinema;

import java.io.IOException;
import java.util.Scanner;

public class Met {

    static Scanner sc = new Scanner(System.in);


    public static void clearScreen() {
        try {

            String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();

            }

        } catch (IOException | InterruptedException e) {
        }
    }


    public static boolean validCondition(int fileira, int coluna){

        boolean posicaoValida = ((fileira >= 0) && (fileira < 5)) && ((coluna >= 0) && (coluna < 10));

        Met.clearScreen();

        if (!posicaoValida) {
            System.out.println("Posição Invalida.");
            System.out.println("Digite Uma Posição Válida!\n");
            return false;

        }
        return true;
    }


    public static void gerenciamentoFinal(int[][] sala){
        int totalVinte = 0;
        int totalQuarenta = 0;
        int totalIngressos = 0;

        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[0].length; j++) {
                if (sala[i][j] == 1){
                    totalIngressos++;

                    if (i <= 2) {
                        totalVinte++;

                    } else {
                        totalQuarenta++;
                    }
                }
            }
        }

        int precoVinte = 20 * totalVinte;
        int precoQuarenta = 40 * totalQuarenta;
        int precoTotal = precoVinte + precoQuarenta;


        System.out.println("- - - - - Relatorio Gerencial e Financeiro - - - - - >\n");
        System.out.println("===================== Faturamento ======================");
        System.out.println("Faturamento dos Ingressos VIP: " + precoQuarenta);
        System.out.println("Faturamento dos Ingressos Tradicionais: " + precoVinte);
        System.out.println("- - - -");
        System.out.println("Faturamento Total: " + precoTotal);

        System.out.println();

        System.out.println("===================== Quantitativos ======================");
        System.out.println("Total de Ingressos da Fileira Tradicional: " + totalVinte);
        System.out.println("Total de Ingressos da Fileira VIP: " + totalQuarenta);
        System.out.println("- - - - ");
        System.out.println("Total de Ingressos Vendidos: " + totalIngressos);
        System.out.println();

    }


    public static int readInt(){
        return sc.nextInt();
    }

}
