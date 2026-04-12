package TP1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Produtos {

    private String produto;
    private int quantidade;

    public Produtos(String produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void cadastrarProdutos() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        Produtos[] info = new Produtos[n];

        List<String> historicoOperacoes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String produto = input.next().toLowerCase();
            int quantidadeEstoque = input.nextInt();
            info[i] = new Produtos(produto, quantidadeEstoque);
        }

        String produto = input.next().toLowerCase();

        while (!produto.equals("fim")) {
            boolean produtoEncontrado = false;
            int indiceEncontrado = -1;

            for (int i = 0; i < n; i++) {
                if (produto.equals(info[i].getProduto())) {
                    produtoEncontrado = true;
                    indiceEncontrado = i;
                    break;
                }
            }

            if (produtoEncontrado) {
                int quantidadeSaida = input.nextInt();
                info[indiceEncontrado].setQuantidade(info[indiceEncontrado].getQuantidade() - quantidadeSaida);
                historicoOperacoes.add(produto + " " + quantidadeSaida);

            } else {
                historicoOperacoes.add(produto + " produto não encontrado");

                if (input.hasNextInt()) {
                    input.nextInt();
                }
            }

            produto = input.next().toLowerCase();
        }

        for (String operacao : historicoOperacoes) {
            System.out.println(operacao);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(info[i].getProduto() + " " + info[i].getQuantidade());
        }

        input.close();
    }
}

public class Operacoes {
    public static void main(String[] args) {
        Produtos.cadastrarProdutos();
    }
}