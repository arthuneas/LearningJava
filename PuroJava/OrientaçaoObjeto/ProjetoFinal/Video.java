package OrientaçaoObjeto.ProjetoFinal;

public class Video implements AcoesVideo {

    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;


    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        int nova;
        nova = (int) (this.avaliacao + avaliacao)/views;
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }


    @Override
    public void play() {
        if (isReproduzindo()){
            System.out.println("O video Já Está Reproduzindo!");

        } else {
            setReproduzindo(true);

        }
    }

    @Override
    public void pause() {
        if (isReproduzindo()){
            setReproduzindo(false);

        } else {
            System.out.println("O video Já Está Pausado!");

        }
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }

    public String statusVideo() {
        return "Video{ \n" +
                "titulo = '" + titulo + '\'' +
                "\navaliacao = " + avaliacao +
                "\nviews = " + views +
                "\ncurtidas = " + curtidas +
                "\nreproduzindo = " + reproduzindo + "\n" +
                '}' + "\n";
    }
}
