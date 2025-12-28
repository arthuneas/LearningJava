package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ValuePosition {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanho = input.nextInt();

        int[] vetor = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = input.nextInt();
        }


        int posicao = 0;
        int min = Arrays.stream(vetor).min().getAsInt();

        for (int i = 0; i < tamanho; i++) {

            if (vetor[i] == min) {
                posicao = i;
                break;
            }
        }


        System.out.println("Menor Valor: " + min);
        System.out.println("Posicao: " + posicao);

    }
}
