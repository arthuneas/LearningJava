package TP1.Extras.InterfaceGrafica.Introdução;

import javax.swing.*;

public class TelaCliente {

    public TelaCliente(){
        // 1. Cria a janela principal
        JFrame frame = new JFrame("Cadastro de Cliente");
            frame.setSize(400,300); // Define a largura e altura
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao fechar a janela
            frame.setLayout(null); // Define layout livre

        // 2. Cria um botão
        JButton salvar = new JButton("Salvar");
            salvar.setBounds(30,175,80,33); // Define a posição (x, y) e o tamanho (largura, altura)

        JButton excluir = new JButton("Excluir");
            excluir.setBounds(30,215,80,33);

        JButton alterar = new JButton("Alterar");
            alterar.setBounds(130,175,220,33);

        JButton pesquisar = new JButton("Pesquisar");
            pesquisar.setBounds(130,215,220,33);

        //adicionar campos de texto, labels, etc.]
        JTextField nome = new JTextField();
            nome.setBounds(130,30,220,28);

        JTextField CPF = new JTextField();
            CPF.setBounds(130,65,220,28);

        JTextField telefone = new JTextField();
            telefone.setBounds(130,100,220,28);

        JTextField endereco = new JTextField();
            endereco.setBounds(130,135,220,28);

        JLabel nomeLabel = new JLabel("Nome:");
            nomeLabel.setBounds(35,30,80,28);

        JLabel CPFLabel = new JLabel("CPF:");
            CPFLabel.setBounds(35,65,80,28);

        JLabel telefoneLabel = new JLabel("Telefone:");
            telefoneLabel.setBounds(35,100,80,28);

        JLabel enderecoLabel = new JLabel("Endereço:");
            enderecoLabel.setBounds(35,135,80,28);

        // 3. Adiciona um evento de clique no botão
            /*
            botao.addActionListener(e -> {
                JOptionPane.showMessageDialog(frame, "Você clicou no botão!");
            });
            */

        // 4. Adiciona o botão na janela e torna a janela visível
        frame.add(salvar);
        frame.add(excluir);
        frame.add(alterar);
        frame.add(pesquisar);
        frame.add(nome);
        frame.add(CPF);
        frame.add(telefone);
        frame.add(endereco);
        frame.add(nomeLabel);
        frame.add(CPFLabel);
        frame.add(telefoneLabel);
        frame.add(enderecoLabel);
        frame.setVisible(true);

    }
}
