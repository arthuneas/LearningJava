package TP1.Extras.InterfaceGrafica.InterfaceTaxi.view;

import TP1.Extras.InterfaceGrafica.InterfaceTaxi.model.*;
import TP1.Extras.InterfaceGrafica.InterfaceTaxi.database.BancoDados;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class TelaCliente {

    private JFrame frame;
    private JTextField txtCpf, txtNome;
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
    private static final Font  SANS_SM    = new Font("Segoe UI", Font.PLAIN, 12);
    private static final Font  SANS_MD    = new Font("Segoe UI", Font.PLAIN, 13);
    private static final Font  SANS_BOLD  = new Font("Segoe UI", Font.BOLD,  13);

    public TelaCliente() {
        frame = new JFrame("Cadastro de Cliente");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setBackground(BG_PAGE);

        // Layout raiz
        JPanel root = new JPanel(new BorderLayout());
        root.setBackground(BG_PAGE);
        root.setBorder(new EmptyBorder(24, 24, 24, 24));

        // Card central
        JPanel card = createCard();
        card.setLayout(new GridBagLayout());
        GridBagConstraints g = baseGbc();

        // Título da seção
        addSectionLabel(card, g, "Dados do cliente", 0);

        // CPF
        g.gridx = 0; g.gridy = 1; g.weightx = 0; g.gridwidth = 1;
        card.add(createLabel("CPF"), g);
        g.gridx = 1; g.weightx = 1.0;
        txtCpf = createField("000.000.000-00");
        card.add(txtCpf, g);

        // Nome
        g.gridx = 0; g.gridy = 2; g.weightx = 0;
        card.add(createLabel("Nome completo"), g);
        g.gridx = 1; g.weightx = 1.0;
        txtNome = createField("Nome do cliente");
        card.add(txtNome, g);

        // Separador
        g.gridx = 0; g.gridy = 3; g.gridwidth = 2; g.weightx = 1.0;
        g.insets = new Insets(16, 0, 0, 0);
        card.add(createSeparator(), g);
        g.insets = new Insets(8, 8, 8, 8);

        // Botões
        g.gridy = 4;
        card.add(createButtonRow(), g);

        root.add(card, BorderLayout.CENTER);
        frame.add(root);
        frame.setPreferredSize(new Dimension(480, 260));
        frame.pack();
        frame.setLocationRelativeTo(null);
        configurarEventos();
        frame.setVisible(true);
    }

    // Eventos
    private void configurarEventos() {

        btnSalvar.addActionListener(e -> {
            String cpf  = txtCpf.getText().trim();
            String nome = txtNome.getText().trim();

            if (cpf.isEmpty() || nome.isEmpty()) {
                showWarn("Preencha todos os campos.");
                return;
            }
            for (Cliente c : BancoDados.clientes) {
                if (c.getCpf().equals(cpf)) {
                    showError("Já existe um cliente cadastrado com este CPF.");
                    return;
                }
            }
            BancoDados.clientes.add(new Cliente(cpf, nome));
            showSuccess("Cliente cadastrado com sucesso!");
            limpar();
        });

        btnPesquisar.addActionListener(e -> {
            String cpf = txtCpf.getText().trim();
            if (cpf.isEmpty()) { showWarn("Digite o CPF para pesquisar."); return; }
            for (Cliente c : BancoDados.clientes) {
                if (c.getCpf().equals(cpf)) { txtNome.setText(c.getNome()); return; }
            }
            showInfo("Nenhum cliente encontrado com este CPF.");
        });

        btnAlterar.addActionListener(e -> {
            String cpf  = txtCpf.getText().trim();
            String nome = txtNome.getText().trim();
            for (Cliente c : BancoDados.clientes) {
                if (c.getCpf().equals(cpf)) {
                    c.setNome(nome);
                    showSuccess("Dados atualizados com sucesso!");
                    return;
                }
            }
            showWarn("Pesquise um CPF válido antes de alterar.");
        });

        btnExcluir.addActionListener(e -> {
            String cpf = txtCpf.getText().trim();
            for (Cliente c : BancoDados.clientes) {
                if (c.getCpf().equals(cpf)) {
                    BancoDados.clientes.remove(c);
                    showSuccess("Cliente removido.");
                    limpar();
                    return;
                }
            }
            showError("Cliente não encontrado.");
        });
    }

    private void limpar() {
        txtCpf.setText(""); txtNome.setText("");
    }

    // Helpers de UI
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
        f.setForeground(TEXT_MAIN);
        f.setCaretColor(BG_PRIMARY);
        f.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(BORDER, 1, true),
                new EmptyBorder(0, 8, 0, 8)));
        f.setPreferredSize(new Dimension(0, 34));
        // Placeholder simples via FocusListener
        f.setForeground(TEXT_MUTED);
        f.setText(placeholder);
        f.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (f.getText().equals(placeholder)) { f.setText(""); f.setForeground(TEXT_MAIN); }
            }
            public void focusLost(FocusEvent e) {
                if (f.getText().isEmpty()) { f.setText(placeholder); f.setForeground(TEXT_MUTED); }
            }
        });
        return f;
    }

    private void addSectionLabel(JPanel p, GridBagConstraints g, String text, int row) {
        JLabel l = new JLabel(text.toUpperCase());
        l.setFont(new Font("Segoe UI", Font.BOLD, 10));
        l.setForeground(TEXT_MUTED);
        g.gridx = 0; g.gridy = row; g.gridwidth = 2; g.weightx = 1.0;
        g.insets = new Insets(0, 8, 4, 8);
        p.add(l, g);
        g.gridwidth = 1;
        g.insets = new Insets(8, 8, 8, 8);
    }

    private JSeparator createSeparator() {
        JSeparator sep = new JSeparator();
        sep.setForeground(BORDER);
        return sep;
    }

    private JPanel createButtonRow() {
        JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT, 6, 0));
        row.setBackground(BG_CARD);

        btnSalvar    = createBtn("Salvar",        BG_PRIMARY, Color.WHITE, BG_HOVER);
        btnAlterar   = createBtn("Alterar",       BG_CARD,    TEXT_MAIN,  new Color(0xEEEEEC));
        btnExcluir   = createBtn("Excluir",       DANGER_BG,  DANGER_FG,  new Color(0xF7C1C1));
        btnPesquisar = createBtn("Pesquisar CPF", BG_CARD,    TEXT_MUTED, new Color(0xEEEEEC));

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
                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
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

    // Diálogos 
    private void showSuccess(String msg) {
        JOptionPane.showMessageDialog(frame, msg, "Sucesso",      JOptionPane.INFORMATION_MESSAGE);
    }
    private void showWarn(String msg) {
        JOptionPane.showMessageDialog(frame, msg, "Atenção",      JOptionPane.WARNING_MESSAGE);
    }
    private void showError(String msg) {
        JOptionPane.showMessageDialog(frame, msg, "Erro",         JOptionPane.ERROR_MESSAGE);
    }
    private void showInfo(String msg) {
        JOptionPane.showMessageDialog(frame, msg, "Informação",   JOptionPane.INFORMATION_MESSAGE);
    }
}
