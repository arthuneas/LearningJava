package TP1.Extras.InterfaceGrafica.Sistema;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

class Cliente {
    private String cpf;
    private String nome;

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}

class Motorista {
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

class Veiculo {
    private String modelo;
    private String placa;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Placa: " + placa;
    }
}

enum TipoChamado {
    CORRIDA, VIAGEM
}

class Chamado {
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

// ==========================================
// BANCO DE DADOS EM MEMÓRIA
// ==========================================

class BancoDados {
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


//INTERFACES GRÁFICAS
class TelaCliente {
    private JFrame frame;
    private JTextField txtCpf, txtNome;
    private JButton btnSalvar, btnAlterar, btnExcluir, btnPesquisar;

    public TelaCliente() {
        frame = new JFrame("Cadastro de Cliente");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Painel Principal com bordas de respiro
        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Formulário (Centro) usando GridBagLayout para alinhamento perfeito
        JPanel painelFormulario = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Espaçamento entre os itens
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0; gbc.gridy = 0;
        painelFormulario.add(new JLabel("CPF:"), gbc);

        gbc.gridx = 1; gbc.gridy = 0; gbc.weightx = 1.0;
        txtCpf = new JTextField(15);
        painelFormulario.add(txtCpf, gbc);

        gbc.gridx = 0; gbc.gridy = 1; gbc.weightx = 0;
        painelFormulario.add(new JLabel("Nome:"), gbc);

        gbc.gridx = 1; gbc.gridy = 1; gbc.weightx = 1.0;
        txtNome = new JTextField(15);
        painelFormulario.add(txtNome, gbc);

        // Botões (Sul) organizados em FlowLayout
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnSalvar = new JButton("Salvar");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnPesquisar = new JButton("Pesquisar CPF");

        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnAlterar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnPesquisar);

        // Montando a tela
        painelPrincipal.add(painelFormulario, BorderLayout.CENTER);
        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);

        frame.add(painelPrincipal);
        frame.pack(); // Ajusta o tamanho da janela automaticamente baseado no conteúdo
        frame.setLocationRelativeTo(null); // Centraliza na tela
        configurarEventos();
        frame.setVisible(true);
    }

