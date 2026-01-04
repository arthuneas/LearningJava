package OrientaçaoObjeto.Heranca.Aprofundamento;

public class Tecnico extends Aluno{

    private String registroProfissional;


    public Tecnico(String nome, int idade, String sexo, int matricula, float mensalidade, String registroProfissional){
        //coloca todos os parametros herdados no super
        //aqui não queremos que o tecnico digite o curso, sendo assim, atribuimos um valor fixo
        //mas não adiciona ele como parametro no Constructor
        super(nome, idade, sexo, matricula, "Técnico Profissionalizante" ,mensalidade);
        this.registroProfissional = registroProfissional;
    }


    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }


    public void praticar(){
        System.out.printf("Aluno %s Está Praticando\n", getNome());
    }
}
