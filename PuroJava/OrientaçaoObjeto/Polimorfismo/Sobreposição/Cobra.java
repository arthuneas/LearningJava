package OrientaçaoObjeto.Polimorfismo.Sobreposição;

public class Cobra extends Reptil implements Domestico {

    public Cobra(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public void brincar(){
        System.out.println("Cobra está Brincando...");
    }

    @Override
    public void pedirComida(){
        System.out.println("Cobra está Pedindo Comida");
    }

}
