import java.time.LocalDate;
import java.util.Scanner;

public class Condicionais2 {
    public static void main(String[] args) {
        
        int nasc, idade, ano;

        Scanner sc = new Scanner(System.in);
        LocalDate dataAtual = LocalDate.now();

        ano = dataAtual.getYear();
        nasc = sc.nextInt();

        sc.close();

        idade = ano - nasc;

        if (idade < 6) {
            System.out.println("NAO VOTA");
        
        } else {
   
            System.out.println("");    

        }



    }
}
