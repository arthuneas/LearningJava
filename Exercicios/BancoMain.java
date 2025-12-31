package Exercicios;

public class BancoMain {
    public static void main(String[] args) {

        Banco cliente = new Banco(1234, "Ana");

        System.out.println(cliente.getSaldo());
        cliente.depositar(500);
        System.out.println(cliente.getSaldo());
        cliente.sacar(200);
        System.out.println(cliente.getSaldo());
        //erro
        cliente.sacar(2000);
        System.out.println(cliente.getSaldo());

    }
}
