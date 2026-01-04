package OrientaçaoObjeto.Polimorfismo.Sobreposição;

public class Reptil extends Animal{

    private String corEscama;


    public Reptil(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }


    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }


    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Réptil");
    }
}
