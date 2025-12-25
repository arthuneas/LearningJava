package Exercicios;

public class Inventario {
    public static void main(String[] args) {
        int pocoes = 5;

        System.out.printf("o jogador possui %d pocoes\n", pocoes);
        System.out.printf("inventário: %d pocoes", pocoes);

        System.out.println("\n-------------------------------------------\n");

        System.out.println("o jogador encontrou um baú e foi encontrado 10 pocoes");

        System.out.printf("inventário: %d pocoes\n", pocoes += 10);

        System.out.println("-------------------------------------------\n");

        System.out.println("entrou em batatha");

        System.out.println("-------------------------------------------\n");

        System.out.println("uma pocao foi usada");
        pocoes--;

        System.out.println("------------------------------------------\n");

        System.out.printf("inventário: %d pocoes", pocoes);
    }
}
