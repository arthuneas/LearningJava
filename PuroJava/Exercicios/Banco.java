package Exercicios;

public class Banco {

    //atributos
    private int numeroConta;
    private float saldo;
    private String titular;


    //constructor
    public Banco(int numeroConta, String titular) {
       setNumeroConta(numeroConta);
       setTitular(titular);
       setSaldo(0);

    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return saldo;
    }

     private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    public void depositar(float valor){
        setSaldo(getSaldo() + valor);
        System.out.printf("Valor de %.2f Depositado com Sucesso!\n", valor);
    }

    public void sacar(float valor){

        if (getSaldo() >= valor){
            setSaldo(getSaldo() - valor);
            System.out.printf("Saque de %.2f realizado com sucesso!\n", valor);

        } else  {
            System.out.println("Saldo insuficiente!");

        }
    }

}
