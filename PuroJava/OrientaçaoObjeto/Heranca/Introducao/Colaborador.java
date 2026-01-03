package OrientaçaoObjeto.Heranca.Introducao;

public class Colaborador extends Pessoa {

    private String setor;
    private boolean trabalhando;


    public Colaborador(String nome, int idade, String sexo, String setor) {
        super(nome, idade, sexo);
        this.setor = setor;
        trabalhando = true;
    }


    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }


    public void mudarTrabalho(String setor){
        if (isTrabalhando()){
            setSetor(setor);
            System.out.println("Operação Concluída Com Sucesso!");
            System.out.printf("O Colaborador %s Migrou de Setor %s Para Setor %s\n", getNome(), getSetor(), setor);

        } else {
            System.out.println("Profissional Não Está Exercendo Atividades Laborais.");
            System.out.println("Impossivel Mudar Setor!");

        }

    }
}
