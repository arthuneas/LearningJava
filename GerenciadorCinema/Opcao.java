package GerenciadorCinema;

public class Opcao {

    public static void mostrarSala(int[][] sala){
        System.out.println("\n=== TELA DO CINEMA ===");

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


    public static void relatorio(){
        System.out.println("- - - Relatorio Fincanceiro - - ->");
        System.out.println();
        System.out.println("");


    }



    public static void main(String[] args) {

        int[][] sala = {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0}
        };

        mostrarSala(sala);
    }

}