    private void configurarEventos() {
        btnSalvar.addActionListener(e -> {
            String cpf = txtCpf.getText().trim();
            String nome = txtNome.getText().trim();

            if (cpf.isEmpty() || nome.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Preencha todos os campos!", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }

            for (Cliente c : BancoDados.clientes) {
                if (c.getCpf().equals(cpf)) {
                    JOptionPane.showMessageDialog(frame, "Erro: Cliente com este CPF já cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            BancoDados.clientes.add(new Cliente(cpf, nome));
            JOptionPane.showMessageDialog(frame, "Cliente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        });

        btnPesquisar.addActionListener(e -> {
            String cpfBusca = txtCpf.getText().trim();
            if (cpfBusca.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Digite o CPF no campo para pesquisar.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }

            for (Cliente c : BancoDados.clientes) {
                if (c.getCpf().equals(cpfBusca)) {
                    txtNome.setText(c.getNome());
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Cliente não encontrado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        });

        btnAlterar.addActionListener(e -> {
            String cpf = txtCpf.getText().trim();
            String novoNome = txtNome.getText().trim();

            for (Cliente c : BancoDados.clientes) {
                if (c.getCpf().equals(cpf)) {
                    c.setNome(novoNome);
                    JOptionPane.showMessageDialog(frame, "Dados do cliente atualizados!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Pesquise ou insira um CPF válido para alterar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        });

        btnExcluir.addActionListener(e -> {
            String cpf = txtCpf.getText().trim();

            for (Cliente c : BancoDados.clientes) {
                if (c.getCpf().equals(cpf)) {
                    BancoDados.clientes.remove(c);
                    JOptionPane.showMessageDialog(frame, "Cliente removido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    limparCampos();
                    return;
                }
            }
            JOptionPane.showMessageDialog(frame, "Cliente não encontrado para exclusão.", "Erro", JOptionPane.ERROR_MESSAGE);
        });
    }

    private void limparCampos() {
        txtCpf.setText("");
        txtNome.setText("");
    }
}

class TelaChamado {
    private JFrame frame;
    private JTextField txtData, txtOrigem, txtDestino, txtHoraPartida, txtKmInicial;
    private JRadioButton rbCorrida, rbViagem;
    private JComboBox<String> cbClientes, cbMotoristas, cbVeiculos;
    private JButton btnSalvar, btnAlterar, btnExcluir, btnPesquisar;

    public TelaChamado() {
        frame = new JFrame("Registro de Chamado de Táxi");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel painelPrincipal = new JPanel(new BorderLayout(10, 10));
        painelPrincipal.setBorder(new EmptyBorder(20, 20, 20, 20));

        // Formulário com GridBagLayout
        JPanel painelFormulario = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;

        int linha = 0;

        // ComboBoxes
        gbc.gridx = 0; gbc.gridy = linha; painelFormulario.add(new JLabel("Cliente:"), gbc);
        Vector<String> listaCli = new Vector<>();
        for (Cliente c : BancoDados.clientes) listaCli.add(c.getNome() + " (" + c.getCpf() + ")");
        cbClientes = new JComboBox<>(listaCli);
        gbc.gridx = 1; gbc.gridy = linha++; gbc.weightx = 1.0; painelFormulario.add(cbClientes, gbc);

        gbc.gridx = 0; gbc.gridy = linha; gbc.weightx = 0; painelFormulario.add(new JLabel("Motorista:"), gbc);
        Vector<String> listaMot = new Vector<>();
        for (Motorista m : BancoDados.motoristas) listaMot.add(m.getNome());
        cbMotoristas = new JComboBox<>(listaMot);
        gbc.gridx = 1; gbc.gridy = linha++; gbc.weightx = 1.0; painelFormulario.add(cbMotoristas, gbc);

        gbc.gridx = 0; gbc.gridy = linha; gbc.weightx = 0; painelFormulario.add(new JLabel("Veículo:"), gbc);
        Vector<String> listaVei = new Vector<>();
        for (Veiculo v : BancoDados.veiculos) listaVei.add(v.getModelo() + " - " + v.getPlaca());
        cbVeiculos = new JComboBox<>(listaVei);
        gbc.gridx = 1; gbc.gridy = linha++; gbc.weightx = 1.0; painelFormulario.add(cbVeiculos, gbc);

        // Radio Buttons
        gbc.gridx = 0; gbc.gridy = linha; gbc.weightx = 0; painelFormulario.add(new JLabel("Tipo:"), gbc);
        JPanel painelRadios = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        rbCorrida = new JRadioButton("Corrida", true);
        rbViagem = new JRadioButton("Viagem");
        ButtonGroup grupoTipo = new ButtonGroup();
        grupoTipo.add(rbCorrida); grupoTipo.add(rbViagem);
        painelRadios.add(rbCorrida);
        painelRadios.add(Box.createRigidArea(new Dimension(20, 0))); // Espaço entre os radios
        painelRadios.add(rbViagem);
        gbc.gridx = 1; gbc.gridy = linha++; gbc.weightx = 1.0; painelFormulario.add(painelRadios, gbc);

        // Campos de Texto
        gbc.gridx = 0; gbc.gridy = linha; gbc.weightx = 0; painelFormulario.add(new JLabel("Data:"), gbc);
        txtData = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = linha++; gbc.weightx = 1.0; painelFormulario.add(txtData, gbc);

        gbc.gridx = 0; gbc.gridy = linha; gbc.weightx = 0; painelFormulario.add(new JLabel("Origem:"), gbc);
        txtOrigem = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = linha++; gbc.weightx = 1.0; painelFormulario.add(txtOrigem, gbc);

        gbc.gridx = 0; gbc.gridy = linha; gbc.weightx = 0; painelFormulario.add(new JLabel("Destino:"), gbc);
        txtDestino = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = linha++; gbc.weightx = 1.0; painelFormulario.add(txtDestino, gbc);

        gbc.gridx = 0; gbc.gridy = linha; gbc.weightx = 0; painelFormulario.add(new JLabel("Hora Partida:"), gbc);
        txtHoraPartida = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = linha++; gbc.weightx = 1.0; painelFormulario.add(txtHoraPartida, gbc);

        gbc.gridx = 0; gbc.gridy = linha; gbc.weightx = 0; painelFormulario.add(new JLabel("Km Inicial:"), gbc);
        txtKmInicial = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = linha; gbc.weightx = 1.0; painelFormulario.add(txtKmInicial, gbc);

        // Botões
        JPanel painelBotoes = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnSalvar = new JButton("Salvar");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");
        btnPesquisar = new JButton("Pesquisar por Data");

        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnAlterar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnPesquisar);

        // Montando a tela
        painelPrincipal.add(painelFormulario, BorderLayout.CENTER);
        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);

        frame.add(painelPrincipal);
        frame.pack(); // Dimensiona a janela perfeitamente com base nos itens
        frame.setLocationRelativeTo(null); // Centraliza
        configurarEventos();
        frame.setVisible(true);
    }

    private void configurarEventos() {
        btnSalvar.addActionListener(e -> {
            try {
                if(cbClientes.getSelectedIndex() == -1) {
                    JOptionPane.showMessageDialog(frame, "Nenhum cliente selecionado.", "Aviso", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                Cliente cli = BancoDados.clientes.get(cbClientes.getSelectedIndex());
                Motorista mot = BancoDados.motoristas.get(cbMotoristas.getSelectedIndex());
                Veiculo vei = BancoDados.veiculos.get(cbVeiculos.getSelectedIndex());

                TipoChamado tipo = rbCorrida.isSelected() ? TipoChamado.CORRIDA : TipoChamado.VIAGEM;
                String data = txtData.getText();
                String origem = txtOrigem.getText();
                String destino = txtDestino.getText();
                String partida = txtHoraPartida.getText();
                double kmIni = Double.parseDouble(txtKmInicial.getText());

                Chamado novoChamado = new Chamado(tipo, data, origem, destino, partida, kmIni, vei, mot, cli);
                BancoDados.chamados.add(novoChamado);

                JOptionPane.showMessageDialog(frame, "Chamado registrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                novoChamado.mostrarChamado(); // Exibe logs no console
                limparCampos();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Erro na inserção de dados. Verifique os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnPesquisar.addActionListener(e -> {
            String dataBusca = txtData.getText().trim();
            if(dataBusca.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Insira uma data no campo para pesquisar.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }

            StringBuilder resultado = new StringBuilder("Chamados encontrados para " + dataBusca + ":\n\n");
            boolean achou = false;

            for(Chamado c : BancoDados.chamados) {
                if(c.getData() != null && c.getData().equals(dataBusca)) {
                    achou = true;
                    resultado.append("• Cliente: ").append(c.getCliente().getNome())
                            .append(" | Origem: ").append(c.getOrigem())
                            .append("\n");
                }
            }

            if(achou) {
                JOptionPane.showMessageDialog(frame, resultado.toString(), "Resultados", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "Nenhum chamado localizado nesta data.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btnAlterar.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Lógica para alteração em desenvolvimento."));
        btnExcluir.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Lógica para exclusão em desenvolvimento."));
    }

    private void limparCampos() {
        txtData.setText("");
        txtOrigem.setText("");
        txtDestino.setText("");
        txtHoraPartida.setText("");
        txtKmInicial.setText("");
        cbClientes.setSelectedIndex(0);
        cbMotoristas.setSelectedIndex(0);
        cbVeiculos.setSelectedIndex(0);
        rbCorrida.setSelected(true);
    }
}

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