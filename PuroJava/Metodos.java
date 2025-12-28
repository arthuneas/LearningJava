import java.util.Scanner;
import java.util.SortedMap;

public class Metodos {

    static void soma (int a, int b){
        int soma = a + b;

        System.out.println(soma);
    }

    static int mult (int a, int b){

        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        soma(a, b);
        int m = mult(a, b);
        //System.out.println(m);
        System.out.printf("%d\n", mult(a, b));

        int inicio = sc.nextInt();
        int fim = sc.nextInt();

        sc.close();

        //instanciei um novo objeto da classe Operacoes, static
        Operacoes cont = new Operacoes();
        String line = cont.contador(inicio, fim);

        //metodo sem static
        System.out.println(line);

        //os metodos estao em um arquivo Operacoes -> classe
        //public static
        System.out.println(Operacoes.subtracao(inicio, fim));

        System.out.println(Operacoes.sum(inicio, fim));

        System.out.println(Operacoes.division(inicio, fim));
    }
}
