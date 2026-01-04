/*

Poli - Muitas
Morfo - Formas

Polimorfismo: permite que um mesmo nome represente varios comportamentos diferentes

Assinatura do Método: Quantidade e os tipos dos Parametros
- se uma funcao de mesmo nome, mesma quantidade e mesmos tipos de parametros, sua
assinatura é igual.

Tipos de Polimorfismo:
- P. Sobreposição: acontece quando substituimos um metodo de uma superclasse na sua
subclassse, usando a mesma assinatura.

- P. Sobrecarga

 */

package OrientaçaoObjeto.Polimorfismo.Sobreposição;

public class Main {

    public static void main(String[] args){

        //mesmos metodos, com o mesmo nome, agindo de forma diferente
        Mamifero m = new Mamifero(85.3f, 2, 4, "Branco");
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println();

        Ave a = new Ave(0.35f, 3, 0, "Amarelo");
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        a.brincar();
        a.pedirComida();
        System.out.println();

        Peixe p = new Peixe(0.89f, 2, 2, "Cinza");
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.fazerBolha();
        System.out.println();

        Canguru c = new Canguru(55.30f, 12, 4, "Bege");
        c.locomover();
        c.alimentar();
        c.emitirSom();
        c.usarBolsa();
        //c.brincar() - ele não implementa essa interface
        System.out.println();

        Cachorro k = new Cachorro(3.94f, 5, 4, "Caramelo");
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        k.enterrarOsso();
        k.pedirComida();
        k.brincar();
        System.out.println();

        //a classe filha de ave, arara, implementa a interface da mãe
        Arara ar = new Arara(5f, 3, 2, "Colorido");
        ar.locomover();
        ar.alimentar();
        ar.emitirSom();
        ar.pedirComida();
        ar.brincar();
        System.out.println();

    }

}
