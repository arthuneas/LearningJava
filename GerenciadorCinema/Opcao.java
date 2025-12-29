package GerenciadorCinema;

import java.util.Arrays;

public class Opcao {

    public static void mostrarSala(int[][] sala){
        System.out.println("\n     ======================");
        System.out.println("     === TELA DO CINEMA ===\n");

        System.out.print(" ");

        for (int k = 0; k < 10; k++){
            System.out.print("  " + k);
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", i);

            for (int j = 0; j < 10; j++) {

                if (sala[i][j] == 0) {
                    System.out.print("[ ]");
                } else {
                    System.out.print("[X]");
                }
            }

            System.out.println();
        }

    }


    public static void venderIngresso(int[][] sala, int fileira, int coluna){
        System.out.println(" - - - Vendendo ingresso - - ->");

        Met.validCondition(fileira, coluna);

        if (sala[fileira][coluna] == 1) {
            System.out.println("Essa Cadeira Está Ocupada.");
            System.out.println("Selecione Uma Opção Disponivel!");
            return;

        } else if (sala[fileira][coluna] == 0) {
            System.out.printf("A Cadeira [%d][%d] Foi Selecionada!\n", fileira, coluna);
            sala[fileira][coluna] = 1;

        }

    }


    public static void cancelarIngresso(int[][] sala, int fileira, int coluna){
        System.out.println("- - - Cancelando ingresso - - ->");

        if (!Met.validCondition(fileira, coluna)){
            return;

        } else if (sala[fileira][coluna] == 1) {
            sala[fileira][coluna] = 0;
            System.out.println("Ingresso Cancelado!");
            System.out.printf("A Cadeira [%d][%d] Foi Desocupada!\n",  fileira, coluna);

        } else if (sala[fileira][coluna] == 0) {
            System.out.printf("A Cadeira [%d][%d] Está Vazia!\n", fileira, coluna);
            System.out.println("Selecione Uma Cadeira Válida");
            return;

        }

    }


    public static void relatorio(int[][] sala){
        System.out.println("- - - Relatorio Fincanceiro - - ->");
        System.out.println();
        System.out.println("- - - - - - - PRECO INGRESSOS - - - - - - - -");
        System.out.println("Fileiras [0, 1, 2] - - - - - - R$ 20,00 Reais");
        System.out.println("Fileiras [3, 4] - - - - - - - -R$ 40,00 Reais");
        System.out.println();

        Met.gerenciamentoFinal(sala);

    }



    public static void main(String[] args) {

        int[][] sala = new int[5][10];

        //sala.length = 5
        //preenche a linha
        for (int i = 0; i < sala.length; i++){
            Arrays.fill(sala[i], 0);
        }


        mostrarSala(sala);
    }

}
