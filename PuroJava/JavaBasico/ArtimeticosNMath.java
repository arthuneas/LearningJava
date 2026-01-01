package JavaBasico;

public class ArtimeticosNMath {
    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 5;

        float media =  (float) (n1 + n2) / 2;
        System.out.println("media = " + media);

        int numero = 5;
        numero++; //pos incremento

        System.out.println("numero = " + numero);

        int valor = 5 + ++numero; //pre incremento
        System.out.println("valor = " + valor);

        System.out.println("=============================");

        int numero1 = 5;
        numero1--; //pos decremento

        System.out.println("numero = " + --numero1);

        int valor1 = 5 + --numero1; //pre decremento
        System.out.println("valor = " + valor1);

        System.out.println("=============================");

        int numero2 = 5;
        numero2 += 3; //numero2 = numero2 + 3

        int numero3 = 5;
        numero3 *= 3;

        float numero4 = 5;
        numero4 /= 3;

        int numero5 = 5;
        numero5 %= 3;

        System.out.println("numero = " + --numero2);
        System.out.println("valor = " + valor1);
        System.out.println("numero = " + numero3);
        System.out.println("numero = " + numero4); 
        System.out.println("numero = " + numero5);


        System.out.println("============================");

        //operacoes basicas da library math
        System.out.println("PI = " + Math.PI);
        System.out.println("Exponenciacao de 5 ^ 3 = " + Math.pow(5,3));
        System.out.println("raiz quadrada de 8 = " + Math.sqrt(8));
        System.out.println("raiz cubica de 8 = " + Math.cbrt(8));

        //arredondamentos
        System.out.println("valor absoluto (-10) = " + Math.abs(-10));
        System.out.println("arredonda para baixo, truncamento: tira a parte decimal (3.9) = " + Math.floor(3.9));
        System.out.println("arredonda pra cima: (3.9)" + Math.ceil(3.9));
        System.out.println("arredonda aritmeticamente (5.6): " + Math.round(5.6));

        System.out.println("numero randon = (sem parametro, vai de 0 a 1) = " + Math.random());
        System.out.println("numero randon continuos = (de 0 a 9) = "  + Math.random() * 9);
        System.out.println("numero randon discreto = (de 0 a 9) = " + (int) (Math.random() * 10));
        System.out.println("numero randon continuos = (de 5 a 10) = "  + (Math.random() * (10 - 5) + 5)); // * (max - min) + min - continuo
        System.out.println("numero randon discreto = (de 5 a 10) = "  + ((int) (Math.random() * (10 - 5 + 1)) + 5)); // * (max - min + 1) + min - discreto

        double ale = Math.random();
        int nd = ((int) (ale * (6)) + 5);
        double nc = ale * 5 + 5;
        System.out.println("ale discreto = " + nd);
        System.out.println("ale continuo = " + nc);
    }
}