package OrientaçaoObjeto.ProjetoFinal;

public class Usuario extends Pessoa {

    private String login;
    private int totAssistido;


    public Usuario(String nome, int idade, String sexo, int experiencia, String login) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = 0;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }


    public String statusUsuario() {
        return "Usuario: " + getNome() + " {" +
                "\nlogin = '" + login + '\'' +
                "\ntotAssistido = " + totAssistido +
                dadosUsuarios() + "\n" +
                '}' + "\n";
    }
}
