package Exercicios;

import java.util.Scanner;

public class LatasTinta {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double altura = sc.nextDouble();
        double largura = sc.nextDouble();

        double qtdLatas = Math.ceil(altura * largura / 10);

        //1 lata de 5l -> 10m

        System.out.printf("Latas necessarias: %.0f", qtdLatas);

        sc.close();

    }
}
