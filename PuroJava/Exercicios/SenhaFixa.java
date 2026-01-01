package Exercicios;

import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        //senha = 2002

        Scanner input = new Scanner(System.in);
        int senha = 0;

        while (senha != 2002) {
            senha = input.nextInt();

            if (senha != 2002) {
                System.out.println("Senha Invalida");
            }
        }

        System.out.println("Acesso Permitido");
    }
}
