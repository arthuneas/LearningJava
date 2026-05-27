package TP1.Extras.InterfaceGrafica.InterfaceTaxi.database;

import TP1.Extras.InterfaceGrafica.InterfaceTaxi.model.*;
import java.util.ArrayList;
import java.util.List;

public class BancoDados {

    public static List<Cliente> clientes = new ArrayList<>();
    public static List<Motorista> motoristas = new ArrayList<>();
    public static List<Veiculo> veiculos = new ArrayList<>();
    public static List<Chamado> chamados = new ArrayList<>();

    static {
        clientes.add(new Cliente("12345678901", "João da Silva Santos"));
        clientes.add(new Cliente("98765432100", "Maria"));
        clientes.add(new Cliente("55544433322", "Carlos"));

        motoristas.add(new Motorista("Carlos Silva", "1234567890"));
        motoristas.add(new Motorista("José Souza", "0987654321"));
        motoristas.add(new Motorista("Ana Costa", "1122334455"));

        veiculos.add(new Veiculo("Fiat Uno", "ABC1D23"));
        veiculos.add(new Veiculo("Volkswagen Gol", "XYZ9A87"));
        veiculos.add(new Veiculo("Chevrolet Onix", "LMN5P32"));

        chamados.add(new Chamado(TipoChamado.CORRIDA, "01/05/2025", "Asa Norte", "Asa Sul", "14:00", "14:30", 1000, 1010, veiculos.get(0), motoristas.get(0), clientes.get(0)));
    }

}
