package OrientaçaoObjeto.Heranca.Aprofundamento;

public class Bolsista extends Aluno{

    private int bolsa;

    public void renovarBolsa(){

    }

    //vamos sobrepor esse metodo, pois ele paga a mensalidade, mas é diferente da Classe aluno
    //ambos pagam mensalidade, são o "mesmo" método, fazem a mesma coisa, mas fazem coisas diferentes.
    //isso é o unico do conceito de polimorfismo.
    @Override
    public void pagarMensalidade(){


    }

}
