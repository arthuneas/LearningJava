/*

Polimorfismo por Sobrecarga
- Mamifero: emitirSom()
- Lobo: emitirSom()

 */


package OrientaçaoObjeto.Polimorfismo.SobreCarga;

public class Main {

    public static void main(String[] args){

        Cachorro c = new Cachorro(5, 4, 4, "Preto e Branco");
        c.abanarRabo();
        c.emitirSom();
        c.enterrarOsso();
        c.reagir(true);
        c.reagir(false);
        c.reagir("Agressiva");
        c.reagir("Agradável");
        c.reagir("oioi");
        c.reagir(4, 55);
        c.reagir();



    }

}
