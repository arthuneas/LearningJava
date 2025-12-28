package Exercicios;

import java.util.Scanner;

public class LinhaMatriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int sum = 0;


         for (int i = 0; i < matriz.length; i++) {

             for (int j = 0; j < matriz.length; j++) {
                 matriz[i][j] = input.nextInt();
             }
         }

        for (int[] ints : matriz) {

            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%d ", ints[j]);
            }
            System.out.println();
        }
    }
}
