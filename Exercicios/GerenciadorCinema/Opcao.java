package Exercicios.GerenciadorCinema;

public class Opcao {

    public static void mostrarSala(int[][] sala){
        Met.clearScreen();
        System.out.println("\n---------------------------------------");
        System.out.println("     ======================");
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

        System.out.println("---------------------------------------");
        System.out.println();

    }


    public static void venderIngresso(int[][] sala){
        Met.clearScreen();
        System.out.println("\n\n - - - - - - Vendendo ingresso - - - - - - - >\n");
        System.out.println("- - - - - - - PRECO INGRESSOS - - - - - - - -");
        System.out.println("Fileiras [0, 1, 2] - - - - - - R$ 20,00 Reais");
        System.out.println("Fileiras [3, 4] - - - - - - - -R$ 40,00 Reais");
        System.out.println();

        System.out.print("Digite a Fileira da Cadeira Desejada: ");
        int fileira = Met.readInt();

        System.out.print("Digite a Coluna da Cadeira Desejada: ");
        int coluna = Met.readInt();

        if (!Met.validCondition(fileira, coluna)){
            return;
        }

        if (sala[fileira][coluna] == 1) {
            System.out.println("Essa Cadeira Está Ocupada.");
            System.out.println("Selecione Uma Opção Disponivel!");

        } else if (sala[fileira][coluna] == 0) {

            System.out.printf("A Cadeira [%d][%d] Foi Selecionada!\n\n", fileira, coluna);
            sala[fileira][coluna] = 1;

        }

    }


    public static void cancelarIngresso(int[][] sala){
        Met.clearScreen();
        System.out.println("\n- - - Cancelando ingresso - - ->");

        System.out.print("Digite a Fileira da Cadeira: ");
        int fileira = Met.readInt();

        System.out.print("Digite a Coluna da Cadeira: ");
        int coluna = Met.readInt();

        if (!Met.validCondition(fileira, coluna)){
            return;

        }

        if (sala[fileira][coluna] == 1) {
            sala[fileira][coluna] = 0;
            System.out.println("Ingresso Cancelado!");
            System.out.printf("A Cadeira [%d][%d] Foi Desocupada!\n",  fileira, coluna);

        } else if (sala[fileira][coluna] == 0) {
            System.out.printf("A Cadeira [%d][%d] Está Vazia!\n", fileira, coluna);
            System.out.println("Selecione Uma Cadeira Válida");

        }

    }


    public static void relatorio(int[][] sala){
        Met.clearScreen();

        Met.gerenciamentoFinal(sala);

    }

}
