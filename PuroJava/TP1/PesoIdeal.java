package TP1;

import java.util.Scanner;

class Condicao{

    public Condicao(float altura, char sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }

    private float altura;
    private char sexo;


    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    boolean condicaoEntrada() {
        return (sexo == 'f' || sexo == 'm' && altura > 0);
    }


    float pesoCalculo() {
        if (sexo == 'f') {
            return ((62.1f * altura) - 44.7f);
        } else {
            return ((72.7f * altura) - 58f);
        }
    }
}


public class PesoIdeal {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        float altura;
        char sexo;

        altura = input.nextFloat();
        sexo = input.next().charAt(0);

        input.close();

        Condicao variaveis = new Condicao(altura, sexo);

        if (variaveis.condicaoEntrada()) {
            System.out.printf("%.1f kg", variaveis.pesoCalculo());
        } else {
            System.out.println("Entrada invalida!");
        }

    }
}
