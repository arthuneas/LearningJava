package OrientaçaoObjeto.Heranca.Introducao;

public class Main {
    public static void main(String[] args){

        Pessoa p1 = new Pessoa("Pedro", 21, "M");
        Aluno p2 = new Aluno("Arthur", 19, "M", 242118880, "Ciência da Computação");
        Professor p3 = new Professor("Claudio", 32, "M", "Informática", 18553.50f);
        Colaborador p4 = new Colaborador("Fabiana", 23, "F", "Restaurante Universitário");

        //na SuperClasse, há o metodo status, todo o restante herda status
        System.out.println(p1.status());
        System.out.println(p2.status());
        System.out.println(p3.status());
        System.out.println(p4.status());

        //Nesse caso, todo filho faz coisas que a mãe faz
        //mas a mãe não faz o que o filho faz
        //p1 não recebe metodos diferentes da classe Pessoa
        //p2 recebe metodos de Aluno e  Pessoa
        p2.cancelarMatr();
        p3.receberAum(345f);
        p4.mudarTrabalho("Estágiaria em Ciências Políticas");
        p4.setTrabalhando(false);
        p4.mudarTrabalho("Estágiaria em Ciências Sociais");

    }
}
