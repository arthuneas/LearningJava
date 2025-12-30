package Exercicios;

public class Aluno {

    String nome;
    double nota1;
    double nota2;

    public double calcularNota() {
        return (this.nota1 + this.nota2) / 2;
    }

    public boolean verificarAprovacao() {
        return calcularNota() >= 5;
    }

    public void status() {
        String aprovado = verificarAprovacao() ? "Aprovado" : "Reprovado";

        System.out.println();
        System.out.println("Aluno: " + this.nome);
        System.out.println("Nota 1: " + this.nota1);
        System.out.println("Nota 2: " + this.nota2);
        System.out.println("Media Final: " + calcularNota());
        System.out.println("Status: " + aprovado);
        System.out.println();


    }

}
