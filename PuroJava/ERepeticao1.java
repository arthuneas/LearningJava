import java.util.Scanner;

public class ERepeticao1 {

    //usando metodo com repeticao
    static void repetition (int n) {
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d\n", i);
        }

        System.out.println();
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero limite: ");
        int n = input.nextInt();

        input.close();

        repetition(n);

        System.out.println("======================================");
        int cambalhota = 0;

        for (int j = 0; j < 4; j++) {
            cambalhota += 2;
        }

        System.out.println(cambalhota);

        System.out.println("======================================");
        int more = 0;

        while (more <= 20) {
            more++;

            //continue
            if (more % 2 == 0) {
                continue; //ele volta para a condição do while, não vai printar na tela
            }

            //break
            if (more == 17) {
                break; //ele sai do while e prossegue o codigo
            }

            System.out.printf("%d ", more);
        }

        System.out.println("\n======================================");

    }
}
