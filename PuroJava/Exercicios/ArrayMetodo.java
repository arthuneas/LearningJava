package Exercicios;

public class ArrayMetodo {
    public static int maiorValor(int[] array) {
        int maior = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        return maior;
    }


    public static int posicao(int[] array) {
        int posicao = 0;
        int valor = ArrayMetodo.maiorValor(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                posicao = i;
            }
        }

        return posicao;
    }

}
