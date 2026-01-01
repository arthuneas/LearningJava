package Exercicios;

import java.util.Scanner;

public class Heron {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double sp = (a + b + c) / 2;

        double area = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));

        System.out.printf("Area = %.4f", area);

        sc.close();
    }
}
