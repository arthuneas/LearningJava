package Exercicios;

import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int MaiorABC = (c + maiorAB + Math.abs(c - maiorAB)) / 2;

        System.out.println(MaiorABC + " eh o maior valor");

        sc.close();
    }
}
