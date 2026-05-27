package TP1.Extras.Arquivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Arquivos {

    static void main() {
        File arquivo = new File("D:/Users/arthur.almeida/Downloads/votos.txt");
        ArrayList<String> votos = new ArrayList<>();


        try(Scanner scanner = new Scanner(arquivo)){
            while (scanner.hasNextInt()) {

                String linha = scanner.nextLine();
                votos.add(linha);

            }

            for (int i = 0; i < votos.size(); i++) {
               // String v = votos.get(i);
                System.out.printf("Time %d: %s votos\n", i + 1, votos.get(i));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo Não Encontrado: " + e.getMessage());
        }

    }

}
