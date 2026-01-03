package OrientaçaoObjeto.Heranca.Aprofundamento;

public class Main {

    public static void main(String[] args){

        Visitante v1 = new Visitante();
        //usou dados da Classe funcionando.
        //herança pobre
        v1.setNome("Julio");
        v1.setIdade(21);
        v1.setSexo("M");
        System.out.println(v1.status() + "\n");

        Aluno a1 = new Aluno();
        a1.setNome("Arthur");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.setCurso("Ciência da Computação");
        a1.setMensalidade(3320);
        a1.pagarMensalidade();
        System.out.println(a1.status() + "\n");

        Bolsista b1 = new Bolsista();
        b1.setNome("Caio");
        b1.setIdade(20);
        b1.setSexo("M");
        b1.setCurso("Nutrição");
        b1.setMensalidade(2340);
        b1.setBolsa(30);
        //é o mesmo metodo que a1, mas ele tem logica diferente para bolsista
        b1.pagarMensalidade();
        System.out.println(b1.status() + "\n");

        Professor p1 = new Professor();
        p1.setNome("Otávio");
        p1.setSalario(17930.93f);
        p1.setEspecialidade("Redes de Computadores");
        p1.receberAumento(345.43f);

        Tecnico t1 = new Tecnico();
        t1.setNome("Giovana");
        t1.setRegistroProfissional("Técnico em Eletrônica");
        t1.praticar();

        //exemplo de polimorfismo
        v1.fazerAniv();
        a1.fazerAniv();
        b1.fazerAniv();
        p1.fazerAniv();
        t1.fazerAniv();
    }

}
