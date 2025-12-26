package Exercicios;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        
        int inicio, fim, total;

        total = 0;

        
        Scanner sc = new Scanner(System.in);

        inicio = sc.nextInt();
        fim = sc.nextInt();

        sc.close();

        if (inicio == fim) {
            total = 24;
        
        } else if (inicio < fim) {
            total = fim - inicio;
            
        } else {
            total = 24 - inicio + fim;

        }

        System.out.printf("O JOGO DUROU %d HORA(S)", total);

    }
}
