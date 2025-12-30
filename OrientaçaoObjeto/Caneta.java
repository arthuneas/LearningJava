package OrientaçaoObjeto;

public class Caneta {
    public String modelo;
    public String cor;
    public double ponta;
    protected int carga;
    protected boolean tampada;
    private int sim;


    protected void status(){
        System.out.println("\nModelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Esta Tamapada? " + this.tampada);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }


    private void escrever(){
        System.out.println("\n");
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println();
    }


    public void rabiscar() {

        if (this.tampada == true) {
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

    public void tampar(){
        this.tampada = true;
    }

}
