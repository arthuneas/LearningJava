package TP1.Intro;

import java.util.Scanner;

public class Corretor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine();

        String[] nomes = new String[n + 1];

        for (int i = 0; i < n; i++) {
            nomes[i] = input.nextLine();  ;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(nomes[i]);
        }

        nomes[n] = input.nextLine();
        System.out.println(nomes[n]);

        input.close();


        for (int i = 0; i <= n; i++){
            if (nomes[i].length() == nomes[n].length()) {

            }
        }
    }
}
