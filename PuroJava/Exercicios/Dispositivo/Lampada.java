package Exercicios.Dispositivo;

public class Lampada implements Dispositivo {

    private boolean acesa;

    public Lampada() {
        setAcesa(false);
    }

    private void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }

    private boolean getAcesa(){
        return acesa;
    }


    @Override
    public void ligar() {
        setAcesa(true);
        System.out.println("Luz Ligada!");
    }

    @Override
    public void desligar() {
        setAcesa(false);
        System.out.println("Luz Desligada!");
    }

}
