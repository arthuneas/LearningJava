package OrientaçaoObjeto.Heranca.Aprofundamento;

public class Professor extends Pessoa {

    private String especialidade;
    private float salario;


    public Professor(String nome, int idade, String sexo, String especialidade, float salario){
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    public void receberAumento(float aum){
        System.out.printf("Parabens, Professor(a) %s, da especialidade: %s\n", getNome(), getEspecialidade());
        System.out.printf("Seu Salário foi Aumentado de %.2f", getSalario());
        setSalario(getSalario() + aum);
        System.out.printf(" para %.2f\n", getSalario());
    }
}
