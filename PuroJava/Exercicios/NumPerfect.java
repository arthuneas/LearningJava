package Exercicios;

import java.util.Scanner;

public class NumPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de testes: ");
        int testes = sc.nextInt();

        for (int k = 1; k <= testes; k++) {

            System.out.print("Digite um numero: ");
            int n = sc.nextInt();

            int sum = 0;

            for (int i = 1; i <= n / 2; i++) {

                if (n % i == 0) {

                    sum += i;

                }
            }

            if (sum == n) {
                System.out.println(n + " eh perfeito");
            } else {
                System.out.println(n + " nao eh perfeito");
            }
        }

        sc.close();
    }
}
