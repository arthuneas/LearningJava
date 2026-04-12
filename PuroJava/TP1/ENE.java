package TP1;

import java.util.Locale;
import java.util.Scanner;

class Consumo {

    private float consumo;

    public Consumo(float consumo) {
        this.consumo = consumo;
    }

    public float calcularConsumo(float quantidade) {
        float calculo;
        if (quantidade <= 500) {
            return (float) (quantidade * 0.02);

        } else if (quantidade <= 1000) {
            return (float) (50 + (quantidade - 500) * 0.05);

        } else {
            return (float) (350 + ((quantidade - 1000) * 0.1) );
        }
    }
}

public class ENE {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);

        float consumoTotal = input.nextFloat();

        Consumo consumo = new Consumo(consumoTotal);

        float quantidade = consumo.calcularConsumo(consumoTotal);

        System.out.printf("%.2f 5.00 %.2f\n", quantidade, (quantidade + 5));

    }
}