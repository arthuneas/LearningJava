package Exercicios;

import java.util.Scanner;

public class Gas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int codigo = 0;
        int gasolina = 0;
        int diesel = 0;
        int alcool = 0;

        while (codigo != 4) {
            codigo = input.nextInt();

            switch (codigo) {
                case 1 -> alcool++;

                case 2 -> gasolina++;

                case 3 -> diesel++;
            };
        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);

    }
}
