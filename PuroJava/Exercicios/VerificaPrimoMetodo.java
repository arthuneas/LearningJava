package Exercicios;

public class VerificaPrimoMetodo {
    public static boolean primo(int n){

        boolean prim = true;

        if(n == 1){
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prim = false;
            }
        }

        return prim;
    }
}
