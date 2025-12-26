import java.util.Scanner;

public class Condicionais1 {
    public static void main(String[] args) {

        float n1, n2, media;
        String message;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota1: ");
        n1 = input.nextFloat();

        System.out.print("Digite a nota2: ");
        n2 = input.nextFloat();

        media = (n1 + n2) / 2;

        System.out.println("sua media é: " + media);

        // usando if
        if (media >= 9){
            System.out.println("Parabens");
        } else {
            System.out.println(";P");
        }

        // usando ternario
        message = media > 9 ? "Parabens" : ";p";
        System.out.println(message);

        System.out.println("===============================");

        int v;
        System.out.print("digite o valor: ");
        v = input.nextInt();

        if (v % 2 == 0) {
            System.out.println("eh par");
        } else {
            System.out.println("eh impar");
        }

    }
}
