package Exercicios.Dispositivo;

public class ControleRemoto {

    public static void main (String[] args){

        Lampada lampada = new Lampada();
        Televisao televisao = new Televisao();

        //teste de aumentar tv desligada
        televisao.ligar();
        televisao.aumentarVolume();



    }

}
