/*

interface - tem apenas metodos, sem atributos
metodo abstrato: não há o desenvolvimento do metodo, apenas a indicação de que ele existe
os metodos abstratos são públicos.

<<interface>>
Controlador
ligar();
desligar();
fecharMenu();
maisVolume();
menosVolume();
ligarMudo();
play();
pause(); - metodo abstrato

após isso, fazemos a classe Controle Remoto, com atributos privados.
depois disso, relacionamos a classe à interface e colocamos os metodos da interface
na classe. sendo assim, implementamos/desenvolvemos eles na classe.

a interface é um arquivo separado.

 */
package OrientaçaoObjeto.Encapsulamento;

public class Main {
    public  static void main(String[] args) {

        ControleRemoto controle = new ControleRemoto();

        controle.ligar();
        controle.abrirMenu();
        controle.ligarMudo();
        controle.maisVolume();
        controle.desligar();
        controle.play();
        controle.abrirMenu();

    }
}
