//operador ternario:
/*
if (n1 > n2) {
    great = n1;
else {
    great = n2;
}

great = n1 > n2 ? n1 : n2
great = n1 (expressao) n2 ? valor, caso, verdadeiro : valor, caso, falso
 */

public class Relacionais {
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 8;

        int great1 = (n1 < n2) ? 1 : 0; //out = 1, expressaão verdadeira
        double great2 = (n1 < n2) ? Math.pow(n1, 2) : n1; //out = 25
        double great3 = (n1 > n2) ? Math.pow(n1, 2) : n1; //out = 5
        double great4 = (n2 != n1) ? n2 - n1 : n2;

        System.out.println(great1);
        System.out.println(great2);
        System.out.println(great3);
        System.out.println(great4);

        //inicializando as strings
        System.out.println("=================================");
        System.out.println("mexendo com strings: ");
        String nome1 = "arthur";
        String nome2 = "arthur"; //objeto de caracteres
        String nome3 = new String("arthur"); //instanciando um novo objeto

        //operacao ternaria
        //armazenando tudo em variaveis
        String res1 = (nome1 == nome2) ? "igual" : "diferente"; //igual
        String res2 = (nome1 == nome3) ? "igual" : "diferente"; //diferente, não é igual um objeto a outro
        String res3 = (nome1.equals(nome3))?"igual":"diferente"; //igual, analisa o conteudo dos objetos
        //melhor usar .equals

        //printando o resultado
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

    }
}
