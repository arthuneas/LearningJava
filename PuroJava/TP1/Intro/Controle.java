package TP1.Intro;

import java.util.Scanner;

public class Controle {

    public void resultado() {

        char sexo = 0;
        int quantidadeMulheres = 0;
        int quantidadeHomens = 0;

        Scanner scanner = new Scanner(System.in);

        while (sexo != 'q') {
            sexo = scanner.next().charAt(0);

            if (sexo == 'm') {
                quantidadeMulheres++;

            } else if (sexo == 'h') {
                quantidadeHomens++;

            }

        }

        scanner.close();

        float precoMulheres = 7.4f * quantidadeMulheres;
        float precoHomens = 12.5f * quantidadeHomens;
        float total = precoMulheres + precoHomens;

        System.out.println(quantidadeHomens + " " + quantidadeMulheres);
        System.out.printf("%.2f %.2f %.2f\n", precoHomens, precoMulheres, total);
    }


    public static void main(String[] args) {
        Controle controle = new Controle();
        controle.resultado();
    }

}
