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


    public static void venderIngresso(){
        System.out.println("Vendendo ingresso");
    }


    public static void cancelarIngresso(){
        System.out.println("Cancelando ingresso");
    }


    public static void relatorio(){
        System.out.println("Relatorio");
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
