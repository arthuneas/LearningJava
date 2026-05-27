package TP1.Extras.InterfaceGrafica.InterfaceTaxi.model;

public class Motorista {
    private String nome;
    private String cnh;

    public Motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCnh() { return cnh; }
    public void setCnh(String cnh) { this.cnh = cnh; }

    @Override
    public String toString() {
        return "Motorista{nome='" + nome + "', cnh='" + cnh + "'}";
    }

}
