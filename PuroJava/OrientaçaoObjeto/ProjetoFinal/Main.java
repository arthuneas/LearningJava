package OrientaçaoObjeto.ProjetoFinal;

public class Main {

    public static void main(String[] args){

        Video[] v = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de Java");
        v[2] = new Video("Aula 7 de Números Complexos");
        System.out.println(v[0].statusVideo());

        Usuario[] u = new Usuario[2];
        u[0] = new Usuario("Arthur", 19, "M", 0, "arthur@gmail.com");
        u[1] = new Usuario("Toy", 11, "M", 0, "ToyDog@gmail.com");
        System.out.println(u[0].statusUsuario());
        System.out.println(u[1].statusUsuario());

        //conexão entre as classes
        Visualizacao[] vis = new Visualizacao[5];
        vis[0] = new Visualizacao(u[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].statusVisualizacao());

        vis[1] = new Visualizacao(u[0], v[1]) ;
        vis[1].avaliar(35.f);
        System.out.println(vis[1].statusVisualizacao());
        //vis[2] = new Visualizacao(u[0], v[1]);
        //vis[3] = new Visualizacao(u[0], v[1]);
        //vis[4] = new Visualizacao(u[0], v[1]);
    }
}
