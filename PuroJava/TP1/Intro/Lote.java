package TP1.Intro;

import java.util.Scanner;

import static java.lang.System.exit;

class Loteamento{

    private int lote;
    private int area;
    private int iptu;

    public Loteamento(int lote, int area) {
        this.lote = lote;
        this.area = area;
    }

    public int getLote() {
        return lote;
    }

    public void setLoteamento(int lote) {
        this.lote = lote;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }


    public float calculoIptu(int loteamento, int area) {
        float iptu = 0;

        boolean loteArea1 = (loteamento == 1 && (area > 0 && area < 200));
        boolean loteArea2 = (loteamento == 1 && (area >= 200));

        boolean loteArea3 = (loteamento == 2 && (area > 0 && area < 200));
        boolean loteArea4 = (loteamento == 2 && (area >= 200));


        if (loteArea1) {
             iptu = getArea();

        } else if (loteArea2) {
            iptu = getArea() * 1.2f;

        } else if (loteArea3) {
            iptu = getArea() * 1.1f;

        } else if (loteArea4) {
            iptu = getArea() * 1.3f;

        } else {
            System.out.println("Entrada inválida!");
            exit(0);
        }

         return iptu;
    }
}

public class Lote {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lote = scanner.nextInt();
        int area = scanner.nextInt();

        Loteamento loteamento = new Loteamento(lote, area);
        System.out.printf("%.2f\n", loteamento.calculoIptu(loteamento.getLote(), loteamento.getArea()));
    }

}
