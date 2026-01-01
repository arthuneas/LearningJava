package OrientaçaoObjeto.Encapsulamento;

public class ControleRemoto implements Controlador {

    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //constructor
    public ControleRemoto() {
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    //metodos especiais
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private int getVolume() {
        return volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean isTocando() {
        return tocando;
    }

    //agora sobreescrevemos os metodos da interface com override
    //e ja fazemos os metodos funcionarem

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (isLigado()) {
            String ligado = isLigado() ? "Ligado" : "Desligado";
            String reproduzindo = isTocando() ? "Tocando" : "Desligado";

            System.out.println("Status da TV: " + ligado);
            System.out.println("Reprodução da TV: " + reproduzindo);
            System.out.print("VOLUME: ");

            if (getVolume() > 0) {
                for (int i = 0; i <= getVolume(); i += 10) {
                    System.out.print("|");
                }
                System.out.println();
            }
            System.out.println();

        } else {
            System.out.println("Impossivel Exibir Menu!");
            System.out.println("TV Está Desligada!");

        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (isLigado() && getVolume() < 100) {
            setVolume(getVolume() + 5);
        }

    }

    @Override
    public void menosVolume() {
        if (isLigado() && getVolume() > 0) {
            setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (isLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (isLigado() && getVolume() == 0) {
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (isLigado() && !isTocando()) {
            setTocando(true);
        } else {
            if  (isTocando()) {
                System.out.println("Já Está Em Play!");
            } else {
                System.out.println("Impossivel Play!");
                System.out.println("TV Desligada!");
            }

        }

    }

    @Override
    public void pause() {
        if (isLigado() && isTocando()) {
            setTocando(false);
        }
    }

}
