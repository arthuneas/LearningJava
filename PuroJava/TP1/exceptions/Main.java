package TP1.exceptions;

import java.util.Scanner;

class Funcionario {

    private String nomeFuncionario;
    private int qtdeProducao;
    private int horasTrabalhadas;

    public Funcionario(String nomeFuncionario, int qtdeProducao, int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.qtdeProducao = qtdeProducao;
        this.nomeFuncionario = nomeFuncionario;
    }


    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public int getQtdeProducao() {
        return qtdeProducao;
    }

    public void setQtdeProducao(int qtdeProducao) {
        this.qtdeProducao = qtdeProducao;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularProdutividade(){
        return getQtdeProducao() / getHorasTrabalhadas();
   }

}

public class Main {
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in);

            String nome = entrada.nextLine();
            int producao = entrada.nextInt();
            int horas = entrada.nextInt();

            Funcionario funcionario = new Funcionario(nome, producao, horas);
            double produtividade = funcionario.calcularProdutividade();

            System.out.printf("Produtividade: %.0f peças por hora%n", produtividade);

        } catch (ArithmeticException e) {
            System.out.println("Erro: horas trabalhadas não podem ser zero.");

        } catch (Exception e) {
            System.out.println("Erro inesperado");
        }
    }
}
