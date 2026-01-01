package Exercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.close();

        System.out.printf("Digite um numero para fazer os calculos: ");
        float numero = sc.nextFloat();

        System.out.println(numero % 2);
        System.out.println(Math.pow(numero, 3));
        System.out.println(Math.sqrt(numero));
        System.out.println(Math.cbrt(numero));
        System.out.println(Math.abs(numero));
        System.out.println(Math.sin(numero));
        System.out.println(Math.cos(numero));
        System.out.println(Math.tan(numero));



    }
}
