package Exercicios;

import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite o valor do bilhete: ");
        int bilhete = sc.nextInt();

        boolean ehPar = bilhete % 2 == 0;

        System.out.println("o valor do bilhete ser par é: " + ehPar);

    }
}
