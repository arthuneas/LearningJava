package Exercicios;

import java.util.Scanner;

public class BhaskaraValidation {
    public static void main(String[] args) {
        //ax^2 + bx + c = 0
        double a, b, c, delta;
        boolean isValid;

        Scanner input = new Scanner(System.in);

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        isValid = (a != 0) && (delta >= 0);

        System.out.println(isValid);

    }
}
