package TP1.Extras.InterfaceGrafica.InterfaceTaxi.model;


public class Chamado {

    private static int contadorChamados = 100;
    private int codigoChamado;
    private TipoChamado tipo;
    private String data;
    private String origem;
    private String destino;
    private String horaPartida;
    private String horaChegada;
    private double kmInicial;
    private double kmFinal;
    private double valorTotal;

    private Veiculo veiculo;
    private Motorista motorista;
    private Cliente cliente;

    // Chamado finalizado
    public Chamado(TipoChamado tipo, String data, String origem, String destino, String horaPartida, String horaChegada, double kmInicial, double kmFinal, Veiculo veiculo, Motorista motorista, Cliente cliente) {
        this.codigoChamado = contadorChamados++;
        this.tipo = tipo;
        this.data = data;
        this.origem = origem;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.horaChegada = horaChegada;
        this.kmInicial = kmInicial;
        this.kmFinal = kmFinal;
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.cliente = cliente;
        this.valorTotal = calcularValorTotal();
    }

    // Chamado não finalizado
    public Chamado(TipoChamado tipo, String data, String origem, String destino, String horaPartida, double kmInicial, Veiculo veiculo, Motorista motorista, Cliente cliente) {
        this.codigoChamado = contadorChamados++;
        this.tipo = tipo;
        this.data = data;
        this.origem = origem;
        this.destino = destino;
        this.horaPartida = horaPartida;
        this.horaChegada = " ";
        this.kmInicial = kmInicial;
        this.kmFinal = 0;
        this.veiculo = veiculo;
        this.motorista = motorista;
        this.cliente = cliente;
        this.valorTotal = 0.0;
    }

    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }
    public Motorista getMotorista() { return motorista; }
    public void setMotorista(Motorista motorista) { this.motorista = motorista; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public String getData() { return data; }
    public String getOrigem() { return origem; }
    public String getDestino() { return destino; }

    public void finalizarChamado(String horarioChegada, double kmFinal){
        this.horaChegada = horarioChegada;
        this.kmFinal = kmFinal;
        this.valorTotal = calcularValorTotal();
    }

    private boolean isFinalizado(){
        return kmFinal != 0 && !horaChegada.equals(" ");
    }

    private double calcularDistancia(){
        return this.kmFinal - this.kmInicial;
    }

    private double calcularValorTotal(){
        if (tipo == TipoChamado.CORRIDA) {
            return calcularDistancia() * 3.59;
        } else {
            return calcularDistancia() * 6.51;
        }
    }

    public void mostrarChamado(){
        System.out.println("-------------------------");
        System.out.println("Chamado: " + codigoChamado);
        System.out.println("Data: " + data);
        System.out.println("Tipo: " + tipo);
        System.out.println("Cliente: " + cliente.getNome() + " (CPF: " + cliente.getCpf() + ")");
        System.out.println("Motorista: " + motorista.getNome() + " (CNH: " + motorista.getCnh() + ")");
        System.out.println("Veículo: " + veiculo.getModelo() + " (Placa: " + veiculo.getPlaca() + ")");
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Partida: " + horaPartida);
        if (isFinalizado()){
            System.out.println("Chegada: " + horaChegada);
            System.out.printf("Distância: %.1f km\n", calcularDistancia());
            System.out.printf("Valor total: R$ %.2f\n", this.valorTotal);
        } else {
            System.out.println("Status: Aguardando finalização...");
        }
    }
}
