package OrientaçaoObjeto.Polimorfismo.SobreCarga;

public class Cachorro extends Mamifero {

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
    public void emitirSom(){
        System.out.println("Latindo...");
    }
}

