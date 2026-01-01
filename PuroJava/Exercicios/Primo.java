package Exercicios;

import java.util.Scanner;

public class Primo {

    static void primo(int n){
        Scanner sc = new Scanner(System.in);

        for (int k = 0; k < n; k++) {
            int num = sc.nextInt();

            int ehprimo = 0;

            for (int i = 2; i <= Math.sqrt(num); i++) {

                //flag que indica se é primo
                //caso haja divisor, soma um e da um break
                if (num % i == 0) {
                   ehprimo++;
                   break;

                }
            }

            //se a flag tiver somado, vem para essa condicao
            if (ehprimo == 1) {
                System.out.printf("%d não eh primo\n", num);

            } else {
                System.out.printf("%d eh primo\n", num);

            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        primo(n);

    }
}
