package OrientaçaoObjeto.Polimorfismo.SobreCarga;

public class Cachorro extends Mamifero {

    public Cachorro(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }


    public void enterrarOsso(){
        System.out.println("Cachorro Enterrou Osso!");
    }

    public void abanarRabo(){
        System.out.println("Cachorro Abanou Rabo!");
    }


    //polimorfismo por Sobrecarga
    /*
    reagir();

    falar frases - agradavel, abanar e latir, agressiva, rosnar
    horario do dia - manha: abanar; tarde: abanar e latir; noite - ignorar
    dono - true: abanar; false: rosnar e latir
    idade e peso - novo e leve: abanar; novo e pesado: latir; velho e leve: rosnar; velho e pesado: ignora

     não pode ter a mesma assinatura, mas possuem o mesmo nome.
     todos os metodos de mesmo nome na mesma classe.
     */
    public void reagir(String frase){
        if (frase.equalsIgnoreCase("Agressiva")){
            System.out.println("Rosnar");

        } else if (frase.equalsIgnoreCase("Agradável")){
            System.out.println("Abanar e Latir");
            emitirSom();

        } else {
            System.out.println("Cachorro em Duvida da Frase");

        }
    }

   public void reagir(int hora, int min){
        boolean horaInvalida = hora < 0 || min < 0 || hora > 23 || min > 59;

        if (!horaInvalida){
            if (hora < 6){
                System.out.println("Madrugada");
                System.out.println("Cachorro Dormindo");

            } else if (hora < 12) {
                System.out.println("Manhã");
                System.out.println("Abanar e Latir");
                emitirSom();

            } else if (hora < 18) {
                System.out.println("Tarde");
                System.out.println("Latir");

            } else {
                System.out.println("Noite");
                System.out.println("Ignorar");

            }

        } else {
            System.out.println("Hora Digitada Inválida");

        }
    }

    public void reagir(boolean dono){
        if (dono) {
            System.out.println("Abanar");

        } else {
            System.out.println("Rosnar e Latir");
            emitirSom();

        }
    }

    public void reagir(){
        boolean leve = getPeso() <= 5;
        if (getIdade() < 5) {
            if (leve) {
                System.out.println("Abana!");

            } else {
                System.out.println("Latir!");
                emitirSom();

            }

        } else {
            if (leve){
                System.out.println("Rosnar!");

            } else {
                System.out.println("Ignorar!");

            }
        }
    }


    //polimorfismo por sobreposição.
    @Override
    public void emitirSom(){
        System.out.println("Latindo...");
    }
}

