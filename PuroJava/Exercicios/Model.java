package Exercicios;

import java.util.Scanner;

public class Model {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int m = sc.nextInt();
            int n = sc.nextInt();

            if (m <= 0 || n <= 0) {
                break;
            }

            if (m > n) {
                int temp = m;
                m = n;
                n = temp;
            }

            int sum = 0;

            for (int i = m; i <= n; i++) {
                System.out.printf("%d ", i);
                sum += i;
            }

            System.out.println("Sum=" + sum);
        }

    }
}