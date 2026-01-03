package OrientaçaoObjeto.Heranca.Aprofundamento;

public class Tecnico extends Aluno{

    private String registroProfissional;


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
