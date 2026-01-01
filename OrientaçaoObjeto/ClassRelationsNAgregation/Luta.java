//tipo abstrato de dados
/*
Existem os tipos primitivos de dados, agora mexemos com a classe Lutador.
Faremos uma classe Luta, que acontece entre os lutadores, e assim, faremos eles lutarem entre si
atribuiremos um tipo para 'desafiado' e 'desafiante', que será Lutador, a classe feita anteriormente.

como há uma relacao da classe lutador para luta, há uma relacao
de agregacao da classe lutador para luta.

pode se analogar com o diagrama entidade-relacionamento com banco de dados.

Lutador * DISPUTA-> (Agragação)0..*



 */

package OrientaçaoObjeto.ClassRelationsNAgregation;

public class Luta implements MetodosLuta{

    //atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;

    //metodos modificadores
    private Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado){
        this.desafiado = desafiado;
    }

    private Lutador getDesafiante(){
        return desafiante;
    }

    private void setDesafiante (Lutador desafiante){
        this.desafiante = desafiante;
    }

    private int getRound(){
        return round;
    }

    private void setRound(int round){
        this.round = round;
    }
    private boolean isAprovada(){
        return aprovada;
    }

    private void setAprovada(boolean aprovada){
        this.aprovada = aprovada;
    }


    //metodos personalizados
    @Override
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){
            setAprovada(true);
            setDesafiado(l1);
            setDesafiante(l2);

        } else {
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }

    }

    @Override
    public void lutar() {
         if (isAprovada()) {
            desafiado.apresentar();
            desafiante.apresentar();

            int vencedor = (int) (Math.random() * 3);

            switch (vencedor) {
                case 0:
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    System.out.println("EMPATOU!");
                    break;

                case 1:
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    System.out.printf("%s GANHOU!\n", desafiado.getNome());
                    break;

                case 2:
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    System.out.printf("%s GANHOU!\n", desafiante.getNome());
                    break;

            }

         } else {
             System.out.println("Luta Não Aprovada");

         }
    }
}
