package JavaBasico;

import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {

        //melhor forma de declar um vetor
        //aqui fazemos um novo objeto de inteiros
        //4 posicoes de 0 a 2
        int[] n1 = new int[3];

        //atribuir valores ao
        n1[0] = 1;
        n1[1] = 2;
        n1[2] = 3;

        //outra forma de criar um vetor já denominando valores do vetor
        int[] n2 = {0, 1, 2, 3, 4, 5};

        //------------------------
        System.out.println("valores do vetor n2: b ");
        for (int i = 0; i < n2.length; i++) {
            System.out.printf("n[%d] = %d\n", i, n2[i]);
        }


        //saber tamanho do vetor
        System.out.println("----------------------------");
        System.out.println("tamanho do vetor é " + n2.length); //6


        //usando vetor em contexto
        System.out.println("----------------------------");
        String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dec"};
        int[] tot = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < mes.length; i++) {
            System.out.printf("mes[%d] = %s, possui %d dias\n", i + 1, mes[i], tot[i]);
        }


        //usando for each aqui
        System.out.println("\n----------------------------");
        for (String meses: mes) {
            System.out.printf("%s ", meses);
        }


        //mexendo com for each
        System.out.println("\n----------------------------");
        int[] num = {3, 5, 1, 8, 5};


        //valor recebe o valor de cada passagem do vetor
        for (int valor: num) {
            System.out.print(valor + " ");
        }

        System.out.println("\n----------------------------");
        double[] v2 = {3.5, 7.777, 2.5, -4.5};

        for (double n: v2){
            System.out.print(n + " ");
        }


        //agora vamos por algoritmos em ordem
        //usando o vetor num
        System.out.println("\n----------------------------");
        System.out.println("original array: ");
        for (int n: num){
            System.out.print(n + " ");
        }

        System.out.println("\n=====");


        //usando o sort
        Arrays.parallelSort(num);
        System.out.println("sorted array: ");
        for (int n: num){
            System.out.print(n + " ");
        }


        //fazendo busca
        System.out.println("\n----------------------------");
        int pos = Arrays.binarySearch(num, 8);
        System.out.println("(binary search) posicao de 8: " + pos);


        //inicializacao de vetor com mesmo nuemro em todas as posicoes
        System.out.println("\n----------------------------");
        int[] n3 = new int[8];

        //preenche todos os 8 espacoes do vetor com 8
        Arrays.fill(n3, 3);

        for (int n: n3){
            System.out.print(n + " ");
        }
    }
}
