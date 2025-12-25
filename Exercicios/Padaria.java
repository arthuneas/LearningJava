package Exercicios;

import java.util.Scanner;

public class Padaria {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a quantidade de paes: ");
        int quantidade = ler.nextInt();

        float breadprice = 0.4f;

        float total = breadprice * quantidade;

        System.out.printf("o total a pagar é %.2f", total);



    }
}
