package OrientaçaoObjeto.Polimorfismo.SobreCarga;

public class Mamifero extends Animal {

    private String corPelo;


    public Mamifero(float peso, int idade, int membros, String corPelo){
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }


    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }


    @Override
    public void locomover(){
        System.out.println("Correndo");
    }

    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero");
    }

}
