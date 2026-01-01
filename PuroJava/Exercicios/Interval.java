package Exercicios;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {

        int in = 0;
        int out = 0;

        //conferir quantos numeros do for estao no intervalo [10, 20]
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int numero = sc.nextInt();

            if (numero >= 10 && numero <= 20) {
                in++;

            } else {
                out++;

            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

    }
}
