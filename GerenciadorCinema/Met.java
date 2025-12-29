package GerenciadorCinema;

import java.util.Scanner;

public class Met {

    static Scanner sc = new Scanner(System.in);


    public static boolean validCondition(int fileira, int coluna){

        boolean posicaoValida = ((fileira >= 0) && (fileira < 5)) && ((coluna >= 0) && (coluna < 10));

        if (!posicaoValida) {
            System.out.println("Digite Uma Posição Válida");
            return false;

        }
        return true;
    }


    public static int readInt(int fileira, int coluna){
        System.out.println("Digite um numero:");
        return sc.nextInt();
    }


    public static double readDouble(int fileira, int coluna){
        System.out.println("Digite um numero:");
        return sc.nextDouble();
    }
}
