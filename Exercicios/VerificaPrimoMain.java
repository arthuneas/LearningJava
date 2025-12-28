package Exercicios;

import java.util.Scanner;

public class VerificaPrimoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String primo = (VerificaPrimoMetodo.primo(n) ? "eh primo" : "nao eh primo");

        System.out.printf("%d %s", n, primo);
    }
}
