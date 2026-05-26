package TP1.Extras.InterfaceGrafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaCliente {

    public static void main(String[] args) {
        // 1. Cria a janela principal
        JFrame frame = new JFrame("Minha Primeira Tela");
        frame.setSize(400, 300); // Define a largura e altura
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fecha o programa ao fechar a janela
        frame.setLayout(null); // Define layout livre

        // 2. Cria um botão
        JButton salvar = new JButton("Salvar");
        salvar.setBounds(30, 170, 80, 28); // Define a posição (x, y) e o tamanho (largura, altura)

        JButton excluir = new JButton("Excluir");
        excluir.setBounds(30, 210, 80, 28);

        JButton alterar = new JButton("Alterar");
        alterar.setBounds(130, 170, 220, 28);

        JButton pesquisar = new JButton("Pesquisar");
        pesquisar.setBounds(130, 210, 220, 28);

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
        frame.setVisible(true);
    }

}
