package TP1.Intro;

import java.util.Scanner;

public class Calculos {

    private int comprimento = 1;
    private int largura = 1;

    public Calculos(int comprimento, int largura) {
        setComprimento(comprimento);
        setLargura(largura);
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        if (largura > 0 && largura < 20) {
            this.largura = largura;
        }
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        if (comprimento > 0 && comprimento < 20) {
            this.comprimento = comprimento;
        }
    }

    public int perimetro(){
        return getComprimento() * getLargura();
    }

    public int area(){
        return 2 * (getComprimento() + getLargura());
    }
}

class Main{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Calculos[] calculo = new Calculos[2];

        {
            int comprimento = input.nextInt();
            int largura = input.nextInt();

            calculo[0] = new Calculos(comprimento, largura);

        }

        {
            int comprimento = input.nextInt();
            int largura = input.nextInt();

            calculo[1] = new Calculos(comprimento, largura);

        }

        for (int i = 0; i < 2; i++) {

            System.out.printf("%d %d %d %d\n", calculo[i].getComprimento(), calculo[i].getLargura(), calculo[i].area(),  calculo[i].perimetro());

        }

    }
}
