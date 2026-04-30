package TP1.Intro;

import java.util.Scanner;

public class Temperatura {

    private double temperatura;
    private boolean isFahrenheit;


    public Temperatura(double temperatura, boolean isFahrenheit) {
        this.temperatura = temperatura;
        this.isFahrenheit = isFahrenheit;

    }

    public void celsiusToFahreheit(){
        this.temperatura = this.temperatura * 9.0 / 5.0 + 32;
        this.isFahrenheit = true;
    }

    public void fahrenheitToCelsius(){
        this.temperatura = (this.temperatura - 32) * 5.0 / 9.0;
        this.isFahrenheit = false;
    }

    @Override
    public String toString() {
        String s = "temperatura: " + this.temperatura + " graus " +
                (this.isFahrenheit ? "fahrenheit" : "celsius");
        return s;
    }
}


class Principal {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double temp = input.nextDouble();

        Temperatura temperatura = new Temperatura(temp, false);

        temperatura.celsiusToFahreheit();
        System.out.println(temperatura.toString());

        temperatura.fahrenheitToCelsius();
        System.out.println(temperatura.toString());

        input.close();

    }
}