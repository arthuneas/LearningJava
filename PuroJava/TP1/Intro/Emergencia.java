package TP1.Intro;

import java.util.Scanner;

public class Emergencia {

    private String nomeChamador;
    private String telefoneChamador;
    private String localEmergencia;
    private String dataHoraRelato;
    private String naturezaEmergencia;
    private String tipoResposta; //policia, ambulancia
    private String statusResposta; //pendente, a caminho, concluido
    private Boolean chamadaMovel; //sim, não
    private String coordenadasGPS; // apenas para entrada byCell


    public Emergencia(String nomeChamador, String telefoneChamador, String localEmergencia, String dataHoraRelato, String naturezaEmergencia, String tipoResposta, String statusResposta, Boolean chamadaMovel, String coordenadasGPS) {
        this.nomeChamador = nomeChamador;
        this.telefoneChamador = telefoneChamador;
        this.localEmergencia = localEmergencia;
        this.dataHoraRelato = dataHoraRelato;
        this.naturezaEmergencia = naturezaEmergencia;
        this.tipoResposta = tipoResposta;
        this.statusResposta = statusResposta;
        this.chamadaMovel = chamadaMovel;
        this.coordenadasGPS = coordenadasGPS;
    }




    //metodo para mostrar as emergências
    public void exibirDetalhes() {
        System.out.println("Nome do Chamador: " + this.nomeChamador);
        System.out.println("Telefone: " + this.telefoneChamador);
        System.out.println("Local da Emergência: " + this.localEmergencia);
        System.out.println("Data/Hora do Relato: " + this.dataHoraRelato);
        System.out.println("Natureza da Emergência: " + this.naturezaEmergencia);
        System.out.println("Tipo de Resposta: " + this.tipoResposta);
        System.out.println("Status da Resposta: " + this.statusResposta);
        System.out.println("Chamada via celular: " + (this.chamadaMovel ? "Sim" : "Não"));
        if (this.chamadaMovel) {
            System.out.println("Coordenadas GPS: " + this.coordenadasGPS);
        }
    }
}


class Registros{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine(); // Limpa o "Enter" do teclado

        Emergencia[] emergencias = new Emergencia[n];

        for (int i = 0; i < n; i++) {

            // 1. PRIMEIRO VOCÊ LÊ TODOS OS DADOS EM VARIÁVEIS TEMPORÁRIAS
            String nome = input.nextLine();

            String telefone = input.nextLine();

            String local = input.nextLine();

            String dataHora = input.nextLine();

            String natureza = input.nextLine();

            String tipo = input.nextLine();

            String status = input.nextLine();

            String respostaCelular = input.nextLine();

            boolean movel = respostaCelular.equalsIgnoreCase("sim");

            String gps = "N/A";
            if (movel) { // Jeito certo de checar boolean (é o mesmo que movel == true)
                gps = input.nextLine();
            }

            // 2. AGORA SIM VOCÊ CRIA O OBJETO E GUARDA NO ARRAY
            emergencias[i] = new Emergencia(nome, telefone, local, dataHora, natureza, tipo, status, movel, gps);
        }

        // 3. MOSTRAR OS RESULTADOS
        for (int i = 0; i < emergencias.length; i++) {
            System.out.println("Emergência #" + (i+1));

            System.out.println("\n--- Informações da Emergência ---\n");

            emergencias[i].exibirDetalhes();
            System.out.println();
        }

        input.close();
    }
}

