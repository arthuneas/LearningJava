package Exercicios;

import java.util.Scanner;

public class Lab {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int registro = sc.nextInt();
        int total = 0;
        int ratos = 0;
        int coelhos = 0;
        int sapos = 0;

        for (int i = 0; i < registro; i++){

            System.out.print("quantos animais: ");
            int qtdAnimal = sc.nextInt();

            System.out.print("qual tipo: ");
            char tipo = sc.next().charAt(0);

            switch (tipo){
                case 'C', 'c':
                    total += qtdAnimal;
                    coelhos += qtdAnimal;
                    break;

                case 'R', 'r':
                    total += qtdAnimal;
                    ratos += qtdAnimal;
                    break;

               case 'S', 's':
                   total += qtdAnimal;
                   sapos += qtdAnimal;
                   break;
            }

        }

        sc.close();

        double Pcoelho = (double) coelhos / total * 100;
        double Psapos = (double) sapos / total * 100;
        double Pratos = (double) ratos / total * 100;

        System.out.printf("Total: %d\n",  total);

        System.out.printf("Total de coelhos: %d\n",  coelhos);
        System.out.printf("Total de ratos: %d\n",  ratos);
        System.out.printf("Total de sapos: %d\n",  sapos);

        System.out.printf("Porcentagem de coelhos: %.2f %\n", Pcoelho);
        System.out.printf("Porcentagem de ratos: %.2f %\n", Pratos);
        System.out.printf("Porcentagem de sapos: %.2f %\n", Psapos);
    }
}
