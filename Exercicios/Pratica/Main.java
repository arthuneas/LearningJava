package Exercicios.Pratica;

public class Main {
    public static void main (String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        //aqui uma classe se relaciona com outra,
        //trazendo uma classe generica de pessoa para livro.
        l[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[0]);
        l[1] = new Livro("POO Para Iniciantes", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Aveve", 780, p[0]);

        System.out.println(l[0].detalhes());

        l[1].folhear(49);
        l[1].avancarPag();
        l[1].avancarPag();
        l[1].voltarPag();
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
        l[1].folhear(-1);

    }
}
