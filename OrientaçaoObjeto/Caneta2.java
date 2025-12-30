package OrientaçaoObjeto;

public class Caneta2 {
    //deixe as variaveis como private para ninguem usa-las
    //diretamente, apenas os gets e setters

    //encapsulmos as variaveis
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;


    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada){
        this.tampada = tampada;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public float getPonta(){
        return ponta;
    }

    public void setPonta(float Ponta) {
        this.ponta = Ponta;
    }


    public String getCor(){
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    protected void tampar(){
        setTampada(true);
    }

    protected void destampar(){
        setTampada(false);
    }

    public void status(){
        System.out.println();
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Cor: " + getCor());
        System.out.println("Tampada? " + isTampada());
    }


    public Caneta2(String modelo, String cor, float ponta){

        setModelo(modelo);
        setPonta(ponta);
        setCor(cor);

        tampar();
    }


    public Caneta2(){
        //outra forma de criar constructor igual na classe normal
        //cria valores padrão para uma classe sem parametros
        this("Caneta Genérica", "Preta", 0.5f);
    }

}
