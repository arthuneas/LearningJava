package JavaPlus.Intermediário;

import java.util.*;

public class generics<E extends pintavel> {
    private E coisaQueVouPintar;

    private List<E> coisasQueVouPintar;

    private String tipo;

    private String marca;

    private String preco;


    public generics(E coisaQueVouPintar, String tipo, String marca, String preco) {
        this.coisaQueVouPintar = coisaQueVouPintar;
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
    }

    public void pintar(){
        this.coisaQueVouPintar.aplicarTinta();
    }

}
