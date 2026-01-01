package Exercicios;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o Valor do Raio da Esfera: ");
        double raio = sc.nextDouble();

        double volume = (4.0/3.0 * Math.PI * Math.pow(raio, 3));

        System.out.printf("VOLUME = %.3f", volume);

        sc.close();
    }
}
