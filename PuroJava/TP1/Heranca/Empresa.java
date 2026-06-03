package TP1.Heranca;

import java.util.Scanner;

interface Classificavel {
    boolean menorElemento(Classificavel classificavel);
}


class Classificador {

    public void ordena(Classificavel[] a){
        Classificavel elem, menor;
        int pos;


        for (int i = 0; i < a.length - 1; i++){
            elem = a[i];
            menor = a[i + 1];
            pos = i + 1;

            for (int j = i + 2; j < a.length; j++) {
                if (a[j].menorElemento(menor)) {
                    menor = a[j];
                    pos = j;

                }
            }

            if (menor.menorElemento(elem)) {
                a[i] = a[pos];
                a[pos] = elem;
            }
        }
    }
}


//Informe o código aqui
class Produto implements Classificavel {
    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }


    @Override
    public boolean menorElemento(Classificavel obj) {
        Produto compara = (Produto) obj;

        return this.codigo < compara.codigo;
    }
}


//Informe o código aqui
class Cliente implements Classificavel {
    private String cpf;
    private String nome;
    private String endereco;

    public Cliente(String cpf, String nome, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public boolean menorElemento(Classificavel obj) {
        Cliente compara = (Cliente) obj;

        return this.cpf < compara.cpf;
    }
}

class Servico implements Classificavel {
    private double preco;
    private String data;
    private String tipoServico;

    public Servico(String data, double preco, String tipoServico) {
        this.preco = preco;
        this.data = data;
        this.tipoServico = tipoServico;
    }

    @Override
    public boolean menorElemento(Classificavel obj) {
        Produto compara = (Servico) obj;

        return this.codigo < compara.codigo;
    }
}


//Classe principal
public class Empresa {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Classificador classifica = new Classificador();

        int numProduto = entrada.nextInt();
        int numCliente = entrada.nextInt();
        int numServico = entrada.nextInt();

        Produto[] produtos = new Produto[numProduto];

        for(int i = 0; i < numProduto; i++){
            produtos[i] = new Produto(entrada.nextInt(), entrada.next(), entrada.nextDouble());
        }

        Cliente[] clientes = new Cliente[numCliente];

        for(int i = 0; i < numCliente; i++){
            clientes[i] = new Cliente(entrada.next(), entrada.next(), entrada.next());
        }

        Servico[] servicos = new Servico[numServico];

        for(int i = 0; i < numServico; i++){
            servicos[i] = new Servico(entrada.next(), entrada.nextDouble(), entrada.next());
        }

        classifica.ordena(produtos);
        classifica.ordena(clientes);
        classifica.ordena(servicos);

        for(int i = 0; i < numProduto; i++) {
            System.out.println(produtos[i].toString());
        }

        for(int i = 0; i < numCliente; i++) {
            System.out.println(clientes[i].toString());
        }

        for(int i = 0; i < numServico; i++) {
            System.out.println(servicos[i].toString());
        }

    }

}