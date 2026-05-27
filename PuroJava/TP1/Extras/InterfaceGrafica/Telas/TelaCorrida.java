package TP1.Extras.InterfaceGrafica.Telas;

import javax.swing.*;

public class TelaCorrida {

    public TelaCorrida() {
        JFrame frame = new JFrame("Cadastro de Corrida");
        frame.setSize(450, 480); // Aumentei um pouquinho a altura para caber tudo com folga
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // --- LABELS E CAMPOS ---

        JLabel clienteLabel = new JLabel("Cliente:");
        clienteLabel.setBounds(30, 20, 100, 25);
        JTextField clienteField = new JTextField(20);
        clienteField.setBounds(150, 20, 280, 25);

        JLabel motoristaLabel = new JLabel("Motorista:");
        motoristaLabel.setBounds(30, 60, 100, 25);
        JComboBox<String> motoristaComboBox = new JComboBox<>(new String[]{"Motorista 1", "Motorista 2", "Motorista 3"});
        motoristaComboBox.setBounds(150, 60, 280, 25);

        JLabel veiculoLabel = new JLabel("Veículo:");
        veiculoLabel.setBounds(30, 100, 100, 25);
        JComboBox<String> veiculoComboBox = new JComboBox<>(new String[]{"Veículo 1", "Veículo 2", "Veículo 3"});
        veiculoComboBox.setBounds(150, 100, 280, 25);

        JLabel tipoLabel = new JLabel("Tipo:");
        tipoLabel.setBounds(30, 140, 100, 25);
        JRadioButton tipo1 = new JRadioButton("Corrida");
        tipo1.setBounds(150, 140, 90, 25);
        JRadioButton tipo2 = new JRadioButton("Viagem");
        tipo2.setBounds(150, 180, 90, 25);

        ButtonGroup group = new ButtonGroup();
        group.add(tipo1);
        group.add(tipo2);

        JLabel dataLabel = new JLabel("Data:");
        dataLabel.setBounds(30, 230, 100, 25);
        JTextField dataCorridaField = new JTextField(20);
        dataCorridaField.setBounds(150, 230, 280, 25);

        JLabel horarioLabel = new JLabel("Horário:");
        horarioLabel.setBounds(30, 270, 100, 25);
        JTextField horario = new JTextField(20);
        horario.setBounds(150, 270, 280, 25);

        JLabel kmLabel = new JLabel("Quilometros:");
        kmLabel.setBounds(30, 310, 100, 25);
        JTextField quilometragemField = new JTextField(20);
        quilometragemField.setBounds(150, 310, 280, 25);

        // --- BOTÕES ---

        JButton salvar = new JButton("Salvar");
        salvar.setBounds(20, 360, 120, 35);

        JButton excluir = new JButton("Excluir");
        excluir.setBounds(20, 400, 120, 35);

        JButton alterar = new JButton("Alterar");
        alterar.setBounds(150, 360, 280, 35);

        JButton pesquisar = new JButton("Pesquisar");
        pesquisar.setBounds(150, 400, 280, 35);

        // --- ADICIONANDO TUDO AO FRAME ---

        frame.add(clienteLabel);
        frame.add(clienteField);

        frame.add(motoristaLabel);
        frame.add(motoristaComboBox);

        frame.add(veiculoLabel);
        frame.add(veiculoComboBox);

        frame.add(tipoLabel);
        frame.add(tipo1);
        frame.add(tipo2);

        frame.add(dataLabel);
        frame.add(dataCorridaField);

        frame.add(horarioLabel);
        frame.add(horario);

        frame.add(kmLabel);
        frame.add(quilometragemField);

        frame.add(salvar);
        frame.add(excluir);
        frame.add(alterar);
        frame.add(pesquisar);

        frame.setVisible(true);
    }
}