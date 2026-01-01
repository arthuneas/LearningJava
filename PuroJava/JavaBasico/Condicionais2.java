package JavaBasico;

import java.time.LocalDate;
import java.util.Scanner;

public class Condicionais2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();

        int ano = dataAtual.getYear();
        int nasc = sc.nextInt();

        int idade = ano - nasc;

        if (idade < 16) {
            System.out.println("NAO VOTA");
        
        } else if (idade >= 16 && idade < 18 || idade > 70) {
            System.out.println("VOTO OPCIONAL");    

        } else {
            System.out.println("VOTO OBRIGATORIO");

        }

        System.out.println("-------------------------------------");

        System.out.print("Quantas pernas: ");
        int caso = sc.nextInt();
        sc.close();

        //a variavel é atribuida ao switch
        //nova sintaxe do switch
        String tipo = switch (caso) {

            case 1 -> "Saci";

            case 2 -> "Bipede";

            case 3 -> "Tripe";
            
            case 4 -> "Quadrupede";

            case 6, 8 -> "Aranha";

            default -> "ET";

        };

        System.out.printf("Isso é um(a) %s ", tipo);

    }
}
