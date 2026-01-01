package JavaBasico;

public class Operacoes {

    public String contador(int inicio, int fim){
        String s = "";
        for (int i = inicio; i <= fim; i++){
            s += i + " ";
        }
        return s;
    }

    public static int subtracao(int inicio, int fim){

        return inicio - fim;
    }

    public static int sum(int inicio, int fim){

        return inicio + fim;
    }

    public static double division(int inicio, int fim) {
        double v = (double) inicio / fim;
        return v;
    }

    //esse objeto não pode ser usado
    private static int exponencial(int inicio, int fim) {
        return (int) Math.pow(inicio, fim);
    }

}
