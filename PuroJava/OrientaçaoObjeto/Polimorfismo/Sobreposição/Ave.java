package OrientaçaoObjeto.Polimorfismo.Sobreposição;

//a classe implementa domestico
public class Ave extends Animal implements Domestico {

    private String corPena;


    public Ave(float peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }


    public String getCorPena() {
        return corPena;
    }

    public void setCorPassaro(String corPassaro) {
        this.corPena = corPena;
    }


    public void fazerNinho(){
        System.out.println("Construiu um Ninho");
    }

    @Override
    public void locomover(){
        System.out.println("Voando");
    }

    @Override
    public void alimentar(){
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom(){
        System.out.println("Som de Ave");
    }


    @Override
    public void brincar(){
        System.out.println("Ave Brincando...");
    }

    @Override
    public void pedirComida(){
        System.out.println("Ave Pedindo Comida");
    }

}
