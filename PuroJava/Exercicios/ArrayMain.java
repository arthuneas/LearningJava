package Exercicios;

import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamanho = sc.nextInt();
        int[] n = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            n[i] = sc.nextInt();
        }

        System.out.printf("%d\n", ArrayMetodo.maiorValor(n));
        System.out.printf("%d\n", ArrayMetodo.posicao(n));


    }
}
