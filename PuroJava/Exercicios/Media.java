package Exercicios;

import java.util.Scanner;

public class Media {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();

        for (int i = 0; i < n; i++) {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double media = (2 * n1 + n2 * 3 + n3 * 5) / 10;

            System.out.println(media);
        }
    }
}
