package OrientaçaoObjeto.Polimorfismo.Sobreposição;

public class Tartaruga extends Reptil {

    public Tartaruga(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public void locomover(){
        System.out.println("Nada e Caminha");
    }
}
