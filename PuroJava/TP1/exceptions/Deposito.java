package TP1.exceptions;

import java.util.Scanner;

class DepositoInvalidoExcpetion extends RuntimeException{
    public DepositoInvalidoExcpetion (String mensagem){

    }
}

//Classe Conta
class Conta {

    private int agencia;
    private int numero;
    private double saldo;
    private double LIMITE_DEPOSITO;

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        this.LIMITE_DEPOSITO = 10000;
    }

    public void depositoPersonalizado(double valor){

    }

    public double getSaldo() {
        return saldo;
    }

    public double getLIMITE_DEPOSITO() {
        return LIMITE_DEPOSITO;
    }
}

public class Deposito {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int agencia = entrada.nextInt();
        int numero = entrada.nextInt();
        double valor = entrada.nextDouble();

        Conta conta = new Conta(agencia, numero);
        conta.depositoPersonalizado(valor);

        entrada.close();
    }
}
