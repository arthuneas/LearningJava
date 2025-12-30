/*
Considerando o Projeto de uma caneta um Objeto.

Uma classe precisa ter tres requisitos:
- coisas que eu tenho == atributos:
. modelo, cor, ponta, carga, tampada

- coisas que eu faco == metodos:
. escrever, rabiscar, tampar, pintar

- como eu estou agora == estado:
. estado da caneta

--------------------------------------------

todo objeto deriva de uma classe

* Classe Canela

Atributos
- modelo: String
- cor: String
- ponta: double
- carga: int
- tampada: boolean

Metodo rabiscar() {
    if (tampada == true || carga == 0) {
        print(erro)
        return
    }
}

Metodo Tampar() {
    tampada = true;
}

---------------------------------------------

Classe Caneta
-- Atributos --
Modelo - Bic Cristal
Cor - Azul
Ponta - 0.5
Carga - 90
Tampada - falso

--Metodos--
escrever();
rabiscar();
pintar();
tampar();
destampar();

-- Estado --
Destampada
Azul
90% de carga

---------------------------

para gerar a classe em Objeto -> instanciar
c1 = new Caneta

//atribuicoes
c1.cor = azul
c1.ponta = 0.5
c1.tampada = falsa

//metodos
c1.rabiscar();

//segundo objeto da mesma classe da primeira
//mas sao independentes
c2 = new Caneta
c2.cor = vermelha
c2.ponta = 1.0
c2.tampada = true
c2.destampar()

----------------------------

Classe:
define os atributos e os metodos comuns que serao compartilhados por um objeto

Objeto:
é a instancia de uma classe
*/



package OrientaçaoObjeto;

public class Objeto {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();

        //atribuito
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 100;
        c1.modelo = "Bic Cristal";

        //metodos3
        //c1.tampada = true
        c1.tampar();

        c1.status();

        //c1.rabiscar();

        Caneta c2 = new Caneta();

        c2.cor = "Verde";
        //c2.ponta = 1.0f;
        c2.tampada = false;
        c2.carga = 70;
        c2.modelo = "Bic";
        c2.status();

        //c2.rabiscar();
        //usa o metodo rabisco da classe mae
        c2.escrever();

        c2.tampar();

        c2.status();


    }
}
