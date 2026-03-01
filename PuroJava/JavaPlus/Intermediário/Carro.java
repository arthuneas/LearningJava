package JavaPlus.Intermediário;

public record Carro(String modelo, String cor, int ano, String Placa) {
    /*
    num record, ele é uma classe com os getters já definidos, mas
    seus valores são fixos. então,é uma classe imutável.
    voce pode usar nomedaclasse.nomedavariavel();

    usados em
    DTOs => data transfer objects, dados devem ser imutaveis.

     */
}
