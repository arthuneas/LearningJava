/*
 Tipo de Dados no Java
     LOGICO:
         boolean - Boolean - 1 bit - "true"

     LITERAIS:
         char - Character - 1 byte - "'a'"
          _   - String - n bytes - "java"

     INTEIROS:
         byte - Byte - 1 byte - +/-127
         short - Short - 2 bytes - +/-32767
         int - Integer - 4 bytes - +/-2147483
         long - Long - 8 bytes - 2^63

     REAIS:
         float - Float - 4 bytes - 3.4e^38
         double - Double - 8 bytes - 1.8e^308
*/
import java.util.Scanner;

public class TypeData {
    public static void main(String[] args) {

        //formas de declarar variavel

        /* 

        //inteiro
        int idade = 3; //inteiro idade
        int age = (int) 3; //typecast
        Integer ano = 3; //ultilizando classes e criando um objeto. wrapped class
        //Integer ano = Integer.valueOf(3)

        //mexer no float
        float salario = 100.00f;
        float sal = (float) 1854.54;
        Float salary = 453.76F;

        //character
        char letra = 'A';
        char letra2 = (char) 'g';
        Character letra3 = 'a';

        //tipo booleano
        boolean estudante = true;
        Boolean estudante2 = true;
        //Boolean estudante2 = Boolean.valueOf(true)
        */

// --------------------------------------------------------

        //SAIDA DE DADOS
        Scanner ler = new Scanner(System.in);

        float nota = 3.8f;
        String nome = "arthur";

        System.out.print("sua nota é " + nota + "\n"); // apenas printa
        System.out.println("sua nota é " + nota); //print e tambem pula a linha
        System.out.printf("a nota do %s é %.1f \n",nome, nota); //print igual no c, formatado
        System.out.format("a nota do %s é %.2f\n", nome, nota); //mesma sintaxe do printf


        //ENTRADA DE DADOS

        System.out.print("Digite o Nome do Aluno: ");
        String name = ler.nextLine();

        System.out.print("Digite a Nota do Aluno: ");
        Float grade = ler.nextFloat();

        System.out.printf("a nota de %s foi de %.2f",  name, grade);


        //TRANFORMAÇÃO DE TIPOS
        //para atribuir uma variavel de tipo X para string
        int number = 30;
        String value = Integer.toString(number); //inteiro -> string
        System.out.println(value);

        String word = "30";
        int number2 = Integer.parseInt(word); //string -> inteiro
        System.out.println(number2);

        String number3 = "30.56";
        float num = Float.parseFloat(number3);
        System.out.println(num);

        ler.close();

    }
}


