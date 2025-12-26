package Exercicios;

import java.util.Scanner;

public class Lanche {

    public static void total(double preco, int qtd) {
        double total;

        total = preco * qtd;
        System.out.printf("Total:R$ %.2f", total);
        
    }

    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        int codigo, qtd;
        double preco = 0.0;

        codigo = sc.nextInt();
        qtd = sc.nextInt();

        sc.close();

        switch (codigo) {
            case 1:
                preco = 4.00;
                break;

            case 2:
                preco = 4.5;
                break;

            case 3:
                preco = 5;
                break;

            case 4:
                preco = 2;
                break;

            case 5:
                preco = 1.5;
                break;
        }
        
        total(preco, qtd);

    }
}
