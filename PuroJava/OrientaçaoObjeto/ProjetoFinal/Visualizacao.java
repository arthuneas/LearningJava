package OrientaçaoObjeto.ProjetoFinal;

public class Visualizacao {

    private Usuario espectador;
    private Video filme;


    public Visualizacao(Usuario espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(getFilme().getViews() + 1);
    }


    public Usuario getEspectador() {
        return espectador;
    }

    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public String statusVisualizacao() {
        return "Visualizacao{" + "\n" +
                "espectador = '" + getEspectador().getNome() + '\'' + "\n" +
                "filme = '" + getFilme().getTitulo() + '\'' + "\n" +
                '}' + "\n";
    }


    public void avaliar(){
        filme.setAvaliacao(5.0f);
        System.out.printf("Taxa de Aprovação do Filme: %.1f\n", getFilme().getAvaliacao());
    }

    public void avaliar(int nota){
        boolean notaValida = nota >= 0 && nota <= 10;

        if (notaValida) {
            filme.setAvaliacao(nota);
            System.out.printf("Nota do Filme: %d\n", nota);

        } else {
            System.out.println("Digite uma Nota Válida de 0 a 10");

        }
    }

    public void avaliar(float porc){
        boolean porcValida = porc >= 0.0f && porc <= 100.0f;

        if (porcValida) {
            filme.setAvaliacao(porc);
            System.out.printf("Taxa de Aprovação do Filme: %.1f\n", porc);

        } else {
            System.out.println("Digite uma Nota Válida de 0 a 100");

        }
    }


}
