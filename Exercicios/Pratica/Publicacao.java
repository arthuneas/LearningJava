package Exercicios.Pratica;

public interface Publicacao {

    //todo metodo da interface é public abstract
    void abrir();
    void fechar();
    void folhear(int pagAtual);
    void avancarPag();
    void voltarPag();

}
