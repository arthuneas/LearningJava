package Exercicios;

import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite a nota 1: ");
        int nota1 = sc.nextInt();

        System.out.print("digite a nota 2: ");
        int nota2 = sc.nextInt();

        /*
        //maneira de casting
        float notaum = (float) nota1;
        float notadois = (float) nota2;

        //outra maneira de casting
        float notaum = nota1;
        float notadois = nota2;
         */

        //fazendo o casting no calculo, sem variaveis extras
        float media = (float) (nota1 + nota2) / 2;

        System.out.printf("a nota final é: %.2f", media);

        sc.close();

    }
}
