package OrientaçaoObjeto.ProjetoFinal;

public abstract class Pessoa {

    private String nome;
    private int idade;
    private String sexo;
    private float experiencia;


    public Pessoa(String nome, int idade, String sexo, float experiencia) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = experiencia;
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

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    protected void ganharExp(){
        setExperiencia(getExperiencia() + 1);
    }


    public String dadosUsuarios() {
        return "\nidade = " + idade +
                "\nsexo = '" + sexo + '\'' +
                "\nexperiencia = " + experiencia;
    }
}
