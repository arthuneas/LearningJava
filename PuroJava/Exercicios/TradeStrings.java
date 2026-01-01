package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class TradeStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String nome = input.nextLine();

        char[] n = nome.toCharArray();

        //o loop deve ir ate a metade
        //pois espelhamos um lado do outro
        for (int i = 0; i < n.length / 2; i++) {

            char temp = n[(n.length - 1) - i];
            n[(n.length - 1) - i] = n[i];
            n[i] = temp;

        }

        input.close();

        System.out.println(n);


    }
}
