package TP1.Heranca;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Contato {

    protected String nome;
    protected String apelido;
    protected String email;
    protected String aniversario;

    public Contato(String nome, String apelido, String email, String aniversario) {
        this.nome = nome;
        this.apelido = apelido;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public String imprimirBasico(){
        return  "Nome: " + getNome() + "\n" +
                "Apelido: " + getApelido() + "\n" +
                "Email: " + getEmail() + "\n" +
                "Aniversário: " + getAniversario() + "\n";
    }

    public abstract String imprimirContato();
}


class Amigo extends Contato {

    protected int grau;

    public Amigo(String nome, String apelido, String email, String aniversario, int grau) {
        super(nome, apelido, email, aniversario);
        this.grau = grau;

    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    @Override
    public String imprimirContato() {
        String nomeGrau;

        if (getGrau() == 1) {
            nomeGrau = "Melhor Amigo";

        } else if (getGrau() == 2) {
            nomeGrau = "Amigo";

        } else {
            nomeGrau = "Conhecido";
        }

        return  super.imprimirBasico() +
                "Grau: " + nomeGrau;
    }
}


class Familia extends Contato {

    protected String parentesco;

    public Familia(String nome, String apelido, String email, String aniversario, String parentesco) {
        super(nome, apelido, email, aniversario);
        this.parentesco = parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public String imprimirContato() {
        return    super.imprimirBasico() +
                "Parentesco: " + getParentesco();
    }
}


class ColegasDeTrabalho extends Contato {

    protected String tipo;

    public ColegasDeTrabalho(String nome, String apelido, String email, String aniversario, String tipo) {
        super(nome, apelido, email, aniversario);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String imprimirContato() {
        return  super.imprimirBasico() +
                "Relacionamento de trabalho: " + getTipo();
    }
}


public class UsoContatos {
    static Scanner input = new Scanner(System.in);

    public static void buscaPor(ArrayList<Contato> contatos, Class<? extends Contato> tipo){
        for (Contato contato : contatos){
            if (tipo.isInstance(contato)) {
                System.out.println(contato.imprimirContato());
            }
        }
    }


    public static void instanciaClasse(int tipo, ArrayList<Contato> contatos){

        switch (tipo) {
            case 1:
                Amigo amigo = new Amigo(input.next(), input.next(), input.next(), input.next(), input.nextInt());
                contatos.add(amigo);
                break;

            case 2:
                Familia familia = new Familia(input.next(), input.next(), input.next(), input.next(), input.next());
                contatos.add(familia);
                break;

            case 3:
                ColegasDeTrabalho colega = new ColegasDeTrabalho(input.next(), input.next(), input.next(), input.next(), input.next());
                contatos.add(colega);
                break;
        }
    }


    public static void imprimeEspecifico(ArrayList<Contato> contatos){

        for (Contato contato : contatos){
            if ((contato instanceof Amigo && ((Amigo) contato).getGrau() == 1) ||
                contato instanceof Familia && (((Familia) contato).getParentesco().equalsIgnoreCase("irmão")) ||
                contato instanceof ColegasDeTrabalho && (((ColegasDeTrabalho) contato).getTipo().equalsIgnoreCase("colega"))) {

                System.out.println(contato.imprimirContato());
            }
        }

    }


    public static void main(String[] args) {

        ArrayList<Contato> contatos = new ArrayList<>();

        int menu = 0;

        while (menu != 8){
            menu = input.nextInt();

            switch (menu) {

                case 1:
                    int tipo = input.nextInt();
                    instanciaClasse(tipo, contatos);
                    break;


                case 2:
                    for (Contato contato : contatos){
                        System.out.println(contato.imprimirContato());
                    }
                    break;


                case 3:
                    buscaPor(contatos, Familia.class);
                    break;


                case 4:
                    buscaPor(contatos, Amigo.class);
                    break;


                case 5:
                    buscaPor(contatos, ColegasDeTrabalho.class);
                    break;


                case 6:
                    imprimeEspecifico(contatos);
                    break;


                case 7:
                    int index = input.nextInt();
                    System.out.println(contatos.get(index - 1).imprimirContato());
                    break;

                case 8:
                    break;

                default:
                    System.out.println("erro");
            }
        }
    }
}
