/*
-- HERANÇA --
mae -> filha
filha herda caracteristica da mae
uma classe herda caracteristica de uma classe previamente herdada
filha herda caracteristica e comportamentos da mae

----------------------

Aluno - nome, idade, sexo, matr, curso
-- fazerAniv();
-- cancelarMatr();

Professor - nome, idade, sexo, especialidade, salario
-- fazerAniv();
-- receberAum();

Colaborador - nome, idade, sexo, setor, trabalhando
-- fazerAniv();
-- mudarTrabalho

em um colégio há um aluno, professor e colaborador. vemos que há metodos e atributos
comuns nessas classes: nome, idade, sexo, fazerAniv().

sendo assim, criamos uma classe para armazenar esses metodos e atributos, uma
classe pessoa. as classes anteriores herdarao a classe pessoas.


mae é a superclasse
filha é a subclasse
 */

package OrientaçaoObjeto.Heranca.Introducao;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private String sexo;


    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public void fazerAniv(){
        setIdade(getIdade() + 1);
    }


    public String status() {
        String s = "Pessoa{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", sexo='" + getSexo() + '\'' +
                '}';

        return s;
    }
}
