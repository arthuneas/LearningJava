package GerenciadorCinema;

public class Main {


    public static void main(String[] args) {

        //inicializa a matriz
        int[][] sala = Menu.matrizSala();

        while (true){

            //printa o menu
            Menu.printMenu();
            int opcao = Met.readInt();

            //logica das opcoes
            Menu.chooseMenu(opcao, sala);

        }
    }
}
