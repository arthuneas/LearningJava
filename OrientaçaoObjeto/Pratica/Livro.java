package OrientaçaoObjeto.Pratica;

public class Livro implements Publicacao {

    //atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor){
        setTitulo(titulo);
        setAutor(autor);
        setTotPaginas(totPaginas);
        setLeitor(leitor);
        setAberto(false);
        setPagAtual(0);
    }

    //metodos modificadores
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String detalhes(){
        return "Livro{\n" + "titulo = " + getTitulo() + ",\n autor = "
                + getAutor() + ",\n totPaginas = " + getTotPaginas()
                + ",\n pagAtual = " + getPagAtual() + ",\n aberto = "
                + isAberto() + ",\n leitor = " + getLeitor().getNome() + "\n}\n";
    }


    //metodos variados
    @Override
    public void abrir() {
        setAberto(true);
        System.out.println("Livro Aberto!");
    }

    @Override
    public void fechar() {
        setAberto(false);
        System.out.println("Livro Fechado!");
    }

    @Override
    public void folhear(int pagAtual) {
        setAberto(true);
        setPagAtual(pagAtual);
    }

    @Override
    public void avancarPag() {
        if (getPagAtual() < getTotPaginas()) {
            setPagAtual(getPagAtual() + 1);

        } else {
            System.out.println("Chegou Na Pagina Final");

        }
    }

    @Override
    public void voltarPag() {
        if (getPagAtual() > 0) {
            setPagAtual(getPagAtual() - 1);

        } else {
            System.out.println("Chegou na Pagina 0");

        }
    }
}
