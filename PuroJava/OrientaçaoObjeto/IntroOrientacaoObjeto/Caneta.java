package OrientaçaoObjeto.IntroOrientacaoObjeto;

public class Caneta {
    public String modelo;
    public String cor;
    private double ponta;
    protected int carga;
    protected boolean tampada;


    public void status(){
        System.out.println("\nModelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Esta Tamapada? " + tampada);
        System.out.println("Ponta: " + ponta);
        System.out.println("Carga: " + carga);
    }


    public void escrever(){
        System.out.println("\n");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println();
        rabiscar();
    }

    //pode ser usado apenas denrtro da classe mae
    private void rabiscar() {

        if (tampada) {
            System.out.printf("Erro, a %s esta tampada!", this.modelo);
        } else {
            System.out.println();
            System.out.println("----------------");
            System.out.println("               |           ------");
            System.out.println("               |                |");
            System.out.println("               ------------------");
            System.out.println();

        }
    }

    protected void tampar(){
        this.tampada = true;
    }

}
