package OrientaçaoObjeto.Heranca.Aprofundamento;

public class Bolsista extends Aluno{

    private float bolsa;


    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }


    public void renovarBolsa(float bolsa){
        setBolsa(bolsa);
        System.out.println("Bolsa Renovada!\n");
        System.out.printf("Bolsa Atual de %.0f%%\n", getBolsa());
    }

    //vamos sobrepor esse metodo, pois ele paga a mensalidade, mas é diferente da Classe aluno
    //ambos pagam mensalidade, são o "mesmo" método, fazem a mesma coisa, mas fazem coisas diferentes.
    //isso é o unico do conceito de polimorfismo.
    @Override
    public void pagarMensalidade(){
        float newMensalidade = getMensalidade() * (1 - bolsa/100);
        System.out.printf("%s é Bolsista, Sua Mensalidade Possui Desconto!\n", getNome());
        System.out.printf("Mensalidade com %.0f%% de Desconto foi Paga\n", getBolsa());
        System.out.printf("Valor Pago: R$ %.2f\n", newMensalidade);
    }

}
