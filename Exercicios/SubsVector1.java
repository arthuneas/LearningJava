package Exercicios;

import java.util.Scanner;

public class SubsVector1 {
    public static void main(String[] args) {

        int[] x = new int[10];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < x.length; i++){
            x[i] = input.nextInt();

            if (x[i] <= 0) {
                x[i] = 1;
            }
        }

        for (int i = 0; i < x.length; i++){
            System.out.printf("x[%d] = %d\n", i, x[i]);
        }

    }
}
