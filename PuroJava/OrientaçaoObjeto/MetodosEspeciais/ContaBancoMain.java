package OrientaçaoObjeto.MetodosEspeciais;

public class ContaBancoMain {
    public static void main(String[] args) {

        ContaBanco c1 = new ContaBanco(123, "Arthur");
        c1.abrirConta("CP");
        c1.depositar(500);
        c1.pagarMensal();


        ContaBanco c2 = new ContaBanco(1432, "Toy");
        c2.abrirConta("CC");
        c2.pagarMensal();

        //c2.sacar(38);
        c2.fecharConta();
        c2.abrirConta("CP");

        c1.statusConta();
        c2.statusConta();

    }
}
