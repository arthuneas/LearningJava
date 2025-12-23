
import java.util.Scanner;

public class type {

    public static void main(String[] args) {
        int[] vetor;
        vetor  = new int[10];

        vetor[1] = 5;

        try (Scanner vector = new Scanner(System.in);){

            System.err.println("o vetor esta sendo usado " + vetor.length);
            System.out.println("o vetor 1 esta tem o conteudo " + vetor[1]);

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = vector.nextInt();

            }
        }
    }
}
