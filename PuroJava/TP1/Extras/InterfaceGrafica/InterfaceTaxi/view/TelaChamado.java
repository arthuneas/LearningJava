package TP1.Extras.InterfaceGrafica.InterfaceTaxi.view;

import TP1.Extras.InterfaceGrafica.InterfaceTaxi.model.*;
import TP1.Extras.InterfaceGrafica.InterfaceTaxi.database.BancoDados;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class TelaChamado {

    private JFrame frame;
    private JTextField txtData, txtOrigem, txtDestino, txtHoraPartida, txtKmInicial;
    private JPanel rbCorrida, rbViagem;         // custom radio panels
    private boolean isCorrida = true;
    private JComboBox<String> cbClientes, cbMotoristas, cbVeiculos;
    private JButton btnSalvar, btnAlterar, btnExcluir, btnPesquisar;

    // Paleta
    private static final Color BG_PAGE    = new Color(0xF5F5F3);
    private static final Color BG_CARD    = Color.WHITE;
    private static final Color BG_PRIMARY = new Color(0x1D9E75);
    private static final Color BG_HOVER   = new Color(0x0F6E56);
    private static final Color TEXT_MAIN  = new Color(0x1A1A1A);
    private static final Color TEXT_MUTED = new Color(0x6B6B68);
    private static final Color BORDER     = new Color(0xDDDDDA);
    private static final Color DANGER_FG  = new Color(0xA32D2D);
    private static final Color DANGER_BG  = new Color(0xFCEBEB);
    private static final Color RADIO_SEL  = new Color(0xE1F5EE);
    private static final Color RADIO_FG   = new Color(0x0F6E56);
    private static final Font  SANS_SM    = new Font("Segoe UI", Font.PLAIN, 12);
    private static final Font  SANS_MD    = new Font("Segoe UI", Font.PLAIN, 13);
    private static final Font  SANS_BOLD  = new Font("Segoe UI", Font.BOLD,  13);

    public TelaChamado() {
        frame = new JFrame("Registro de Chamado");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(BG_PAGE);

        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(BG_PAGE);
        root.setBorder(new EmptyBorder(24, 24, 24, 24));

        JPanel card = createCard();
        card.setLayout(new GridBagLayout());
        GridBagConstraints g = baseGbc();

        //Seção: Participantes
        addSectionLabel(card, g, "Participantes", 0);

        // Cliente
        g.gridy = 1; g.gridx = 0; g.weightx = 0; g.gridwidth = 1;
        card.add(createLabel("Cliente"), g);
        Vector<String> listaCli = new Vector<>();
        for (Cliente c : BancoDados.clientes)
            listaCli.add(c.getNome() + " (" + c.getCpf() + ")");
        cbClientes = createCombo(listaCli);
        g.gridx = 1; g.weightx = 1.0;
        card.add(cbClientes, g);

        // Motorista
        g.gridy = 2; g.gridx = 0; g.weightx = 0;
        card.add(createLabel("Motorista"), g);
        Vector<String> listaMot = new Vector<>();
        for (Motorista m : BancoDados.motoristas)
            listaMot.add(m.getNome());
        cbMotoristas = createCombo(listaMot);
        g.gridx = 1; g.weightx = 1.0;
        card.add(cbMotoristas, g);

        // Veículo
        g.gridy = 3; g.gridx = 0; g.weightx = 0;
        card.add(createLabel("Veículo"), g);
        Vector<String> listaVei = new Vector<>();
        for (Veiculo v : BancoDados.veiculos)
            listaVei.add(v.getModelo() + " – " + v.getPlaca());
        cbVeiculos = createCombo(listaVei);
        g.gridx = 1; g.weightx = 1.0;
        card.add(cbVeiculos, g);

        //Seção: Tipo de serviço
        g.gridx = 0; g.gridy = 4; g.gridwidth = 2;
        g.insets = new Insets(16, 8, 2, 8);
        addSectionLabel(card, g, "Tipo de serviço", 4);
        g.insets = new Insets(8, 8, 8, 8);

        g.gridy = 5; g.gridwidth = 2; g.weightx = 1.0;
        card.add(createRadioGroup(), g);

        //Seção: Detalhes
        addSectionLabel(card, g, "Detalhes", 6);

        g.gridy = 7; g.gridx = 0; g.weightx = 0; g.gridwidth = 1;
        card.add(createLabel("Data"), g);
        txtData = createField("DD/MM/AAAA");
        g.gridx = 1; g.weightx = 1.0;
        card.add(txtData, g);

        g.gridy = 8; g.gridx = 0; g.weightx = 0;
        card.add(createLabel("Hora de partida"), g);
        txtHoraPartida = createField("HH:MM");
        g.gridx = 1; g.weightx = 1.0;
        card.add(txtHoraPartida, g);

        g.gridy = 9; g.gridx = 0; g.weightx = 0;
        card.add(createLabel("Origem"), g);
        txtOrigem = createField("Endereço de origem");
        g.gridx = 1; g.weightx = 1.0;
        card.add(txtOrigem, g);

        g.gridy = 10; g.gridx = 0; g.weightx = 0;
        card.add(createLabel("Destino"), g);
        txtDestino = createField("Endereço de destino");
        g.gridx = 1; g.weightx = 1.0;
        card.add(txtDestino, g);

        g.gridy = 11; g.gridx = 0; g.weightx = 0;
        card.add(createLabel("Km inicial"), g);
        txtKmInicial = createField("0.0");
        g.gridx = 1; g.weightx = 1.0;
        card.add(txtKmInicial, g);

        // Separador + botões
        g.gridy = 12; g.gridx = 0; g.gridwidth = 2; g.weightx = 1.0;
        g.insets = new Insets(16, 0, 0, 0);
        card.add(createSeparator(), g);
        g.insets = new Insets(8, 8, 8, 8);

        g.gridy = 13;
        card.add(createButtonRow(), g);

        root.add(card, BorderLayout.CENTER);
        frame.add(root);
        frame.setPreferredSize(new Dimension(520, 620));
        frame.pack();
        frame.setLocationRelativeTo(null);
        configurarEventos();
        frame.setVisible(true);
    }

    // Eventos
    private void configurarEventos() {

        btnSalvar.addActionListener(e -> {
            try {
                if (cbClientes.getSelectedIndex() < 0) {
                    showWarn("Selecione um cliente."); return;
                }
                Cliente  cli  = BancoDados.clientes .get(cbClientes .getSelectedIndex());
                Motorista mot  = BancoDados.motoristas.get(cbMotoristas.getSelectedIndex());
                Veiculo   vei  = BancoDados.veiculos  .get(cbVeiculos  .getSelectedIndex());

                TipoChamado tipo = isCorrida ? TipoChamado.CORRIDA : TipoChamado.VIAGEM;

                double kmIni = Double.parseDouble(
                        txtKmInicial.getText().trim().replace(',', '.'));

                Chamado novo = new Chamado(
                        tipo,
                        txtData.getText().trim(),
                        txtOrigem.getText().trim(),
                        txtDestino.getText().trim(),
                        txtHoraPartida.getText().trim(),
                        kmIni, vei, mot, cli);

                BancoDados.chamados.add(novo);
                novo.mostrarChamado();
                showSuccess("Chamado registrado com sucesso!");
                limpar();

            } catch (NumberFormatException ex) {
                showError("Km inicial inválido. Use apenas números (ex: 12345.6)");
            } catch (Exception ex) {
                showError("Erro ao salvar. Verifique todos os campos.");
            }
        });

        btnPesquisar.addActionListener(e -> {
            String data = txtData.getText().trim();
            if (data.isEmpty()) { showWarn("Digite uma data para pesquisar."); return; }

            StringBuilder sb = new StringBuilder("Chamados em " + data + ":\n\n");
            boolean achou = false;
            for (Chamado c : BancoDados.chamados) {
                if (data.equals(c.getData())) {
                    achou = true;
                    sb.append("• ")
                            .append(c.getCliente().getNome())
                            .append(" — ")
                            .append(c.getOrigem())
                            .append(" → ")
                            .append(c.getDestino())
                            .append("\n");
                }
            }
            if (achou) showInfo(sb.toString());
            else showInfo("Nenhum chamado encontrado nesta data.");
        });

        btnAlterar.addActionListener(e ->
                showInfo("Funcionalidade de alteração em desenvolvimento."));
        btnExcluir.addActionListener(e ->
                showInfo("Funcionalidade de exclusão em desenvolvimento."));
    }

    private void limpar() {
        txtData.setText("");
        txtOrigem.setText("");
        txtDestino.setText("");
        txtHoraPartida.setText("");
        txtKmInicial.setText("");
        if (cbClientes .getItemCount() > 0) cbClientes .setSelectedIndex(0);
        if (cbMotoristas.getItemCount() > 0) cbMotoristas.setSelectedIndex(0);
        if (cbVeiculos  .getItemCount() > 0) cbVeiculos  .setSelectedIndex(0);
        setRadio(true);
    }

    //Radio group customizado
    private JPanel createRadioGroup() {
        JPanel wrapper = new JPanel(new GridLayout(1, 2, 1, 0));
        wrapper.setBackground(BORDER);
        wrapper.setBorder(new LineBorder(BORDER, 1, true));

        rbCorrida = createRadioOption("Corrida",  true);
        rbViagem  = createRadioOption("Viagem",   false);
        wrapper.add(rbCorrida);
        wrapper.add(rbViagem);
        wrapper.setPreferredSize(new Dimension(0, 34));
        wrapper.setMaximumSize(new Dimension(Integer.MAX_VALUE, 34));
        return wrapper;
    }

    private JPanel createRadioOption(String label, boolean selected) {
        JPanel p = new JPanel(new BorderLayout());
        JLabel l = new JLabel(label, SwingConstants.CENTER);
        l.setFont(SANS_MD);
        p.add(l);
        p.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        applyRadioStyle(p, l, selected);

        p.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                setRadio(label.equals("Corrida"));
            }
        });
        return p;
    }

    private void setRadio(boolean corrida) {
        isCorrida = corrida;
        applyRadioStyle(rbCorrida,
                (JLabel) rbCorrida.getComponent(0), corrida);
        applyRadioStyle(rbViagem,
                (JLabel) rbViagem.getComponent(0), !corrida);
    }

    private void applyRadioStyle(JPanel p, JLabel l, boolean selected) {
        p.setBackground(selected ? RADIO_SEL : BG_CARD);
        l.setForeground(selected ? RADIO_FG : TEXT_MUTED);
        l.setFont(selected ? SANS_BOLD : SANS_MD);
    }

    //Helpers de UI (reutilizados de TelaCliente)
    private JPanel createCard() {
        JPanel p = new JPanel();
        p.setBackground(BG_CARD);
        p.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(BORDER, 1, true),
                new EmptyBorder(20, 20, 20, 20)));
        return p;
    }

    private GridBagConstraints baseGbc() {
        GridBagConstraints g = new GridBagConstraints();
        g.insets = new Insets(8, 8, 8, 8);
        g.anchor = GridBagConstraints.WEST;
        g.fill   = GridBagConstraints.HORIZONTAL;
        return g;
    }

    private JLabel createLabel(String text) {
        JLabel l = new JLabel(text);
        l.setFont(SANS_SM);
        l.setForeground(TEXT_MUTED);
        return l;
    }

    private JTextField createField(String placeholder) {
        JTextField f = new JTextField(18);
        f.setFont(SANS_MD);
        f.setForeground(TEXT_MUTED);
        f.setCaretColor(BG_PRIMARY);
        f.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(BORDER, 1, true),
                new EmptyBorder(0, 8, 0, 8)));
        f.setPreferredSize(new Dimension(0, 34));
        f.setText(placeholder);
        f.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (f.getText().equals(placeholder)) {
                    f.setText(""); f.setForeground(TEXT_MAIN);
                }
            }
            public void focusLost(FocusEvent e) {
                if (f.getText().isEmpty()) {
                    f.setText(placeholder); f.setForeground(TEXT_MUTED);
                }
            }
        });
        return f;
    }

    private JComboBox<String> createCombo(Vector<String> items) {
        JComboBox<String> cb = new JComboBox<>(items);
        cb.setFont(SANS_MD);
        cb.setPreferredSize(new Dimension(0, 34));
        cb.setBorder(new LineBorder(BORDER, 1, true));
        return cb;
    }

    private void addSectionLabel(JPanel p, GridBagConstraints g,
                                 String text, int row) {
        JLabel l = new JLabel(text.toUpperCase());
        l.setFont(new Font("Segoe UI", Font.BOLD, 10));
        l.setForeground(TEXT_MUTED);
        GridBagConstraints copy = (GridBagConstraints) g.clone();
        copy.gridx = 0; copy.gridy = row; copy.gridwidth = 2;
        copy.weightx = 1.0;
        copy.insets = new Insets(12, 8, 2, 8);
        p.add(l, copy);
    }

    private JSeparator createSeparator() {
        JSeparator sep = new JSeparator();
        sep.setForeground(BORDER);
        return sep;
    }

    private JPanel createButtonRow() {
        JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT, 6, 0));
        row.setBackground(BG_CARD);

        btnSalvar    = createBtn("Salvar",            BG_PRIMARY, Color.WHITE, BG_HOVER);
        btnAlterar   = createBtn("Alterar",           BG_CARD,    TEXT_MAIN,  new Color(0xEEEEEC));
        btnExcluir   = createBtn("Excluir",           DANGER_BG,  DANGER_FG,  new Color(0xF7C1C1));
        btnPesquisar = createBtn("Pesquisar por data",BG_CARD,    TEXT_MUTED, new Color(0xEEEEEC));

        row.add(btnSalvar);
        row.add(btnAlterar);
        row.add(btnExcluir);

        JPanel right = new JPanel(new FlowLayout(FlowLayout.RIGHT, 0, 0));
        right.setBackground(BG_CARD);
        right.add(btnPesquisar);

        JPanel wrapper = new JPanel(new BorderLayout());
        wrapper.setBackground(BG_CARD);
        wrapper.add(row, BorderLayout.WEST);
        wrapper.add(right, BorderLayout.EAST);
        return wrapper;
    }

    private JButton createBtn(String label, Color bg, Color fg, Color hover) {
        JButton b = new JButton(label) {
            @Override protected void paintComponent(Graphics g2) {
                Graphics2D g = (Graphics2D) g2.create();
                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                g.setColor(getModel().isRollover() ? hover : bg);
                g.fillRoundRect(0, 0, getWidth(), getHeight(), 8, 8);
                g.dispose();
                super.paintComponent(g2);
            }
        };
        b.setFont(SANS_BOLD);
        b.setForeground(fg);
        b.setBackground(bg);
        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setBorderPainted(false);
        b.setFocusPainted(false);
        b.setBorder(new EmptyBorder(6, 14, 6, 14));
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        return b;
    }

    private void showSuccess(String m) {
        JOptionPane.showMessageDialog(frame, m, "Sucesso",    JOptionPane.INFORMATION_MESSAGE); }
    private void showWarn(String m) {
        JOptionPane.showMessageDialog(frame, m, "Atenção",    JOptionPane.WARNING_MESSAGE); }
    private void showError(String m) {
        JOptionPane.showMessageDialog(frame, m, "Erro",       JOptionPane.ERROR_MESSAGE); }
    private void showInfo(String m) {
        JOptionPane.showMessageDialog(frame, m, "Informação", JOptionPane.INFORMATION_MESSAGE); }
}
