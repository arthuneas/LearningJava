package TP1;

import java.util.Scanner;

public class Conta {

    private int numeroConta;
    private String nomeCliente;
    private double saldo;
    private int senha;

    public Conta(int numeroConta, String nomeCliente, double saldo, int senha) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
        this.senha = senha;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo(int senha) {
        if (this.senha == senha) {
            return saldo;
        } else {
            return -1;
        }
    }

    public boolean sacar(double valor, int senha) {
        if (this.senha == senha && valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor, int senha) {
        if (this.senha == senha && valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean transferir(double valor, int senha, Conta conta2) {
        if (this.senha == senha && valor > 0 && valor <= saldo) {
            saldo -= valor;
            conta2.saldo += valor;
            return true;
        }
        return false;
    }
}

class Banco {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // criação das contas
        int num1 = input.nextInt();
        int senha1 = input.nextInt();
        String nome1 = input.next();
        double saldo1 = input.nextDouble();

        Conta conta1 = new Conta(num1, nome1, saldo1, senha1);

        int num2 = input.nextInt();
        int senha2 = input.nextInt();
        String nome2 = input.next();
        double saldo2 = input.nextDouble();

        Conta conta2 = new Conta(num2, nome2, saldo2, senha2);

        while (true) {

            int opcao = input.nextInt();

            switch (opcao) {

                case 1: // saldo
                    int senha = input.nextInt();
                    double saldo = conta1.getSaldo(senha);

                    if (saldo == -1) {
                        System.out.println("senha incorreta");
                    } else {
                        System.out.printf("%.2f\n", saldo);
                    }
                    break;

                case 2: // saque
                    double valor = input.nextDouble();
                    senha = input.nextInt();

                    if (conta1.sacar(valor, senha))
                        System.out.println("saque realizado");
                    else
                        System.out.println("saque não realizado");
                    break;

                case 3: // depósito
                    valor = input.nextDouble();
                    senha = input.nextInt();

                    if (conta1.depositar(valor, senha))
                        System.out.println("depósito realizado");
                    else
                        System.out.println("depósito não realizado");
                    break;

                case 4: // transferência
                    String nomeDestino = input.next();

                    if (!conta2.getNomeCliente().equals(nomeDestino)) {
                        System.out.println("nenhum usuário encontrado");
                        break;
                    }

                    valor = input.nextDouble();
                    senha = input.nextInt();

                    if (conta1.transferir(valor, senha, conta2))
                        System.out.println("transferência realizada");
                    else
                        System.out.println("transferência não realizada");
                    break;

                case 5:
                    return;
            }
        }
    }
}