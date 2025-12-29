package GerenciadorCinema;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        //inicializa a matriz
        int[][] sala = Menu.matrizSala();

        int opcao = 0;

        while (true){

            //printa o menu
            Menu.printMenu();
            opcao = Met.readInt();

            //logica das opcoes
            Menu.chooseMenu(opcao, sala);

        }
    }
}
