package OrientaçaoObjeto.Heranca;

//aluno é uma pessoa, faremos uma relacao entre a classe Pessoa (mae)
//e a classe Aluno (filho) que herderá as caracteristicas de Pessoa.

//usamos extends, a pessoa é màe de aluno
public class Aluno extends Pessoa {

    private int matr;
    private String curso;


    //coloca os atributos de pessoa no constructor
    public Aluno(String nome, int idade, String sexo, int matr, String curso){
        //usa o super no constructor para pegar caracteristicas de pessoas
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
    }


    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    public void cancelarMatr(){
        System.out.println("Matricula Será Cancelada");
        setMatr(0);
    }
}
