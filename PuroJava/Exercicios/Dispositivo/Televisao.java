package Exercicios.Dispositivo;

public class Televisao implements Dispositivo {

    private boolean ligada;
    private int volume;

    public Televisao() {
        setLigada(false);
        setVolume(50);
    }

    private void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    private boolean isLigada() {
        return ligada;
    }

    private void setVolume(int volume){
        this.volume = volume;
    }

    private int getVolume(){
        return volume;
    }


    public void aumentarVolume(){
        if (!isLigada()) {
            System.out.println("Impossivel Aumentar Volume!");
            System.out.println("MOTIVO: TV Desligada.");

        } else {
            setVolume(getVolume() + 5);
            System.out.print("VOLUME: ");

            for (int i = 0; i < getVolume(); i += 10) {
                System.out.print("|");
            }

            System.out.println();
        }
    }


    @Override
    public void ligar(){
        if (!isLigada()) {
            setLigada(true);
            System.out.println("Ligando...");

        } else {
            System.out.println("TV Previamente Ligada!");

        }
    }

    @Override
    public void desligar(){
        if (isLigada()) {
            setLigada(false);
            System.out.println("Desligando...");

        } else {
            System.out.println("Impossivel Desligar!");
            System.out.println("TV Previamente Desligada!");

        }

    }

}
