package Exercicios;

import java.util.Scanner;

public class LinhaMatriz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int linha = input.nextInt();
        char modo = input.next().charAt(0);

        double[][] matriz = new double[12][12];

        //leitura dos elementos da matriz
         for (int i = 0; i < matriz.length; i++) {

             for (int j = 0; j < matriz.length; j++) {
                 matriz[i][j] = input.nextDouble();
             }
         }

        //ler a linha desejada de 0 a n

        double sum = 0;
        double result = 0;

        //soma a linha desejada
        for (int j = 0; j < matriz.length; j++) {

            sum += matriz[linha][j];

        }

        //condicao de calculo
        if (modo == 'M') {

            result = sum / matriz.length;

        } else if (modo == 'S') {
            result = sum;

        }

        System.out.printf("\no resultado é %.1f\n", result);

        input.close();
    }
}
