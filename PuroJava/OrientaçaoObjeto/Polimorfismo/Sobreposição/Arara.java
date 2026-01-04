package OrientaçaoObjeto.Polimorfismo.Sobreposição;

public class Arara extends Ave{

    public Arara(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros, corPena);
    }


    @Override
    public void brincar(){
        System.out.println("Arara Brincando...");
    }

    @Override
    public void pedirComida(){
        System.out.println("Arara Pedindo Comida");
    }


}
