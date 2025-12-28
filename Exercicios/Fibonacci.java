package Exercicios;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int proximo = a + b;

            a = b;
            b = proximo;

        }
    }
}