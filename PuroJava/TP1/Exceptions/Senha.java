package TP1.Exceptions;

import java.util.Scanner;

class ValidarSenha {

    public void verificarMaiusculas(String senha){
        boolean verificador = false;

        for (int i = 0; i < senha.length(); i++){
            if(Character.isUpperCase(senha.charAt(i))) {
                verificador = true;
                break;
            }
        }

        if (!verificador) {
            throw new IllegalArgumentException("Erro: a senha deve conter pelo menos uma letra maiúscula");

        }
    }
}

public class Senha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ValidarSenha validacao = new ValidarSenha();


        while (true) {
            String input = entrada.nextLine();

            try {
                validacao.verificarMaiusculas(input);
                System.out.println("Senha válida");
                break;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            }
        }
        entrada.close();
    }
}
