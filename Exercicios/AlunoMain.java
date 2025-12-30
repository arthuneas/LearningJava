package Exercicios;

public class AlunoMain {
    public static void main(String[] args) {

        Aluno aluno1;
        aluno1 = new Aluno();

        aluno1.nota1 = 8;
        aluno1.nota2 = 9;
        aluno1.nome = "João";
        aluno1.status();


        Aluno aluno2;
        aluno2 = new Aluno();

        aluno2.nota1 = 5;
        aluno2.nota2 = 4;
        aluno2.nome = "Maria";
        aluno2.status();

    }
}
