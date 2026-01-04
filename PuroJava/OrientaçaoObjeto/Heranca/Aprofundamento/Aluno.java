package OrientaçaoObjeto.Heranca.Aprofundamento;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;
    private float mensalidade;


    public Aluno(String nome, int idade, String sexo, int matricula, String curso, float mensalidade) {
        super(nome, idade, sexo);
        this.matricula = matricula;
        this.curso = curso;
        this.mensalidade = mensalidade;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public void pagarMensalidade(){
        System.out.println("Pagar Mensalidade");
        System.out.printf("Mensalidade do Aluno(a) %s de valor R$ %.2f Paga!\n", getNome(), getMensalidade());
    }

}
