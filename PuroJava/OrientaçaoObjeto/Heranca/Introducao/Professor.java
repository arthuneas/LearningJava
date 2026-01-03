package OrientaçaoObjeto.Heranca.Introducao;

public class Professor extends Pessoa{

    private String especialidade;
    private float Salario;


    public Professor(String nome, int idade, String sexo, String especialidade, float salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        Salario = salario;
    }


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return Salario;
    }

    private void setSalario(float salario) {
        Salario = salario;
    }


    public void receberAum(float aumento){
        setSalario(getSalario() + aumento);
        System.out.println("Operação Concluída Com Sucesso!");
        System.out.printf("Professor %s Recebeu um Aumento de R$ %.2f\n", getNome(), aumento);
        System.out.println("Salário Atual: R$ " + getSalario());
    }

}
