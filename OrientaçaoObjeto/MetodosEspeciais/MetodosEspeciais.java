/*
Métodos Acessores: Getters/is
uma pessoa quer saber a quantidade de livros na estante,
o metodo get é como se fosse uma pessoa que fizesse essa consulta
para a pessoa - consulta.
- não fornece acesso direto ao objeto
- fornece acesso a um atributo sem fornece-lo diretamente


Metodos Modificadores: Setters
uma pessoa quer adicionar livros a uma estante,
o metodo set é como se houvesse uma pessoa que depositasse os
livros corretamente, necessita de parametros.


Metodo Construtor: Constructor

 */

package OrientaçaoObjeto.MetodosEspeciais;

public class MetodosEspeciais {

   public static void main(String[] args) {
      Caneta2 c1 = new Caneta2();
      Caneta2 c2 = new Caneta2("BIC", "Azul", 0.9f);

      //a pessoa muda o modelo mas sem acessá-lo diretamente
      c1.setModelo("Bic Cristal");
      c1.setPonta(0.5f);

      //a pessoa puxa o modelo, mas sem acessá-lo diretamente
      System.out.println(c1.getModelo());
      System.out.println(c1.getPonta());
      System.out.println(c2.isTampada());

      //c2.destampar();

      c2.status();
      //c2.tampar();
      c2.setModelo("Bic Cristal");
      c2.status();

   }

}
