package Exercicios;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;


    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }


    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public double getNota1(){
        return nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }

    public double getNota2(){
        return nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public double calcularNota() {
        return (getNota1() + getNota2()) / 2;
    }


    private boolean verificarAprovacao() {
        return calcularNota() >= 5;
    }


    public void status() {
        String aprovado = verificarAprovacao() ? "Aprovado" : "Reprovado";

        System.out.println();
        System.out.println("Aluno: " + getNome());
        System.out.println("Nota 1: " + getNota1());
        System.out.println("Nota 2: " + getNota2());
        System.out.println("Media Final: " + calcularNota());
        System.out.println("Status: " + aprovado);
        System.out.println();


    }

}
