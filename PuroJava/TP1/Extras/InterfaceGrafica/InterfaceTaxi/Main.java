package TP1.Extras.InterfaceGrafica.InterfaceTaxi;

import TP1.Extras.InterfaceGrafica.InterfaceTaxi.view.TelaCliente;
import TP1.Extras.InterfaceGrafica.InterfaceTaxi.view.TelaChamado;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        // Define o visual (Look and Feel) para combinar com o Sistema Operacional do usuário
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println("Não foi possível aplicar o estilo do sistema.");
        }

        JFrame menuPrincipal = new JFrame("Sistema de Gestão de Táxi");
        menuPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel base com layout centralizado
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        painel.setBorder(new EmptyBorder(30, 40, 30, 40)); // Margens grandes

        JLabel lblTitulo = new JLabel("Painel de Controle");
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lblTitulo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton btnAbrirClientes = new JButton("Gerenciar Clientes");
        btnAbrirClientes.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnAbrirClientes.setPreferredSize(new Dimension(220, 40));
        btnAbrirClientes.setMaximumSize(new Dimension(220, 40));

        JButton btnAbrirChamados = new JButton("Registrar / Buscar Chamados");
        btnAbrirChamados.setAlignmentX(Component.CENTER_ALIGNMENT);
        btnAbrirChamados.setPreferredSize(new Dimension(220, 40));
        btnAbrirChamados.setMaximumSize(new Dimension(220, 40));

        painel.add(lblTitulo);
        painel.add(Box.createRigidArea(new Dimension(0, 25))); // Espaço vertical
        painel.add(btnAbrirClientes);
        painel.add(Box.createRigidArea(new Dimension(0, 15))); // Espaço vertical
        painel.add(btnAbrirChamados);

        menuPrincipal.add(painel);
        menuPrincipal.pack(); // Ajusta a janela ao tamanho perfeito dos componentes
        menuPrincipal.setLocationRelativeTo(null); // Centraliza na tela
        menuPrincipal.setVisible(true);

        // Ações dos botões
        btnAbrirClientes.addActionListener(e -> new TelaCliente());
        btnAbrirChamados.addActionListener(e -> new TelaChamado());
    }

}
