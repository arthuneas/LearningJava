package Exercicios;

import java.util.Scanner;

public class Triangulo {
    static void main() {

        Scanner input = new Scanner(System.in);
        double a, b, c;
        boolean ehTriangulo;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        ehTriangulo = a < (b + c) && b < (a + c) && c < (a + b);

        System.out.println(ehTriangulo);


    }
}
