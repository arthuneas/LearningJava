package Exercicios;
import java.awt.Dimension;
import java.awt.Toolkit;

public class resolution { 
    public static void main(String[] args) {
        
        Toolkit tk = Toolkit.getDefaultToolkit();

        int resolution = tk.getScreenResolution();
        Dimension tamanho = tk.getScreenSize();

        int altura = tamanho.height;
        int largura = tamanho.width;

        System.out.println("A resolução da tela é " + largura + " x " + altura);
        System.out.println("A resolução da tela por DPI é " + resolution);
    }
}