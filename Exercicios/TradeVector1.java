package Exercicios;

import java.util.Scanner;

public class TradeVector1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] n = new int[20];

        for (int i = 0; i < n.length; i++) {
            n[i] = input.nextInt();
        }

        for (int i = 0; i < n.length; i++) {
            System.out.printf("%d ", n[i]);
        }

        System.out.println();

        //o loop deve ir ate a metade
        //pois espelhamos um lado do outro
        for (int i = 0; i < n.length / 2; i++) {

            int temp = n[(n.length - 1) - i];
            n[(n.length - 1) - i] = n[i];
            n[i] = temp;

        }

        for (int i = 0; i < n.length; i++) {
             System.out.printf("%d ", n[i]);
        }
    }
}
