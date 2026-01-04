package OrientaçaoObjeto.Polimorfismo.Sobreposição;

public class Cachorro extends Mamifero implements Domestico{

    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }


    public void enterrarOsso(){
        System.out.println("Cachorro Enterrou Osso!");
    }

    public void abanarRabo(){
        System.out.println("Cachorro Abanou Rabo!");
    }


    @Override
    public void brincar(){
        System.out.println("Brincando...");
    }


    @Override
    public void pedirComida(){
        System.out.println("Cachorro está Pedindo Comida");
    }


    @Override
    public void emitirSom(){
        System.out.println("Latindo...");
    }
}
