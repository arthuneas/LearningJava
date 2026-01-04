package OrientaçaoObjeto.Heranca.Aprofundamento;

public class Main {

    public static void main(String[] args){

        //objeto impossivel enquanto for abstrato
        //classe raiz
        //Pessoa p1 = new Pessoa("arthur", 23, "M")


        //usou dados da Classe funcionando.
        //herança pobre
        Visitante v1 = new Visitante("Julio", 21, "M");
        System.out.println(v1.status() + "\n");

        Aluno a1 = new Aluno("Arthur", 19, "M", 1234, "Ciência da Computação", 3320f);
        /*
        a1.setNome("Arthur");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.setCurso("Ciência da Computação");
        a1.setMensalidade(3320);
        a1.pagarMensalidade();
         */
        System.out.println(a1.status() + "\n");


        Bolsista b1 = new Bolsista("Caio", 20, "M", 3245, "Nutrição", 2340.65f,30);
        //é o mesmo metodo que a1, mas ele tem logica diferente para bolsista
        b1.pagarMensalidade();
        System.out.println(b1.status() + "\n");

        Professor p1 = new Professor("Otávio", 32, "M", "Redes de Computadores", 17906.54f);
        p1.receberAumento(345.43f);
        System.out.println(p1.status() + "\n");


        Tecnico t1 = new Tecnico("Giovana", 23, "F", 4324, 1870.50f, "Técnico em Eletrônica");
        t1.praticar();
        System.out.println(t1.status() + "\n");

        //exemplo de polimorfismo
        v1.fazerAniv();
        a1.fazerAniv();
        b1.fazerAniv();
        p1.fazerAniv();
        t1.fazerAniv();
    }

}
