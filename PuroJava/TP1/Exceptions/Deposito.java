package TP1.Exceptions;

import java.util.Scanner;

class DepositoInvalidoExcpetion extends RuntimeException{
    public DepositoInvalidoExcpetion (String mensagem){
        super(mensagem);
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
        if (valor <= 0) {
            throw new DepositoInvalidoExcpetion("Erro: Valor inválido para depósito");
        }

        if (valor > getLIMITE_DEPOSITO()) {
            throw new DepositoInvalidoExcpetion("Erro: Valor acima do limite permitido de 10000.00");
        }

        this.saldo = this.saldo + valor;
        System.out.println("Depósito realizado com sucesso.");
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

        entrada.close();

        boolean flag = false;

        try {
            conta.depositoPersonalizado(valor);
            flag = true;

        } catch (DepositoInvalidoExcpetion e) {
            System.out.println(e.getMessage());

        } finally {
            if (flag) {
                System.out.printf("Valor %.2f depositado na conta. Novo saldo: %.2f", valor, conta.getSaldo());

            } else {
                System.out.printf("Valor %.2f incorreto. Saldo atual: %.2f", valor, conta.getSaldo());
            }


        }
    }
}
