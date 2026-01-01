package OrientaçaoObjeto.ClassRelationsNAgregation;

public class Main  {

    public static void main(String[] args){

        //instanciamos o tipo lutador como um vetor de 6 posicoes
        //desenvolveremos o constructor em base nisso
        Lutador[] lutador = new Lutador[6];

        //instanciando cada lutador organizadamente
        lutador[0] = new Lutador(
                "Pretty Boy",
                "França",
                31,
                1.75f,
                68.9f,
                11,
                2,
                1
        );

        lutador[1] = new Lutador(
                "Putscript",
                "Brasil",
                29,
                1.68f,
                57.8f,
                14,
                2,
                3
        );

        lutador[2] = new Lutador(
                "Snapshadow",
                "EUA",
                35,
                1.65f,
                80.9f,
                12,
                2,
                1
        );

        lutador[3] = new Lutador(
                "Dead Code",
                "Austrália",
                28,
                1.93f,
                81.6f,
                13,
                0,
                2
        );

        lutador[4] = new Lutador(
                "Ufocobol",
                "Brasil",
                37,
                1.7f,
                119.3f,
                5,
                4,
                3
        );

        lutador[5] = new Lutador(
                "Nerdaard",
                "EUA",
                30,
                1.81f,
                105.5f,
                12,
                2,
                4
        );

        /*
        lutador[0].apresentar();
        lutador[1].apresentar();
        lutador[2].apresentar();
        lutador[3].apresentar();
        lutador[4].apresentar();
        lutador[5].apresentar();
        */

        //substituiremos tudo aquilo por um for e fica
        //usar esse for se todas as posições forem preenchidas
        for (Lutador luta: lutador) {
            luta.apresentar();
        }

        for (int i = 0; i < 6; i++) {
            lutador[i].status();;
        }

        //na main, mexemos com uma classe que se relaciona com a primeira
        //assim, fazmeos uma nova luta como um novo objeto
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(lutador[0], lutador[1]);
        UEC01.lutar();

        Luta UEC02 =  new Luta();
        UEC02.marcarLuta(lutador[1], lutador[2]);
        UEC02.lutar();

        Luta UEC03 =  new Luta();
        UEC03.marcarLuta(lutador[1], lutador[1]);
        UEC03.lutar();

    }

}
