package OrientaçaoObjeto.ClassRelationsNAgregation;

public class Lutador implements MetodosLutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;


    //constructor
    public Lutador (String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates){
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setCategoria(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);

    }

    //metodos especiais
    private void setNome(String nome){
        this.nome = nome;
    }

    protected String getNome(){
        return nome;
    }

    private void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    private String getNacionalidade(){
        return nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade){
        this.idade = idade;
    }

    private void setAltura(float altura){
        this.altura = altura;
    }

    private float getAltura(){
        return altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    private float getPeso(){
        return peso;
    }

    protected void setCategoria(float peso){
        if (this.peso < 52.2) {
            categoria = "Inválido";

        } else if (this.peso < 70.3) {
            categoria = "Leve";

        } else if (this.peso < 83.9) {
            categoria = "Médio";

        } else {
            categoria = "Pesado";

        }

    }

    protected String getCategoria(){
        return categoria;
    }

    private int getVitorias(){
        return vitorias;
    }

    private void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    private void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    private int getDerrotas(){
        return derrotas;
    }

    private void setEmpates(int empates){
        this.empates = empates;
    }

    private int getEmpates(){
        return empates;
    }


    //metodos especificos
    @Override
    public void apresentar(){
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        //System.out.println(getIdade() + " Anos");
        System.out.println(getAltura() + "M de Altura");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
        System.out.println();
    }

    @Override
    public void status(){
        System.out.printf("%s é um peso %s\n", getNome(), getCategoria());
        System.out.println(getVitorias() + " Vitorias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
        System.out.println();
    }

    @Override
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

}
