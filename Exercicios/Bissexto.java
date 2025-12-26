package Exercicios;

import java.util.Scanner;

public class Bissexto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean bissexto;
        int ano;

        ano = input.nextInt();

        bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        System.out.println(bissexto);

        input.close();
    }
}
