package JavaBasico;

import java.util.Scanner;

public class ERepeticao2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int i = 0;

        //odeio do while
        do {
            System.out.print(" " + i);

          i++;
        } while (i <= n);

        System.out.println("\n=====================================");

        int n1;
        int sum = 0;
        String resp;

        do {
            n1 = sc.nextInt();
            sum += n1;

            System.out.print("\ndo u wanna continue [STOP]: ");
            resp = sc.next();

        } while (resp.equals("STOP"));

        sc.close();

        System.out.println("a soma final ficou de " + sum);
    }
}
